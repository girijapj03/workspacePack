package com.giri.sortEx;

import java.util.*;

import com.giri.sortEx.Examples.PersonDTO;
import com.giri.sortEx.Examples.ProductDTO;

public class ProductTester {

	public static void main(String[] args) {
		ProductDTO pdt=new ProductDTO("SODA","FANTA",30,500.00);
		ProductDTO pdt1=new ProductDTO("BOOK","300PageBook",50,300d);
		ProductDTO pdt2=new ProductDTO("chips","Bingo",5,10d);
		ProductDTO pdt3=new ProductDTO("KIT-KAT","NESTLEY",20,50d);
		ProductDTO pdt5=new ProductDTO("DIARY MILK SILK","CADBURY",80,250d);
		ProductDTO pdt6=new ProductDTO("BALLPEN","PEN",5,1);
		ProductDTO pdt7=new ProductDTO("PAPER","VIJAYKARNATAK",4,1);
		
		List<ProductDTO> list=new ArrayList<>();
		list.add(pdt);
		list.add(pdt1);
		list.add(pdt2);
		list.add(pdt3);
		list.add(pdt5);
		list.add(pdt6);
		list.add(pdt7);
		
		for(ProductDTO productDTO: list) {
			System.out.println(productDTO);
		}
		System.out.println("*******");
		Collections.sort(list);
		
		
		for(ProductDTO productDTO: list) {
			System.out.println(productDTO);
		}
		
	}

}
