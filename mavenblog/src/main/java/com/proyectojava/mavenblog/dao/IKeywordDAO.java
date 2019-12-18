package com.proyectojava.mavenblog.dao;


import java.util.List;

import com.proyectojava.mavenblog.model.Keyword;

public interface IKeywordDAO {
	List<Keyword> getKeyword();
	List<Keyword> getKeywords(int idblogentry);
	
	void save(Keyword keyword);

	Keyword getKeyword(int idkeyword);

	void delete(Keyword keyword);
}
