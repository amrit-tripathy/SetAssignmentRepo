package com.grayMatter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class CustomerMains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Customer> dq = new ArrayDeque<Customer>();
		Customer c1 = new Customer(123,"amrit",40000);
		Customer c2 = new Customer(123,"ttttt",30000);
		Customer c3 = new Customer(123,"ggggg",20000);
		dq.add(c3);
		dq.add(c2);
		dq.add(c1);
		
		Customer cust = dq.remove();//removes first inserted element
		System.out.println("customer removed is:"+cust);
		
		Customer checkcust = new Customer(123,"amrit",40000);
		System.out.println("customer is present:"+ dq.contains(checkcust));  //iterating is already done by contains
		
//		
		List<Customer> lis = new ArrayList<Customer>(dq);
		Collections.sort(lis);
		for(Customer c:lis) {
			System.out.println(c);
		}

	}

}
