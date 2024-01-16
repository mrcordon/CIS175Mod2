package model;

/**
 * @author Mike Cordon - mrcordon@dmacc.edu
 * CIS175 - Spring 2024
 * Jan 16, 2024
 */

public class Cats {
	//attributes
	private String name;
	private String color;
	private String breed;
	private double weight;
	/**
	 * 
	 */
	public Cats() {
		super();
	}
	public Cats(String name, String color, String breed, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	

}
