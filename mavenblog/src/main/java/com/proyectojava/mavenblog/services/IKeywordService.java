package com.proyectojava.mavenblog.services;


import java.util.List;

import com.proyectojava.mavenblog.model.Keyword;



public interface IKeywordService {
	List<Keyword> getKeyword();

	void save(Keyword keyword);

	Keyword getKeyword(int idkeyword);
	
	//List<Keyword> getKeywords(int idkeyword);
	List<Keyword> getKeywords(int idblogentry);
	
	void delete(Keyword keyword);
}
