package com.proyectojava.mavenblog.services;



import java.util.List;

import com.proyectojava.mavenblog.model.Blogentry;

public interface IBlogentryService {
	
	List<Blogentry> getBlogentry();
	
	List<Blogentry> getBlogentrys(int id);
	 
	List<Blogentry> getBlogentrys(String palabra);
	
	void save(Blogentry blogentry);

   Blogentry getBlogentry(int idblogentry);

	void delete(Blogentry blogentry);
}