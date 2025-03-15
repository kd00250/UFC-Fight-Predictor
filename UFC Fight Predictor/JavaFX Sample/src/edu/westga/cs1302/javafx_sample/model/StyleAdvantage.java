package edu.westga.cs1302.javafx_sample.model;

/**
 * The Style Advantage class​
 * 
 * @author Kenneth Dearman​
 * @version Fall 2024​
 */
public class StyleAdvantage {

	/**
	 * Creates a new instance of style advantage
	 */
	public StyleAdvantage() {

	}

	/**Gets the advantage odds for the fist fighter
	 * 
	 * @param style1 the style of the first fighter
	 * @param style2 the style of the second fighter
	 * @return the advantage odds (0,+1,-1) of each match up for the first fighter
	 */
	public int findStyleAdvantageFighter1(String style1, String style2) {
		if (style1.equals(style2)) {
			return 0;
		}
		if (style1.equals("Hybrid") || style2.equals("Hybrid")) {
			return 0;
		}
		if (style1.equals("Wrestling")) {
			return this.wrestlerAdvantage(style1, style2);
		}
		if (style1.equals("BJJ")) {
			return this.bjjAdvantage(style1, style2);
		}
		if (style1.equals("Muay Thai")) {
			return this.muayThaiAdvantage(style1, style2);
		}
		if (style1.equals("Karate")) {
			return this.karateAdvantage(style1, style2);
		}
		if (style1.equals("KickBoxing")) {
			return this.kickBoxingAdvantage(style1, style2);
		}
		if (style1.equals("Boxing")) {
			return this.boxingAdvantage(style1, style2);
		} 
		return 0;
	}
	
	/**Gets the advantage odds for the second fighter
	 * 
	 * @param style1 the style of the first fighter
	 * @param style2 the style of the second fighter
	 * @return the advantage odds (0,+1,-1) of each match up for the second fighter
	 */
	public int findStyleAdvantageFighter2(String style1, String style2) {
		if (style1.equals(style2)) {
			return 0;
		}
		if (style1.equals("Hybrid") || style2.equals("Hybrid")) {
			return 0;
		}
		if (style2.equals("Wrestling")) {
			return this.wrestlerAdvantage(style1, style2);
		}
		if (style2.equals("BJJ")) {
			return this.bjjAdvantage(style1, style2);
		}
		if (style2.equals("Muay Thai")) {
			return this.muayThaiAdvantage(style1, style2);
		}
		if (style2.equals("Karate")) {
			return this.karateAdvantage(style1, style2);
		}
		if (style2.equals("KickBoxing")) {
			return this.kickBoxingAdvantage(style1, style2);
		}
		if (style2.equals("Boxing")) {
			return this.boxingAdvantage(style1, style2);
		} 
		return 0;
	}

	private int wrestlerAdvantage(String style1, String style2) {
		if (style1.equals("BJJ") || style2.equals("BJJ")) {
			return -1;
		}
		if (style1.equals("Muay Thai") || style2.equals("Muay Thai")) {
			return 1;
		}
		if (style1.equals("Karate") || style2.equals("Karate")) {
			return 1;
		}
		if (style1.equals("KickBoxing") || style2.equals("KickBoxing")) {
			return 1;
		}
		if (style1.equals("Boxing") || style2.equals("Boxing")) {
			return 1;
		}
		if (style1.equals("Hybrid") || style2.equals("Hybrid")) {
			return 0;
		} else {
			return 0;
		}

	}

	private int bjjAdvantage(String style1, String style2) {
		if (style1.equals("Wrestling") || style2.equals("Wrestling")) {
			return -1;
		}
		if (style1.equals("Muay Thai") || style2.equals("Muay Thai")) {
			return 1;
		}
		if (style1.equals("Karate") || style2.equals("Karate")) {
			return 1;
		}
		if (style1.equals("KickBoxing") || style2.equals("KickBoxing")) {
			return 1;
		}
		if (style1.equals("Boxing") || style2.equals("Boxing")) {
			return 1;
		}
		if (style1.equals("Hybrid") || style2.equals("Hybrid")) {
			return 0;
		} else {
			return 0;
		}
	}

	private int muayThaiAdvantage(String style1, String style2) {
		if (style1.equals("BJJ") || style2.equals("BJJ")) {
			return -1;
		}
		if (style1.equals("Wrestling") || style2.equals("Wrestling")) {
			return -1;
		}
		if (style1.equals("Karate") || style2.equals("Karate")) {
			return 1;
		}
		if (style1.equals("KickBoxing") || style2.equals("KickBoxing")) {
			return 1;
		}
		if (style1.equals("Boxing") || style2.equals("Boxing")) {
			return 1;
		}
		if (style1.equals("Hybrid") || style2.equals("Hybrid")) {
			return 0;
		} else {
			return 0;
		}

	}
	
	private int karateAdvantage(String style1, String style2) {
		if (style1.equals("BJJ") || style2.equals("BJJ")) {
			return -1;
		}
		if (style1.equals("Muay Thai") || style2.equals("Muay Thai")) {
			return -1;
		}
		if (style1.equals("Wrestling") || style2.equals("Wrestling")) {
			return -1;
		}
		if (style1.equals("KickBoxing") || style2.equals("KickBoxing")) {
			return -1;
		}
		if (style1.equals("Boxing") || style2.equals("Boxing")) {
			return 1;
		}
		if (style1.equals("Hybrid") || style2.equals("Hybrid")) {
			return 0;
		} else {
			return 0;
		}
	}
	
	private int kickBoxingAdvantage(String style1, String style2) {
		if (style1.equals("BJJ") || style2.equals("BJJ")) {
			return -1;
		}
		if (style1.equals("Muay Thai") || style2.equals("Muay Thai")) {
			return -1;
		}
		if (style1.equals("Karate") || style2.equals("Karate")) {
			return 1;
		}
		if (style1.equals("Wrestling") || style2.equals("Wrestling")) {
			return -1;
		}
		if (style1.equals("Boxing") || style2.equals("Boxing")) {
			return 1;
		}
		if (style1.equals("Hybrid") || style2.equals("Hybrid")) {
			return 0;
		} else {
			return 0;
		}

	}
	
	private int boxingAdvantage(String style1, String style2) {
		if (style1.equals("BJJ") || style2.equals("BJJ")) {
			return -1;
		}
		if (style1.equals("Muay Thai") || style2.equals("Muay Thai")) {
			return -1;
		}
		if (style1.equals("Karate") || style2.equals("Karate")) {
			return -1;
		}
		if (style1.equals("KickBoxing") || style2.equals("KickBoxing")) {
			return -1;
		}
		if (style1.equals("Wrestling") || style2.equals("Wrestling")) {
			return -1;
		}
		if (style1.equals("Hybrid") || style2.equals("Hybrid")) {
			return 0;
		} else {
			return 0;
		}

	}

}
