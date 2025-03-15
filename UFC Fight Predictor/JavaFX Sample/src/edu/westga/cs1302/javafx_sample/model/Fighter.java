package edu.westga.cs1302.javafx_sample.model;

/**
 * The Fighter Class​
 * 
 * @author Kenneth Dearman​
 * @version Fall 2024​
 */
public class Fighter {
	private String name;
	private int age;
	private int height;
	private double reach;
	private String style;
	private String weightClass;

	/**
	 * Creates a new instance of fighter
	 * 
	 * @precondition name != null || !name.isEmpty() || !name.isBlank() || age > 0
	 *               || height > 0.0 || reach > 0.0
	 * @postcondition none
	 * 
	 * @param name        the name of the fighter
	 * @param age         the age of the fighter
	 * @param height      the height of the fighter
	 * @param reach       the reach of the fighter
	 * @param style       the style of the fighter
	 * @param weightClass the weight class of the fighter
	 */
	public Fighter(String name, int age, int height, double reach, String style, String weightClass) {
		if (name == null) {
			throw new IllegalArgumentException("Name cannot be null");
		}
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		if (name.isBlank()) {
			throw new IllegalArgumentException("Name cannot be blank");
		}
		if (age < 1) {
			throw new IllegalArgumentException("Age cannot be less than 1");
		}
		if (height < 1) {
			throw new IllegalArgumentException("Height cannot be less than 1");
		}
		if (reach < 1.0) {
			throw new IllegalArgumentException("Reach cannot be less than 1");
		}

		this.name = name;
		this.age = age;
		this.height = height;
		this.reach = reach;
		this.style = style;
		this.weightClass = weightClass;
	}

	/**
	 * gets the name of the fighter
	 * 
	 * @return the name of the fighter
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * gets the age of the fighter
	 * 
	 * @return the age of the fighter
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * gets the height of the fighter
	 * 
	 * @return the height of the fighter
	 */
	public int getHeight() {
		return this.height;
	}

	/**
	 * gets the reach of the fighter
	 * 
	 * @return the reach of the fighter
	 */
	public double getReach() {
		return this.reach;
	}

	/**
	 * gets the style of the fighter
	 * 
	 * @return the style of the fighter
	 */
	public String getStyle() {
		return this.style;
	}

	/**
	 * gets the weight class of the fighter
	 * 
	 * @return the weight class of the fighter
	 */
	public String getWeightClass() {
		return this.weightClass;
	}
}
