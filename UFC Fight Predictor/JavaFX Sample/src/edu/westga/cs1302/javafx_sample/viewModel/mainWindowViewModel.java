package edu.westga.cs1302.javafx_sample.viewModel;

import edu.westga.cs1302.javafx_sample.model.Fighter;
import edu.westga.cs1302.javafx_sample.model.StyleAdvantage;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

/**
 * Codebehind for the MainWindow of the Application.
 * 
 * @author Kenneth Dearman
 * @version Fall 2024
 */
public class mainWindowViewModel {
	public final double eValue = Math.E;

	private StringProperty nameFighter1;
	private StringProperty ageFighter1;
	private StringProperty heightFighter1;
	private StringProperty reachFighter1;
	private ListProperty<String> styleOfFighters;
	private StringProperty selectedStyleFighter1;

	private StringProperty nameFighter2;
	private StringProperty ageFighter2;
	private StringProperty heightFighter2;
	private StringProperty reachFighter2;
	private StringProperty selectedStyleFighter2;

	private ListProperty<String> weightClass;
	private StringProperty selectedWeightClass;
	private StyleAdvantage styleAdvantage;

	public mainWindowViewModel() {
		this.nameFighter1 = new SimpleStringProperty();
		this.ageFighter1 = new SimpleStringProperty();
		this.heightFighter1 = new SimpleStringProperty();
		this.reachFighter1 = new SimpleStringProperty();
		this.selectedStyleFighter1 = new SimpleStringProperty();
		this.styleOfFighters = new SimpleListProperty<String>(FXCollections.observableArrayList("BJJ",
				"Boxing", "Hybrid (No Specialty)", "Karate", "KickBoxing", "Muay Thai", "Wrestling"));

		this.nameFighter2 = new SimpleStringProperty();
		this.ageFighter2 = new SimpleStringProperty();
		this.heightFighter2 = new SimpleStringProperty();
		this.reachFighter2 = new SimpleStringProperty();
		this.selectedStyleFighter2 = new SimpleStringProperty();

		this.weightClass = new SimpleListProperty<String>(FXCollections.observableArrayList("115 lbs", "125 lbs",
				"135 lbs", "145 lbs", "155 lbs", "170 lbs", "180 lbs", "205 lbs", "206 - 265 lbs"));
		this.selectedWeightClass = new SimpleStringProperty();

		this.styleAdvantage = new StyleAdvantage();

	}

	/**
	 * gets the name of the fighter
	 * 
	 * @return the name of the fighter
	 */
	public StringProperty getNameFighter1() {
		return this.nameFighter1;
	}

	/**
	 * gets the age of the fighter
	 * 
	 * @return the age of the fighter
	 */
	public StringProperty getAgeFighter1() {
		return this.ageFighter1;
	}

	/**
	 * gets the height of the fighter
	 * 
	 * @return the height of the fighter
	 */
	public StringProperty getHeightFighter1() {
		return this.heightFighter1;
	}

	/**
	 * gets the reach of the fighter
	 * 
	 * @return the reach of the fighter
	 */
	public StringProperty getReachFighter1() {
		return this.reachFighter1;
	}

	/**
	 * gets the style list
	 * 
	 * @return the style list
	 */
	public ListProperty<String> getStyleOfFighters() {
		return this.styleOfFighters;
	}

	/**
	 * gets the selected style of the fighter
	 * 
	 * @return the selected style of the fighter
	 */
	public StringProperty getSelectedStyleFighter1() {
		return this.selectedStyleFighter1;
	}

	////Fighter2
	/**
	 * gets the name of the fighter
	 * 
	 * @return the name of the fighter
	 */
	public StringProperty getNameFighter2() {
		return this.nameFighter2;
	}

	/**
	 * gets the age of the fighter
	 * 
	 * @return the age of the fighter
	 */
	public StringProperty getAgeFighter2() {
		return this.ageFighter2;
	}

	/**
	 * gets the height of the fighter
	 * 
	 * @return the height of the fighter
	 */
	public StringProperty getHeightFighter2() {
		return this.heightFighter2;
	}

	/**
	 * gets the reach of the fighter
	 * 
	 * @return the reach of the fighter
	 */
	public StringProperty getReachFighter2() {
		return this.reachFighter2;
	}

