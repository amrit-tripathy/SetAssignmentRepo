package com.grayMatter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
public class Order {
	private int orderId;
	private LocalDate OrderDate;
	private List<item> arr;
	
	

}
