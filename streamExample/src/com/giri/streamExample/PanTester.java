package com.giri.streamExample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

public class PanTester {

	public static void main(String[] args) {
		Collection<String> panValue = Arrays.asList("AAACC5607cA", "AACCC7890BC", "ACCCC7890BC", "BBZZZ5670OY",
				"BFUYUHKHFUY", "JHGGUIFKDFDY", "VHJFJKDHJY", "JSUGNGYUDI", "JGYJYYIKHKKY", "JHYGIIJKNA",
				"DIHUHHHGUI908IA", "VVGHGHGHJGC", "ACCCC7890BC");
		System.out.println(panValue.size());
		//System.out.println(panValue.stream().findAny());
		System.out.println(panValue.stream().findFirst());
		Collection<String> pan = panValue.stream().filter(a -> a.endsWith("C")).collect(Collectors.toList());
		System.out.println(pan + " size :" + pan.size());
		Iterator<String> loop=panValue.iterator();
		while(loop.hasNext()) {
			String str=loop.next();
			if(str.endsWith("Y")) {
				
				System.out.println(str.toLowerCase());
			}
		}

	}

}
