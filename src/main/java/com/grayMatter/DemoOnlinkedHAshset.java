package com.grayMatter;

import java.util.LinkedHashSet;

public class DemoOnlinkedHAshset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Customer> lis = new LinkedHashSet<Customer>();
		Customer c1 = new Customer(123,"amrit",40000);
		Customer c2 = new Customer(123,"ttttt",30000);
		Customer c3 = new Customer(123,"ggggg",20000);
		lis.add(c1);
		lis.add(c2);
		lis.add(c3);
		
		System.out.println("all employees");
		for(Customer c:lis) {
			System.out.println(c);
		}
		
		lis.remove(new Customer(123,"amrit",40000));
		
		Customer checkCust = new Customer(123,"ggggg",20000);
		
		System.out.println("customer is present:"+lis.contains(checkCust));
		
		lis.clear();
		System.out.println("after clearing list :"+lis);
	}

}
