package com.company;

import babies.Baby;

/**
 * Created by RENT on 2017-04-28.
 */
public class Mother {

	private String name;

	public String getName() {
		return name;
	}

	public Mother(String name) {
		this.name = name;
	}

	public void serviceBaby(Baby baby) {
		System.out.println("Baby serviced: " + baby.getName());
		baby.feed2(2, this);
	}
}
