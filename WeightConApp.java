/*
C Odoemene
WeightConApp.java
04 09 2020
*/

import java.util.*;
public class WeightConApp {
	public static void main (String [] args){

	double kgram;
	double gram;
	double stone;
	double pound;

	Scanner keyboard;
	keyboard = new Scanner(System.in);

	WeightCon myWeightCon;
	myWeightCon = new WeightCon();


	System.out.println("Please enter the weight in kilograms ");
	kgram = keyboard.nextDouble() ;
	myWeightCon.setKgram(kgram);

	myWeightCon.compute();

	gram = myWeightCon.getGram();
	stone = myWeightCon.getStone();
	pound = myWeightCon.getPound();

	System.out.println("Grams : "+gram);
	System.out.println("Stone : "+stone);
	System.out.println("Pounds : "+pound);


	}
}