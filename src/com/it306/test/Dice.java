package com.it306.test;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Dice roll method returns a random number between 1 and 6
 * @author Amith Kini
 *
 */

public class Dice {
	int roll() {
		return ThreadLocalRandom.current().nextInt(1, 7);
	}
}
