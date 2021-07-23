package com.giri.mapExample;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class AadharNumMobNum {

	public static void main(String[] args) {
		Map<Long, Long> map = new LinkedHashMap<Long, Long>();
		map.put(123456788l, 9909090090l);
		map.put(345678986l, 8989076765l);
		map.put(244678986l, 8976590065l);
		map.put(345678986l, 8989076765l);// duplicate
		int size = map.size();
		System.out.println(size);
		Set<Long> keyset = map.keySet();
		Iterator<Long> itr = keyset.iterator();
		while (itr.hasNext()) {
			Long var = itr.next();
			Long value = map.get(var);
			System.out.println("key " + var + " " + "value " + value);
		}

	}

}
