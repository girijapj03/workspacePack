package com.giri.marketLamda.dao;

import java.util.Collection;

import com.giri.marketLamda.dto.MarketDTO;
import com.giri.marketLamda.search.MarketSearch;

public interface MarketDAO {
boolean save(MarketDTO dto);
MarketDTO find(MarketSearch search);
Collection<MarketDTO> findAll(MarketSearch search);
}
