package com.xworkz.dtoExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.dtoExample.constant.CosmeticsType;
import com.xworkz.dtoExample.dto.ChocolateDTO;
import com.xworkz.dtoExample.dto.CosmeticsDTO;

public class CosmeticsTester {

	public static void main(String[] args) {
		CosmeticsDTO cosmetic = new CosmeticsDTO("LAKME", "FOUNDATION", CosmeticsType.LIQUID, true, 3_4D);
		CosmeticsDTO cosmetic1 = new CosmeticsDTO("LAKME", "FOUNDATION", CosmeticsType.MOUSSE, false, 2D);

		Collection<CosmeticsDTO> col = new ArrayList<CosmeticsDTO>();
		col.add(cosmetic);
		col.add(cosmetic1);
		Iterator<CosmeticsDTO> itr = col.iterator();
		while (itr.hasNext()) {
			CosmeticsDTO refDTO = itr.next();
			System.out.println(refDTO);
		}
		System.out.println(col.contains(null));
		CosmeticsDTO cosmetic3 = new CosmeticsDTO( "FOUNDATION","fitme", CosmeticsType.CREAM, true, 2D);
		CosmeticsDTO cosmetic4 = new CosmeticsDTO("FOUNDATION","FITME", CosmeticsType.CREAM, true, 2D);
       boolean check= cosmetic3.equals(cosmetic4);
       System.out.println(check);
	}
}
