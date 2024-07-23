package com.grayMatter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderMains {
	public static void main(String[] args) {
		List<Order>orders = new ArrayList<Order>();
		
		for(int i=0;i<10;i++) {
			int orderId = i;
			LocalDate date = LocalDate.now().minusDays(i);
			
			List<item> li = new ArrayList<item>();
			item i1 = new item("Item "+i+":",10*i);
			item i2 = new item("Item "+(i+2)+":",15*i);
			item i3 = new item("Item "+(i+3)+":",20*i);
			li.add(i1);
			li.add(i2);
			li.add(i3);
			Order o = new Order(orderId,date,li);
			orders.add(o);
		}
		
		int totalOrderCost = 0;
		for(Order o:orders) {
			List<item> li = o.getArr();
			for(item lit:li) {
				int price = lit.getItemPrice();
				totalOrderCost += price;
			}
		}
		System.out.println(" total order cost is: "+totalOrderCost);
		
		int maxOrdPrice = 0;
		for(Order o:orders) {
			List<item> li = o.getArr();
			int ordPrice = 0;
			for(item lit:li) {
				int price = lit.getItemPrice();
				ordPrice += price;
			}
			if(maxOrdPrice<ordPrice) {
				maxOrdPrice = ordPrice;
			}
		}
		System.out.println(" Max order price is:"+maxOrdPrice);
		
		
		
	}

}
