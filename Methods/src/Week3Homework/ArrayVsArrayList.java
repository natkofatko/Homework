package Week3Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

/*Program output
 * 
 *	Regular Array with unsorted values 20  10  30  50  40  70  60  80  90  100 
 
	Regular array after sorting : [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
	This is an ArrayList : [John, Rigo, Stuart, George, Paul, Pete]
 
	Regular array has 10 elements
	ArrayList has assigned 6 elements
 
 	After removing some elements the size of the ArrayList is 4
 
	Our new Arraylist after adding new elements has changed the size to 9 [Rigo, George, Paul, Pete, Norman, Chase, Jimmy, Tommy, Stuart]
	Our new regular array after modification changed the size from 10 to 20
 
 	Rigo George Paul Pete Norman Chase Jimmy Tommy Stuart This is regular array after converting from ArrayList
 
 	This list contains different type of objects [125, String, true, s]
 *

 ADVANTAGES OF ARRAYLIST<>:
 * 
 * ArrayList has much more advantages than  a regular array. Both of them are used to store group of objects.
 * One of the biggest disadvantages of array is their fixed length. Once you create the array you can not change the size of it. 
 * Arrays are homogeneous, which means that it can store only one type of object. 
 * ArrayList can grow and shrink dynamically, so the size of if does not need to declared. 
 * In ArrayList Elements can be deleted or added at a particular position.
 * ArrayList can hold any type of objects (It is heterogeneous)  
 * ArrayList class has a lot of methods to perform different operations: add() remove() sort() addAl() fillAll() get() set() clear() iterator() and many more
 * Multiple insertion and removal operations on ArrayList will not decrease the performance of an application
 * ArrayList can hold duplicate elements, null elements. Can be traverse forward and backward using ListIterator.   
 */

//Ex.2 

/*Our intention is to increase the size of already existing array.  
* As we know, once we create an array we can not change the size of it.   
* If we want to increase the capacity of the particular array we have to create a new larger array and copy all existing data into it.  
* To do it we need to create a reference to an array which accept CD data type, using the new key word we create an larger array and assign its address.
* Use for loop to go through the all contest of the old array and copy it to the new bigger one.  
* 

 Ex.3 The statement is false. If we do not define any data type of ArrayList we can store any object we want to. ArrayList is heterogeneous. 
Example : 
public static void storeMoreThanOneObject()
{
ArrayList<Object>list = new ArrayList<>(); 
list.add(125);  //adding an integer to the list
list.add("String"); //adding String to the list
boolean tr = true; //adding boolean to the list
list.add(tr);
list.add('s'); 
System.out.println(list);
}

Ex.4  
*  a).This method removes the element "Pete" from the list and shifts any subsequent elements to the left, by subtracting one from the indices. 

b) Array class does not provide straightforward remove method like ArrayList. 

c) If we want to remove an object from the HashMap we need to use the key value of Key-value pair. 
	HashMap < key, value > bands = new HashMap < key, value > (); band.remove(key); 
	The remove method returns the previous value associated with key, or null if there is no mapping for key 

* d) List is a part of the Collections in Java. List represents an ordered list of objects. Each element in Java List has an index. 
* The first element of List has index 0, second 1 etc. Java List accepts any object. List can store mix objects of different types.    
*/

public class ArrayVsArrayList {

	private static int[] numbers;
	private static ArrayList<String> band;

