package CookBook;

public class RecipeTree {
	
	 public Recipe recipe; 
	   public RecipeTree left, right;
	   
	   public RecipeTree(Recipe d) { 
	      recipe = d;
	      left = right = null;
	   }
	/*
	 * private TreeNode root; private int size;
	 * 
	 * public RecipeTree() { root = null; size = 0;
	 * 
	 * }
	 * 
	 * private TreeNode createNewNode(int e) { return new TreeNode(e); }
	 * 
	 * public int getSize() { return size; }
	 * 
	 * public TreeNode getRoot() { return root; }
	 * 
	 * 
	 * public boolean insert(int e) { if(root== null) root= createNewNode(e); else{
	 * TreeNode parent = null; TreeNode current = root;
	 * 
	 * while(current != null) if(e < current.getElement()) { parent =
	 * current;current = current.getLeft(); } else if(e > current.getElement()) {
	 * parent = current; current = current.getRight(); } else return false;
	 * 
	 * if(e < parent.getElement()) parent.setLeft(createNewNode(e));
	 * 
	 * else parent.setRight(createNewNode(e)); }
	 * 
	 * size++; return true; }
	 * 
	 * public void inorder(TreeNode root) { if (root == null) return;
	 * inorder(root.getLeft()); System.out.println(root.getElement()+" ");
	 * inorder(root.getRight());
	 * 
	 * }
	 * 
	 * public boolean search(int e) { TreeNode current = root; while(current !=
	 * null) { if(e < current.getElement()) current = current.getLeft(); else if(e >
	 * current.getElement()) current = current.getRight(); else return true; }
	 * return false; }
	 * 
	 * 
	 */


}



