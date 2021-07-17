package com.xworkz.dtoExample;

import java.util.*;

import com.xworkz.dtoExample.constant.ChocoType;
import com.xworkz.dtoExample.dto.ChocolateDTO;

public class ChocoTester {

	public static void main(String[] args) {
		ChocolateDTO choco = new ChocolateDTO("cadbury", "DairyMilk Silk Oreo", ChocoType.COMPOUND, 480D, 360d, false);
		ChocolateDTO choco1 = new ChocolateDTO("cadbury", "DairyMilk Plain Silk ", ChocoType.RAW, 450D, 360d, false);
		ChocolateDTO choco2 = new ChocolateDTO("cadbury", "DairyMilk silk bubble ", ChocoType.DARK, 450D, 360d, true);

		Collection<ChocolateDTO> col = new ArrayList<ChocolateDTO>();
		col.add(choco);
		col.add(choco1);
		col.add(choco2);
		System.out.println(col);
		Iterator<ChocolateDTO> itr = col.iterator();
		while (itr.hasNext()) {
			ChocolateDTO refDTO = itr.next();
			System.out.println(refDTO);
			if (refDTO.getPrice() > 500) {
				System.out.println("over rated");
			}
		}
		ChocolateDTO choco3 = new ChocolateDTO("CADBURY", "DairyMilk silk bubble ", ChocoType.DARK, 450D, 360d, true);

		System.out.println(col.contains(choco3));

	}

	
}
