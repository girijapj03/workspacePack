package com.xworkz.telecast.dto;

import com.xworkz.telecast.TelevisionDTO;

public class TelevisionTester {

	public static void main(String[] args) {
		TelevisionDTO televisionDTO = new TelevisionDTO();
		televisionDTO.setBrand("VIDEOCON");
		televisionDTO.setPrice(18000);
		televisionDTO.setNoOfPorts(4);
		televisionDTO.setSmart(true);

		System.out.println(televisionDTO);
	}

}
