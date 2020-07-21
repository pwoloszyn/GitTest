package com.mrcoffee.main;

import java.util.Random;

public class Operation {

	public static int random() {
		long seed = System.currentTimeMillis();
		Random rnd = new Random(seed);
		return rnd.nextInt(20) + 3;
	}
	
	public static void empty() {}
	
}
