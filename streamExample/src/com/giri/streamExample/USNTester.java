package com.giri.streamExample;

import java.util.Arrays;
import java.util.Collection;

import java.util.stream.Collectors;

public class USNTester {

	public static void main(String[] args) {
		Collection<String> usnValue = Arrays.asList("2LB17EC401", "2LB16EC390", "1SJ15EC560", "2LB15ME230",
				"3GB14CS340", "2ER14CS670", "3TH17ME890", "3EF16EC450", "4EF18ME346", "5RF17CV560", "5YU17CV555",
				"4TH17CV655");
		System.out.println(usnValue.size());
		Collection<String> csvalue = usnValue.stream().filter(j -> j.contains("CS")).collect(Collectors.toList());
		System.out.println(csvalue);
		Collection<String> ecvalue = usnValue.stream().filter(k -> k.contains("EC")).collect(Collectors.toSet());
		System.out.println(ecvalue);
		ecvalue.forEach(n -> System.out.println(n));

	}
}