	/**
	 * gets the selected style of the fighter
	 * 
	 * @return the selected style of the fighter
	 */
	public StringProperty getSelectedStyleFighter2() {
		return this.selectedStyleFighter2;
	}

	/**
	 * gets the weight class list
	 * 
	 * @return the weight class list
	 */
	public ListProperty<String> getWeightClass() {
		return this.weightClass;
	}

	/**
	 * gets the selected weight class of the fighters
	 * 
	 * @return the selected weight class of the fighters
	 */
	public StringProperty getSelectedWeightClass() {
		return this.selectedWeightClass;
	}
	
	/**
	 * Compares the fighters 
	 * 
	 * @return the projected winner of the fight
	 */
	public String compareFighters() {
		String name1 = this.getNameFighter1().get();
		int age1 = Integer.parseInt(this.getAgeFighter1().getValue());
		int height1 = this.convertToInches(this.getHeightFighter1().getValue());
		double reach1 = Double.parseDouble(this.getReachFighter1().getValue());
		String style1 = this.getSelectedStyleFighter1().get();
		
		String weightClass = this.getSelectedWeightClass().getValue();
		
		String name2 = this.getNameFighter2().get();
		int age2 = Integer.parseInt(this.getAgeFighter2().getValue());//parse null string 
		int height2 = this.convertToInches(this.getHeightFighter2().getValue());
		double reach2 = Double.parseDouble(this.getReachFighter2().getValue());
		String style2 = this.getSelectedStyleFighter2().get();
		
		Fighter fighter1 = new Fighter(name1, age1, height1, reach1, style1, weightClass);
		Fighter fighter2 = new Fighter(name2, age2, height2, reach2, style2, weightClass);
		
		return this.getPredictedWinner(fighter1, fighter2);
		
	}
	

	/**
	 * Gets the winner of the fight
	 * 
	 * @param fighter1 the fighter1 entered
	 * @param fighter2 the fighter2 entered
	 * @return the string that displays the winner and his/her percent chance to win
	 */
	public String getPredictedWinner(Fighter fighter1, Fighter fighter2) {
		// Get probabilities
		int fighter1Prob = this.findFighter1Probability(fighter1, fighter2);
		int fighter2Prob = 100 - fighter1Prob;

		// Determine the winner
		if (fighter1Prob > fighter2Prob) {
			return fighter1.getName() + " has a predicted probability to win by " + fighter1Prob + "%";
		} else if (fighter1Prob < fighter2Prob) {
			return fighter2.getName() + " has a predicted probability to win by " + fighter2Prob + "%";
		} else {
			return "Both fighters have an equal chance of winning the fight (" + fighter1Prob + "% each)";
		}
	}

	private int findFighter1Probability(Fighter fighter1, Fighter fighter2) {
		double reachDifference = 0.35 * (fighter1.getReach() - fighter2.getReach());
		double heightDifference = 0.25
				* (fighter1.getHeight() - fighter2.getHeight());
		double styleAdvantage = 0.3
				* this.styleAdvantage.findStyleAdvantageFighter1(fighter1.getStyle(), fighter2.getStyle());
		double ageDifference = -0.1 * (fighter1.getAge() - fighter2.getAge());

		double s = reachDifference + heightDifference + styleAdvantage + ageDifference;

		double reachDifferenceT = 0.35 * (fighter2.getReach() - fighter1.getReach());
		double heightDifferenceT = 0.25
				* (fighter2.getHeight() - fighter1.getHeight());
		double styleAdvantageT = 0.3
				* this.styleAdvantage.findStyleAdvantageFighter2(fighter1.getStyle(), fighter2.getStyle());
		double ageDifferenceT = -0.1 * (fighter2.getAge() - fighter1.getAge());

		double t = reachDifferenceT + heightDifferenceT + styleAdvantageT + ageDifferenceT;

		double probability = Math.pow(this.eValue, s) / (Math.pow(this.eValue, s) + Math.pow(this.eValue, t));

		return (int) (probability * 100);
	}

	public int convertToInches(String height) {
		String[] line = height.split(",");
		int feet = Integer.parseInt(line[0]);
		int inches = Integer.parseInt(line[1]);
		if (inches > 11) {
			throw new IllegalArgumentException("Too many inches. Inches cannot be greater than 12.");
		}
		int feetInInches = feet * 12;
		return feetInInches + inches;
	}
}
