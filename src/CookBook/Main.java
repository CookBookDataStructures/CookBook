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
	public static LikedLinkedList likedList = new LikedLinkedList();
	
	
	public static String line = null;
	
	public static void createTrees() {
		try{
			 FileReader fileReader =  new FileReader("saveStarter.txt");
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			  
			while((line = bufferedReader.readLine()) != null) {
				
				String[] parts = line.split("=");
				
					Recipe recipeStarter = new Recipe();
					for (int i = 0; i < parts.length/2; i=i+2) {
						recipeStarter.setName(parts[i]);
						recipeStarter.setRecipe(parts[i+1]);
					}
					recipeStarter.setType("Starter");
					bstStarter.insert(recipeStarter);	
				
			}
			fileReader.close();
			
		} catch (IOException e) {
           e.printStackTrace();
       }
		
		try{
			 FileReader fileReader =  new FileReader("saveMainMeal.txt");
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			  
			while((line = bufferedReader.readLine()) != null) {
				
				String[] parts = line.split("=");
				
					Recipe recipeMainMeal = new Recipe();
					for (int i = 0; i < parts.length/2; i=i+2) {
						recipeMainMeal.setName(parts[i]);
						recipeMainMeal.setRecipe(parts[i+1]);
						
					}
					recipeMainMeal.setType("Main Meal");
					bstMainMeal.insert(recipeMainMeal);
			}
			fileReader.close();
			
		} catch (IOException e1) {
           e1.printStackTrace();
       }
		
		try{
			 FileReader fileReader =  new FileReader("saveDessert.txt");
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			  
			while((line = bufferedReader.readLine()) != null) {
				
				String[] parts = line.split("=");
				
					Recipe recipeDessert = new Recipe();
					for (int i = 0; i < parts.length/2; i = i+2) {
						recipeDessert.setName(parts[i]);
						recipeDessert.setRecipe(parts[i+1]);
					}
					recipeDessert.setType("Dessert");
					bstDessert.insert(recipeDessert);
				
				
			}
			fileReader.close();
			
		} catch (IOException e2) {
           e2.printStackTrace();
       }
		
		try {
		FileReader fileReader = new FileReader("saveLiked.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while((line = bufferedReader.readLine()) != null) {
			
			String[] parts = line.split("=");
			
				Recipe recipe = new Recipe();
				for (int i = 0; i < parts.length/3; i = i+3) {
					recipe.setName(parts[i]);
					recipe.setRecipe(parts[i+1]);
					recipe.setType(parts[i+2]);
					likedList.insertAtFront(recipe);
				}
				
			}fileReader.close();
		}
		catch(IOException e3) {
		  e3.printStackTrace();	
		}
	}
	
	public static void main(String[] args) {
		createTrees();
		WelcomePage welcomePage = new WelcomePage();
		
	}

}
