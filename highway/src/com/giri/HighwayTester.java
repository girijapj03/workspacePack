package com.giri;

import java.util.Collection;

import com.giri.constant.HighwayType;
import com.giri.road.dao.HighwayDAO;
import com.giri.road.dao.HighwayDAOImpl;
import com.giri.road.dto.HighwayDTO;

public class HighwayTester {

	public static void main(String[] args) {
		/*
		 * HighwayDTO(int id, int number, double length, boolean roadCondition, String
		 * contractCompany, HighwayType type,String stateName)
		 */
		HighwayDTO highdto = new HighwayDTO(21, 434, 900, true, "RoadWay", HighwayType.STATEWAY, "Karnatak");
		HighwayDTO highdto1 = new HighwayDTO(23, 676, 79, false, "PathEXp", HighwayType.DISTRICTWAY, "Bagalkot");
		HighwayDTO highdto2 = new HighwayDTO(25, 909, 30, false, "GoWay", HighwayType.VILLAGEROAD, "Mantoor");
		HighwayDAO dao = new HighwayDAOImpl();
		boolean added = dao.save(highdto);
		System.out.println("check is it added :" + added);
		dao.save(highdto1);
		dao.save(highdto2);
		dao.totalItems();
		Collection<HighwayDTO> coll = dao.findAll();
		for (HighwayDTO highwayDTO : coll) {
			System.out.println("find all:" + highwayDTO);
		}

		Collection<Integer> value = dao.findAllNumber();
		for (Integer integer : value) {
			System.out.println("find all num:" + integer);
		}
		Collection<HighwayDTO> findByhighwayType = dao.findByHighwayType(HighwayType.VILLAGEROAD);
		for (HighwayDTO highwayDTO : findByhighwayType) {
			System.out.println("find by high way type:" + highwayDTO);

		}
		Collection<HighwayDTO> state = dao.findByStateName("Karnatak");
		for (HighwayDTO highwayDTO : state) {
			System.out.println("find by state name:" + highwayDTO);

		}
		Collection<Integer> findNumberStateName = dao.findNumberByStateName("Karnatak");
		for (Integer integer : findNumberStateName) {
			System.out.println("find number by state name :" + integer);
		}
		dao.findLengthByNumber(909);
		dao.findByMaxLength();
		dao.findByMinLength();
		dao.exist(highdto);
		dao.exist(null);
	}

}
