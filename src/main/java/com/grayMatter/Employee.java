package com.grayMatter;

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
public class Employee implements Comparable<Employee> {
	
	private String empName;
	private int empId;
	private double empSal;
	private String city;
	@Override
	public int compareTo(Employee e) {
		
		return (int) (this.getEmpSal()-e.getEmpSal());  //typecasting to int  ===sorting on salary
	}
	
	

}
