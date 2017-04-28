package com.company;

import babies.Baby;

public class Main {

	public static void main(String[] args) {

		Mother mother = new Mother("Dorota");
		Baby myBaby = new Baby("Jonny", mother);



		myBaby.feed(1);
		//myBaby.feed(1);
		//myBaby.feed(1);
		//myBaby.feed(1);
		//myBaby.feed(1);
		//myBaby.feed(1);
		myBaby.poop();
		//myBaby.feed(1);
		//myBaby.feed(1);
		//myBaby.feed(1);
		//myBaby.poop();
	}
}
