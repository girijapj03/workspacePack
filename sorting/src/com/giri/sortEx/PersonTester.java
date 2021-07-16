package com.giri.sortEx;

import java.util.*;

import com.giri.sortEx.Examples.PersonDTO;

public class PersonTester {

	public static void main(String[] args) {
		PersonDTO dto=new PersonDTO("Aishwarya",21,"aishwaryahp@gmail.com");
		PersonDTO dto1=new PersonDTO("Pavitra",23,"pavitra.dalawai@gmail.com");
		PersonDTO dto2=new PersonDTO("Vaishnavi",22,"vaish@gmail.com");
		PersonDTO dto3=new PersonDTO("Ranjitha",25,"Ranjitha@gmail.com");
		PersonDTO dto4=new PersonDTO("sunil",26,"sunil@gmail.com");
		PersonDTO dto5=new PersonDTO("sunil",24,"sunil@gmail.com");
		List<PersonDTO> list=new ArrayList<>();
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		
		for(PersonDTO personDTO: list) {
			System.out.println(personDTO);
		}
		System.out.println("*******");
		Collections.sort(list);
		
		
		for(PersonDTO personDTO: list) {
			System.out.println(personDTO);
		}
	}

}
