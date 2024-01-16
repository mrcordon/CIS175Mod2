package model;

/**
 * @author Mike Cordon - mrcordon@dmacc.edu
 * CIS175 - Spring 2024
 * Jan 16, 2024
 */
public class Dogs {
	//attributes
	private String name;
	private String breed;
	private double weight;
	private boolean goodBoy;
	
	public Dogs() {
		super();
	}

	public Dogs(String name, String breed, double weight, boolean goodBoy) {
		super();
		this.name = name;
		this.breed = breed;
		this.weight = weight;
		this.goodBoy = goodBoy;
	}

	public Dogs(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public boolean isGoodBoy() {
		return goodBoy;
	}

	public void setGoodBoy(boolean goodBoy) {
		this.goodBoy = goodBoy;
	}
	
	
	public double howMuchFood() {
		// constants
		//dog size
		double XLARGE_LIMIT = 100.0;
		double LARGE_LIMIT = 50.0;
		double MEDIUM_LIMIT = 25.0;
		// amount of food
		double XLARGE_FOOD = 6.0;
		double LARGE_FOOD = 4.0;
		double MEDIUM_FOOD = 2.0;
		double SMALL_FOOD = 1.0;
		
		// variable
		double foodAmount = 0.0;
		
		if(this.weight > XLARGE_LIMIT) {
			foodAmount = XLARGE_FOOD;		
		} else if(this.weight > LARGE_LIMIT) {
			foodAmount = LARGE_FOOD;
		} else if(this.weight > MEDIUM_LIMIT) {
			foodAmount = MEDIUM_FOOD;
		} else {
			foodAmount = SMALL_FOOD;
		}
		
		return foodAmount;
		
	}

}
