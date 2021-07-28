package com.giri.habba.dao;

import java.util.Collection;

import com.giri.habba.dto.HabbaDTO;
import com.giri.habba.search.HabbaSearch;

public interface HabbaDAO {
boolean ulisu(HabbaDTO dto);

HabbaDTO ondunaHuduku(HabbaSearch search);
Collection<HabbaDTO> yellavanuHuduku(HabbaSearch search);
}
