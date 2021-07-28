package com.giri.habba;

import java.util.Arrays;
import java.util.Collection;

import com.giri.habba.constant.Religion;
import com.giri.habba.dao.HabbaDAO;
import com.giri.habba.dao.HabbaDAOimpl;
import com.giri.habba.dto.HabbaDTO;

public class HabbaTESTER {

	public static void main(String[] args) {
	HabbaDTO dto=new HabbaDTO("Ganesh Chatuthi", "ALL INDIAN celebrate", 5, "Modhak", Religion.HINDU);
	HabbaDTO dto1=new HabbaDTO("Ramzan", "ALL muslim celebrate", 1, "Shurkurma &biryani", Religion.MUSLIM);
	HabbaDTO dto2=new HabbaDTO("Christmas", "ALL Christians celebrate", 7, "Cake &wine", Religion.CHRISTIAN);
	HabbaDTO dto3=new HabbaDTO("Nagar Panchami", "ALL INDIAN celebrates", 2, "Laddu", Religion.HINDU);
	
	HabbaDAO dao=new HabbaDAOimpl();
	dao.ulisu(dto);
	dao.ulisu(dto1);
	dao.ulisu(dto2);
	System.out.println("saved:"+dao.ulisu(dto3));
	
	Collection<HabbaDTO> coll=Arrays.asList(dto,dto1,dto2,dto3);
	coll.forEach((h)->System.out.println(h.getName().toUpperCase()));
	coll.forEach((habba)->System.out.println(habba.getRegion().endsWith("celebrates")));
	coll.forEach((ha)->System.out.println(ha.getSpecialFood().toUpperCase()));
	
	HabbaDTO found=dao.ondunaHuduku((n)-> n.getName().equals("Ramzan"));
	System.out.println("name :"+found);
	
	Collection<HabbaDTO> found1=dao.yellavanuHuduku((f)->f.getReligion().equals(Religion.HINDU));
	System.out.println(found1);

}
}
