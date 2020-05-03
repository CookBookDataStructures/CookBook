package CookBook;

public class Recipe {
	
	private String type;
	private String name;
	private String recipe;
	boolean liked;
	
	Recipe( String name, String recipe, String type){
		this.name = name;
		this.recipe = recipe;
		this.type = type;
		
	}
	
	Recipe(){
		super();
	}
	
	public String getName() {
		return name;
	}
	
	public String getRecipe() {
		return recipe;
	}
	
	public String getType() {
		return type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	
	public void setType(String type) {
		this.type = type;
	}	
}
