package com.grayMatter;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor     //benifits of lombak no need to update constructor or getter and setters 
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Customer implements Comparable<Customer>{
	
	private int id;
	private String custName;
	private int sal;
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.getSal()-o.getSal();
	}
	
	  @Override
	    public boolean equals(Object obj) { //here equals is related to object class so we need to typecast it
		  //whenever we have to check contains method in user defined objects we need to override equals method
		  //here by default contains is going to iterate on arraylist so in equals method we just need 
		  //checking criteria
		  //this====>object in arraylist && c = object passed
		  	Customer c = (Customer)obj;
		  	
	       if(this.getId()==c.getId() && this.getCustName().equals(c.getCustName()) && this.getSal()==c.getSal()) {
	    	   return true;
	       }
	       return false;
	    }
	  @Override
	public int hashCode() {  //even hashcode needs to be overridden
		// TODO Auto-generated method stub
		return  Objects.hash(id);
	}

}
