/*
C Odoemene
WeightCon.java
04 09 2020
*/

public class WeightCon {

	private double kgram;
	private double gram ;
	private double stone ;
	private double pound ;

	public WeightCon() {

		kgram = 0.0;
		gram = 0.0;
		stone = 0.0;
		pound = 0.0;
	}

	public void setKgram(double kgram){
		this.kgram=kgram;
	}

	public void compute() {

		gram = kgram * 1000;
		stone = kgram * 0.157473;
		pound = kgram * 2.20462;
	}

	public double getGram(){
		return gram;
	}

	public double getStone(){
		return stone;
	}

	public double getPound(){
		return pound;
	}


}