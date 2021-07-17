package com.xworkz.dtoExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.dtoExample.dto.CosmeticsDTO;
import com.xworkz.dtoExample.dto.MachineDTO;

public class MachineTester {

	public static void main(String[] args) {
		
		MachineDTO machine=new MachineDTO("DESKTOP-QR7NRQI",2,4d,10d,false,true);
		MachineDTO machine1=new MachineDTO("DESKTOP-QR7NRQI2",3,4d,10d,true,true);
		Collection<MachineDTO> col = new ArrayList<MachineDTO>();
		col.add(machine);
		col.add(machine1);
		//System.out.println(machine);
		Iterator<MachineDTO> itr = col.iterator();
		while (itr.hasNext()) {
			MachineDTO refDTO = itr.next();
			System.out.println(refDTO);
			
		}
		

	}

}
