package com.proyectojava.mavenblog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectojava.mavenblog.dao.IKeywordDAO;
import com.proyectojava.mavenblog.model.Keyword;

@Service("keywordService")
public class KeywordService implements IKeywordService {

	@Autowired
	private IKeywordDAO keywordDAO;
	
	@Override
	@Transactional
	public List<Keyword> getKeyword() {
		return keywordDAO.getKeyword();
	}

	@Override
	@Transactional
	public void save(Keyword keyword) {
		keywordDAO.save(keyword);

	}

	@Override
	@Transactional
	public Keyword getKeyword(int idkeyword) {
		
		return keywordDAO.getKeyword(idkeyword);
	}

	@Override
	@Transactional
	public List<Keyword> getKeywords(int idblogentry) {
		
		return keywordDAO.getKeywords(idblogentry);
	}
	
	@Override
	@Transactional
	public void delete(Keyword keyword) {
		keywordDAO.delete(keyword);

	}

}
