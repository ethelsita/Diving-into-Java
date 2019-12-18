package com.proyectojava.mavenblog.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectojava.mavenblog.dao.IBlogentryDAO;
import com.proyectojava.mavenblog.model.Blogentry;

@Service("BlogentryService")
public class BlogentryService implements IBlogentryService {

	@Autowired
	private IBlogentryDAO blogentryDAO;
	
	@Override
	@Transactional
	public List<Blogentry> getBlogentry() {
		return blogentryDAO.getBlogentry();
	}

	@Override
	@Transactional
	public void save(Blogentry blogentry) {
		blogentryDAO.save(blogentry);

	}

	@Override
	@Transactional
	public Blogentry getBlogentry(int idblogentry) {
		
		return blogentryDAO.getBlogentry(idblogentry);
	}

	@Override
	@Transactional
	public void delete(Blogentry blogentry) {
		blogentryDAO.delete(blogentry);

	}

	@Override
	@Transactional
	public List<Blogentry> getBlogentrys(int id) {
		return blogentryDAO.getBlogentrys(id);
	}
	
	@Override
	@Transactional
	public List<Blogentry> getBlogentrys(String palabra) {
		return blogentryDAO.getBlogentrys(palabra);
	}

}
