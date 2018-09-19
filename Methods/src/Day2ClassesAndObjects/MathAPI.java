package Day2ClassesAndObjects;

import java.util.Arrays;

import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.moment.Mean;

public class MathAPI

/*
 *  Program output: 
Minimum, Median, Avarage and Maximum by using DescriptiveStatistics library methods:
 
The minimum price for ticket is $14.0
The median is $40.0
The average cheapest ticket is $46.684210526315795
The maximum price for ticket is $159.0
 
Minimum, Median, Avarage and Maximum by using regular for loop and if statement
 
Minimum price $14.0
Median 40.0
The average price $46.68421052631579
Maximum price $159.0
 * 
 */

{

	// this is one dimensional array that holds the cheapest ticket price data
	private static int[] ticketPrice = { 54, 159, 35, 57, 52, 49, 59, 33, 48, 33, 40, 14, 58, 37, 47, 33, 29, 25, 25 };

	// main method
	public static void main(String[] args) {

		
		System.out.println("Minimum, Median, Avarage and Maximum by using DescriptiveStatistics library methods:" );
		System.out.println(" ");
		System.out.println("The minimum price for ticket is $" + theMinimum());
		System.out.println("The median is $" + theMedian());
		System.out.println("The average cheapest ticket is $" + theAverageCheapestTicketPrice());
		System.out.println("The maximum price for ticket is $" + theMaximum());
		System.out.println(" ");
		System.out.println("Minimum, Median, Avarage and Maximum by using regular for loop and if statement");
		System.out.println(" ");
		System.out.println("Minimum price $" + theMInimumValue());
		System.out.println("Median " + getMedianValue());
		System.out.println("The average price $" + getAverage());
		System.out.println("Maximum price $" + theMaximumValue());
		
	} // end of main method

	
	// This method will return median by using Apache Commons Statistics class
	public static double theMedian() {

		DescriptiveStatistics stats = new DescriptiveStatistics();

		// Add the data from the array
		for (int i = 0; i < ticketPrice.length; i++) {
			stats.addValue(ticketPrice[i]);
		}
		double median = stats.getPercentile(50);
		return median;
	}

	// This method will return average value by using Apache Commons Statistics
	// class
	public static double theAverageCheapestTicketPrice() {
		DescriptiveStatistics stats = new DescriptiveStatistics();

		// Add the data from the array
		for (int i = 0; i < ticketPrice.length; i++) {
			stats.addValue(ticketPrice[i]);
		}
		double mean = stats.getMean();
		return mean;

	}

	// This method will return maximum value by using Apache Commons Statistics
	// class
	public static double theMaximum() {
		DescriptiveStatistics stats = new DescriptiveStatistics();

		// Add the data from the array
		for (int i = 0; i < ticketPrice.length; i++) {
			stats.addValue(ticketPrice[i]);
		}
		double max = stats.getMax();
		return max;
	}

	// This method will return minimum value by using Apache Commons Statistics
	// class
	public static double theMinimum() {
		DescriptiveStatistics stats = new DescriptiveStatistics();

		// Add the data from the array
		for (int i = 0; i < ticketPrice.length; i++) {
			stats.addValue(ticketPrice[i]);
		}
		double min = stats.getMin();
		return min;
	}

	// This is just another way to get maximum value
	public static double theMaximumValue() {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ticketPrice.length; i++) {
			if (ticketPrice[i] > max) {
				max = ticketPrice[i];
			}
		}

		return max;
	}

	// And this is just another way to get minimum value
	public static double theMInimumValue() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < ticketPrice.length; i++) {
			if (ticketPrice[i] < min) {
				min = ticketPrice[i];
			}
		}

		return min;

	}// end of theMInimumValue method

	public static double getAverage() {

		double sum = 0;
		for (int i = 0; i < ticketPrice.length; i++)
			sum += ticketPrice[i];

		double average = sum / ticketPrice.length;
		return average;
	}// end of getAverage method

	public static double getMedianValue() {
		Arrays.sort(ticketPrice); // sort the array using Arrays.class
		int middle = ticketPrice.length / 2; // Divide array into half
		int median = 0; // declare variable
		if (ticketPrice.length % 2 == 1)
			median = ticketPrice[middle];
		else
			median = (ticketPrice[middle - 1] + ticketPrice[middle]) / 2;
		return median;
	}

}// end of class
