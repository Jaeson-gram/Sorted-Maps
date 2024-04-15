package Oj.O;

import java.util.*;
import java.time.*;
import java.util.Comparator;																																																									


public class Main {
	public static void main(String[] args) {
		
		/*
		 * The hashMap offers faster insertion, manipulation and deletion time than the LinkedHashMap and the TreeMap
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/ 
		 * */ 
		
		Map<String, String> statesCapitals = new HashMap<>();
		
		statesCapitals.put("Rivers", "PortHarcourt");
		statesCapitals.put("Platue", "Jos");
		statesCapitals.put("Ondo", "Akure");
		statesCapitals.put("Lagos", "Ikeja");
		
		//permits null key - once - and null values - multiple times
		//several keys can have same value, but no two values are assigned to the same key
		//no duplicates allowed, however, whenever a duplicate key is added, the previous one (with same key) is overridden
		
		// statesCapitals.put("Rivers", "Ikeja"); //duplicate. this will overwrite the Rivers:PH thing
		statesCapitals.put("null", "Abuja"); //null value - once.
		statesCapitals.put("null", "null"); //will not be added
		statesCapitals.put("Somewhere", "null"); //will be added!

		statesCapitals.forEach((k, v) -> System.out.println("Key: " + k + "   Value: " + v));
		
		
		/*
		 * This is ordered by insertion order
		 * It fails to beat HashMap with insertion, search, and deletion, but it maintains insertion order
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/
		 * */
		System.out.println();
		Map<String, String> statesCapitals2 = new LinkedHashMap<>();
		
		statesCapitals2.put("Rivers", "PortHarcourt");
		statesCapitals2.put("Platue", "Jos");
		statesCapitals2.put("Ondo", "Akure");
		statesCapitals2.put("Lagos", "Ikeja");
		
	
		
		statesCapitals2.put("null", "Abuja");
		statesCapitals2.put("null", "null"); 
		statesCapitals2.put("Somewhere", "null");

		statesCapitals2.forEach((k, v) -> System.out.println("Key: " + k + "   Value: " + v));
		
		if(statesCapitals2.containsKey("Rivers")) {
			System.out.println(statesCapitals2);
		}

		/*
		 * 	entrySet()
			Returns a Set view of the mappings contained in this map.
			
			keySet()
			Returns a Set view of the keys contained in this map.
		 * */
		
		
		
		
		
		/*
		 * TreeMap - Orders by ascending order.
		 * Does not accept null keys
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/
		 * */
		System.out.println();

				
		NavigableMap<LocalDate, Integer> agingYears = new TreeMap<>();
		
//		Comparator comparator = agingYears.comparator();
//
//		System.out.println("------------------------------------");
//		System.out.println("Comparator Value: " + comparator);
		
		
		agingYears.put(LocalDate.of(2000, 4, 13), 0);
		agingYears.put(LocalDate.of(2001, 4, 13), 1);
		agingYears.put(LocalDate.of(2010, 4, 13), 10);
		agingYears.put(LocalDate.of(2020, 4, 13), 20);
		agingYears.put(LocalDate.now(), 24);

		agingYears.comparator();
		
		agingYears.forEach((k, v) -> System.out.println("Key: " + k + "   Value: " + v));

		
		/*
		 * These Oredered Maps have similar methods as the unordered Maps in the SetsAndMaps repo.
		 * eg
		 * -> computeIfAbsent(), computeIfPresent()
		 * -> containsKey(), containsValue(), putAll(), 
		 * -> merge(), compute()
		 * 
		 * And some that don't exist there -> addEntry(), addEntryToEmptyMap(), mergeValue(), remapValue();
		 * 
		 */
		

		
		
	}

}
