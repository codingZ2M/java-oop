package com.purplewisteria.RecipeApp.repository.impl;

import com.purplewisteria.RecipeApp.domain.Recipe;
import com.purplewisteria.RecipeApp.domain.course.Course;

import com.purplewisteria.RecipeApp.repository.RecipeRepository;

public class RecipeCourseRepository implements RecipeRepository {

	@Override
	public String getRecipe(Recipe recipe) {
		
	
		Long id = recipe.getId();
		String category = recipe.getCategoryDetails();
		String menuName = ((Course)recipe).getMenuName(); // DOWN CASTING...... 
		String itemName = ((Course)recipe).getItemName(); // DOWN CASTING......
		
		String ingredients = recipe.showIngredients();
		String notes = recipe.showNotes();
		
		
		return "Recipe Id: "+ id + "\n" +
		        "Category: "+ category + "\n" +
		        "Menu Name: " + menuName + "\n" +
		        "Item Name: " + itemName + "\n" +
		        "Ingredients: " + ingredients + "\n" +
		        "Notes: " + notes + "\n";
	}


}
