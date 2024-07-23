package com.grayMatter;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class DemoOnSets {
	
	public static void main(String[] args) {
	
		HashSet<Integer> hs = new HashSet<Integer>();  
		//no duplicates
		// insertion order not preserved
		hs.add(67);
		hs.add(98);
		hs.add(34);
		hs.add(21);
		System.out.println(hs);
		hs.add(67);
		hs.add(null);
		System.out.println(hs);
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		HashSet<Integer> hs1 = (HashSet<Integer>) hs.clone();
		System.out.println(hs);
		System.out.println(hs1);
		
		LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>();
		ls.add(67);
		ls.add(98);
		ls.add(34);
		ls.add(21);
		
		Object[] arr=ls.toArray();
		System.out.println(arr[0]);
		
		List<Object> alist = Arrays.asList(arr);
		System.out.println(alist);
		
		TreeSet<Integer> ts = new TreeSet<Integer>();//inserts in sorted order
		ts.add(67);
		ts.add(98);
		ts.add(34);
		ts.add(21);
		System.out.println(ts);
		Iterator<Integer>itr1=ts.descendingIterator();//to print elements in descending iterator
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
		TreeSet<Employee> empTree = new TreeSet<Employee>();//it is important to add a comparable to user defined class as treeset takes a sorted order
		Employee e1 = new Employee("Amrit",123,40000,"hyderabad");
		Employee e2 = new Employee("abcd",234,25000,"hyderabad");
		Employee e3 = new Employee("defg",567,45000,"Delhi");
		Employee e4 = new Employee("defg",678,21000,"Delhi");
		empTree.add(e1);
		empTree.add(e2);
		empTree.add(e3);
		empTree.add(e4);
		
		for(Employee e:empTree) {
			System.out.println(e);
		}
		
		System.out.println(ts.ceiling(60));//67==fetches element just above 60 in treeset
		System.out.println(ts.floor(60));//34===fetches element just below 60 i treeset
		System.out.println(ts.headSet(60));
		System.out.println(ts.tailSet(60));
		
		
		
	}
}
