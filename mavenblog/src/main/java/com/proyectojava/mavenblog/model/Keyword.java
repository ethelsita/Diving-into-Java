package com.proyectojava.mavenblog.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "keyword")
public class Keyword {

	@Id
	@Column(name = "idkeyword")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idkeyword;
	
	
	@Column(name = "keyword")
	private String keyword;


	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH }, fetch = FetchType.LAZY)
	@JoinTable(name = "blogentrykeyword",
	joinColumns = @JoinColumn(name="idkeyword"), 
	inverseJoinColumns = @JoinColumn(name="idblogentry"))
	private List<Blogentry> blogentry;



	public Keyword() {
	}


	public Keyword(String keyword) {

		super();

		this.keyword = keyword;

	}

	public int getIdkeyword() {
		return idkeyword;
	}

	
	
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public List<Blogentry> getBlogentry() {
		return blogentry;
	}

	public void setBlogentry(List<Blogentry> blogentry) {
		this.blogentry = blogentry;
	}

	public void addKeyword(Blogentry blogentry) {
		if (this.blogentry == null) {
			this.blogentry = new ArrayList<Blogentry>();
		}
		this.blogentry.add(blogentry);
	}

	@Override
	public String toString() {
		return "Keyword [idkeyword=" + idkeyword + ", keyword=" + keyword + "]";
	}
	

}