	public static void main(String[] args) {

		/*
		 * Create an ArrayList of type String Create regular array of type
		 * String
		 */
		band = new ArrayList<String>();
		numbers = new int[10];

		// We add elements to the ArrayList by using add() method. We can add
		// elements in a couple of ways, based on our requirements
		// For example if we want to add the element to the end of the
		// ArrayList, we
		// can simply do this:
		band.add("Paul");
		band.add("Pete");

		// d) We can also add elements to the simple array in the beginning
		numbers[0] = 20;
		numbers[1] = 10;
		numbers[2] = 30;
		// And add elements to the end of the simple array
		numbers[(numbers.length) - 1] = 100;
		numbers[(numbers.length) - 2] = 90;
		numbers[(numbers.length) - 3] = 80;
		// If we want to add element at a specific location we need to specify
		// index in add method band.add(index, element);
		// Adding elements at the beginning of the ArrayList
		band.add(0, "John");
		band.add(1, "Rigo");
		band.add(2, "George");
		// Add elements to the middle of the simple array
		numbers[(numbers.length) / 2 - 2] = 50;
		numbers[(numbers.length) / 2 - 1] = 40;
		numbers[(numbers.length) / 2] = 70;
		numbers[(numbers.length) / 2 + 1] = 60;

		// Adding elements to the middle of the ArrayList
		int middle = (band.size()) / 2; // find a middle point of the array
		band.add(middle, "Stuart");

		// Printing a list

		for (int i = 0; i < numbers.length; i++)
			System.out.print(" " + numbers[i] + " "); // prints out list of
														// numbers
		System.out.println("Regular Array with unsorted values ");
		System.out.println(" ");

		Arrays.sort(numbers); // Sorts the number for regular array
		System.out.println("Regular array after sorting : " + Arrays.toString(numbers)); // prints
																							// out
																							// sorted
																							// numbers

		// Printing elements of an ArrayList
		System.out.println("This is an ArrayList : " + band);

		// Computing and printing the size of the list
		System.out.println(" ");
		System.out.println("Regular array has " + numbers.length + " elements");
		System.out.println("ArrayList has assigned " + band.size() + " elements");

		System.out.println(" ");

		// Removing a specific element from the Arraylist
		band.remove(0); // removing by index value

		band.remove("Stuart"); // removing element by object type

		System.out.println(" After removing some elements the size of the ArrayList is " + band.size());
		System.out.println(" ");

		// Changing the size of the arrays:
		// We do not need to change the capacity of the Arraylist.ArrayList has
		// a dynamic structure and it resizes itself automatically by adding a
		// new elements.
		// If we want to double the number of items the list can hold, we just
		// need to keep adding them
		band.add("Norman");
		band.add("Chase");
		band.add("Jimmy");
		band.add("Tommy");
		band.add("Stuart");

		// Printing a new list
		System.out.println(
				"Our new Arraylist after adding new elements has changed the size to " + band.size() + " " + band);

		// Creating a new larger array and copying the existing data into it
		int[] doubleSizeArray = new int[numbers.length * 2];
		for (int i = 0; i < numbers.length; i++) {
			doubleSizeArray[i] = numbers[i];
		}
		numbers = doubleSizeArray;
		System.out.println(
				"Our new regular array after modification changed the size from 10 " + "to " + doubleSizeArray.length);
		System.out.println(" ");

		// Converting an ArrayList to a normal array
		String[] converedList = new String[band.size()];
		converedList = band.toArray(converedList);
		for (int i = 0; i < converedList.length; i++)
			System.out.print(" " + converedList[i]);

		System.out.println(" This is regular array after converting from ArrayList");
		System.out.println(" ");

		// Using ArrayList to store different type of objects
		ArrayList<Object> list = new ArrayList<>();
		list.add(125); // adding an integer to the list
		list.add("String"); // adding String to the list
		boolean tr = true; // adding boolean to the list
		list.add(tr);
		list.add('s');
		System.out.println(" This list contains different type of objects " + list);

	}

	// This is a small example how we can use collections
	public static void Collections() {

		// Map<Integer, String> tree = new TreeMap<Integer, String>();
		// LinkedHashMap<Integer, String> hashLinkedMap = new LinkedHashMap<>();
		// Hashtable<Integer, String> dictionary = new Hashtable<>();
		// Stack<String> stack = new Stack<>();
		// Vector<Integer> vector = new Vector<>();
		// TreeSet<String> treeSet = new TreeSet<>();
		// PriorityQueue<String> priorityQ = new PriorityQueue<>();
		// List<String> list = new LinkedList<String>();
		// List<Integer> numbers = new ArrayList<Integer>();

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Pete");
		map.put(2, "Steve");
		map.put(4, "Kate");
		map.put(5, "Peter");
		map.put(6, "Alan");
		map.put(7, "Scott");

		map.size();
		map.isEmpty();
		map.get(1);
		map.remove(2);
		map.size();
		map.containsKey(7);
		map.values();
		map.containsValue("Scott");
		map.replace(5, "Joe");
		map.get(5);

	}
}
