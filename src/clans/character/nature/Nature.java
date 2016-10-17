package clans.character.nature;

import java.util.Random;

import construction.point.Point;


public class Nature extends Point {

	final public static Nature SPITFIRE = new Nature(0.0,1.0);
	final public static Nature MELANCHOLIC = new Nature(-1.0,0.0);
	final public static Nature PHLEGMATIC = new Nature(0.0,-1.0);
	final public static Nature SANGUINE = new Nature(1.0,0.0);
	
	final private static Random RANDOM = new Random();
	private static final Double RANGE_MIN = -1.0;
	private static final Double RANGE_MAX = 1.0;
	

	 public Nature(double sociality, double fury) {
		super(sociality, fury);
	}


	public Nature() {
		super();
		this.x = getRandomNature();
		this.y = getRandomNature();
	}
	
	public void thinkMoreLike(Nature nature) {
		
	}
	
	private Double getRandomNature() {
		return RANGE_MIN + (RANGE_MAX - RANGE_MIN) * RANDOM.nextDouble();
	}
}
