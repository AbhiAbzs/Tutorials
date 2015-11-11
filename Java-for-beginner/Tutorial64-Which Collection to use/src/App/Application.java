package App;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Application {
	
	///////// LIST ////////
	/// Store lists of objects
	/// Duplicated items are allowed 
	/// Objects remain in order
	/// Elements are index via integer
	/// Checking for particular item in the list is slow
	/// Looking an item up index is fast
	/// Iterating through lists is relatively fast
	/// Note: you can sort lists if you want to
	
	/// If you only add or remove items at the end of List use ArrayList
	List<String> list1 = new ArrayList<String>();
	
	/// Removing or adding items elsewhere in the list
	List<String> list2 = new LinkedList<String>();
	
	
	
	//////////// SET /////////////
	//// Only store unique values
	//// Great for removing duplicates
	//// Not indexed. unlike lists
	//// Very fast to check if a particular object exists
	//// If you want to use your own objects, you must implement hashCode() and equals()
	
	////Order is unimportant and OK if it change ?
	/// HashSet is not ordered
	Set<String> set1 = new HashSet<String>();
	
	//// Sorted in natural oder ? Use TreeSet
	//// (1,2,4 .., a,b,c....)
	Set<String> set2 = new TreeSet<String>();

	//// Element remain in order  they were added
	Set<String> set3 = new LinkedHashSet<String>();

	
	/////////// MAP //////////
	// Key value paired
	// Like a look up table
	// Retriving a value by key is fast
	// Iterating over map values is very slow
	// Maps not really optimized for iteration
	/// If you want to use your own objects and keys, you must implement hashCode() and equals()

	/// Keys nor in any particular order, and order liable to change
	Map<String, String> map1 = new HashMap<String,String>();
	
	// Keys sorted in natural order, must implement comparable for custom types
	Map<String, String> map2 = new TreeMap<String,String>();
	
	/// Keys remain in order  they were added
	Map<String, String> map3 = new LinkedHashMap<String,String>();
		
		
		
	/// There are also SortedSet, SortedMap interface
	
}
