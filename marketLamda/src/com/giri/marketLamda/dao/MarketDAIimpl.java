package com.giri.marketLamda.dao;

import java.util.*;

import com.giri.marketLamda.dto.MarketDTO;
import com.giri.marketLamda.search.MarketSearch;

public class MarketDAIimpl implements MarketDAO {
	private List<MarketDTO> list = new ArrayList<>();

	@Override
	public boolean save(MarketDTO dto) {
		System.out.println("calling save :"+list.add(dto));
		return true;
	}

	@Override
	public MarketDTO find(MarketSearch search) {
		Iterator<MarketDTO> itr = list.iterator();
		MarketDTO market = null;
		while (itr.hasNext()) {
			MarketDTO martDTO = itr.next();
			if (search.search(martDTO)) {
				market = martDTO;
				break;
			}
		}
		return market;
	}

	@Override
	public Collection<MarketDTO> findAll(MarketSearch search) {
		Iterator<MarketDTO> loop = list.iterator();
		Collection<MarketDTO> temp = new ArrayList<MarketDTO>();
		while (loop.hasNext()) {
			MarketDTO marketDTO = loop.next();
			if (search.search(marketDTO)) {
				temp.add(marketDTO);
			}
		}
		return temp;
	}

}
