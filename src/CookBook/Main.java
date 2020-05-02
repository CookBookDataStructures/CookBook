package CookBook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;




public class Main {
	
	public static BinarySearchTree bstStarter = new BinarySearchTree();
	public static BinarySearchTree bstMainMeal = new BinarySearchTree();
	public static BinarySearchTree bstDessert = new BinarySearchTree();
	
	public static String line = null;
	
	public static void createTrees() {
		try{
			 FileReader fileReader =  new FileReader("saveStarter.txt");
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			  
			while((line = bufferedReader.readLine()) != null) {
				
				String[] parts = line.split("-");
				
					Recipe recipeStarter = new Recipe();
					for (int i = 0; i < parts.length/3; i=i+3) {
						recipeStarter.setName(parts[i]);
						recipeStarter.setRecipe(parts[i+1]);
						recipeStarter.setType(parts[i+2]);
					}
					bstStarter.insert(recipeStarter);	
				
			}
			bstStarter.inorderTraversal();
			
			
		} catch (IOException e) {
           e.printStackTrace();
       }
		
		
		
		try{
			 FileReader fileReader =  new FileReader("saveMainMeal.txt");
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			  
			while((line = bufferedReader.readLine()) != null) {
				
				String[] parts = line.split("-");
				
					Recipe recipeMainMeal = new Recipe();
					for (int i = 0; i < parts.length/3; i=i+3) {
						recipeMainMeal.setName(parts[i]);
						recipeMainMeal.setRecipe(parts[i+1]);
						recipeMainMeal.setType(parts[i+2]);
					}
					bstMainMeal.insert(recipeMainMeal);
				
				
			}
			bstMainMeal.inorderTraversal();
			
			
		} catch (IOException e1) {
           e1.printStackTrace();
       }
		
		try{
			 FileReader fileReader =  new FileReader("saveDessert.txt");
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			  
			while((line = bufferedReader.readLine()) != null) {
				
				String[] parts = line.split("-");
				
					Recipe recipeDessert = new Recipe();
					for (int i = 0; i < parts.length/3; i = i+3) {
						recipeDessert.setName(parts[i]);
						recipeDessert.setRecipe(parts[i+1]);
						recipeDessert.setType(parts[i+2]);
					}
					bstDessert.insert(recipeDessert);
				
				
			}
			bstDessert.inorderTraversal();
			
			
		} catch (IOException e2) {
           e2.printStackTrace();
       }
	}
	
	public static void main(String[] args) {
		createTrees();
		WelcomePage welcomePage = new WelcomePage();
		

		
	}

}
