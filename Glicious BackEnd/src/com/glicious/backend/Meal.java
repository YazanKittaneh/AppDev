package com.glicious.backend;

import java.io.PrintWriter;

public class Meal {

	/*
	 * Fields
	 */
	String mealName;
	int numOfCal;
	int timesEaten;

	/*
	 * Constructor
	 */
	public Meal(String meal, int cal, int times) {
		this.mealName = meal;
		this.numOfCal = cal;
		this.timesEaten = times;
	} // Meal(String meal, int cal, int times)

	/*
	 * Methods
	 */
	public String getMeal() {
		return this.mealName;
	} // getMeal()

	public void setMeal(String newMeal) {
		this.mealName = newMeal;
	} // setMeal(String newMeal)

	public int getCal() {
		return this.numOfCal;
	}// getCal()

	public void setCal(int newCal) {
		this.numOfCal = newCal;
	}// setCal(int newCal)

	public int getTimes() {
		return this.timesEaten;
	}// getTimes()

	public void incrimentTimesEten() {
		this.timesEaten = this.timesEaten++;
	}// incrimentTimesEten()

	public void printMeal(PrintWriter pen) {
		pen.println("Meal Name: " + this.mealName);
		pen.println("Number of Calories: " + this.numOfCal);
		pen.println("Times eaten: " + this.timesEaten);
	}// printMeal()

	public static void main(String [ ] args)
	{
		PrintWriter pen = new PrintWriter(System.out, true);
		String meal="";
		int cal = 0;
		int times =0;
		Meal dhallMeal = new Meal(meal, cal, times);
		
		dhallMeal.setMeal("orange");
		dhallMeal.setCal(200);
		dhallMeal.incrimentTimesEten();
		dhallMeal.printMeal(pen);
		pen.println("");
		dhallMeal.setMeal("pizza");
		dhallMeal.setCal(1800);
		dhallMeal.incrimentTimesEten();
		dhallMeal.printMeal(pen);
		
	}
}
