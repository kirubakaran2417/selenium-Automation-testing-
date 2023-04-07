package collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collectionsdemo {
public static void main(String[] args) {

	//how to create a list
	List<Integer> numbers=new ArrayList<>();
	numbers.add(24);
	numbers.add(34);
	numbers.add(55);
	numbers.add(34);
	numbers.add(67);
	numbers.add(64);
	System.out.println(numbers.size());
	for (Integer a : numbers) {
		System.out.println(a);
	}
	Collections.sort(numbers);
	Set<Integer> num2=new HashSet<>();

	num2.add(24);
	num2.add(34);
	num2.add(55);
	num2.add(34);
	num2.add(67);
	num2.add(64);
	List<Integer> numbers2=new ArrayList<>(num2);
	Set<String> names=new HashSet<>();
	names.add("apple");
	names.add("APPLE");
	System.out.println(names);
	System.out.println(numbers2);
}}
