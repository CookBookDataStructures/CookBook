package CookBook;

public class BinarySearchTree {
	private RecipeTree root;
	private int size;
	
	public RecipeTree getRoot() {
		return root;
	}
	public int getSize() {
		return size;
		}
	
	
	public void insert(Recipe recipe) {
		   if (root == null) {
		      root = new RecipeTree(recipe);
		      return;
		   }
		   RecipeTree loc = root;
		   while (true) {
			      if (recipe.getName().compareTo(loc.recipe.getName()) < 0) {
			         if (loc.left != null) loc = loc.left;
			         else { loc.left = new RecipeTree(recipe); 
			         size++;
			         break; }
			      }
			      else if (recipe.getName().compareTo(loc.recipe.getName()) > 0) {
			         if (loc.right != null) loc = loc.right;
			         else { loc.right = new RecipeTree(recipe);
			         size++;
			         break; }
			      }
			      else break;
	   }
	}

	   public void inorderTraversal() {inorderT(root); }
	   
	   private void inorderT(RecipeTree t) {
		      if (t != null) {
		         inorderT(t.left);
		         System.out.print(t.recipe.getName() + " ");
		         inorderT(t.right);
		      }
		   }
	   
	   
	  //public 
	  
	   
	

}
