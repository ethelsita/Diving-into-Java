package com.proyectojava.mavenblog.model;



import java.util.ArrayList;
import java.util.Date;
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
@Table(name = "blogentry")
public class Blogentry {

	@Id
	@Column(name = "idblogentry")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idblogentry;

	@Column(name = "title")
	private String title;

	@Column(name = "extract")
	private String extract;
	
	@Column(name = "description")
	private String description;

	@Column(name = "filename")
	private String filename;
	
	@Column(name = "createdat")
	private Date createdat;
	
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH }, fetch = FetchType.EAGER)
	@JoinTable(name = "blogentrykeyword",
	joinColumns = @JoinColumn(name="idblogentry"), 
	inverseJoinColumns = @JoinColumn(name="idkeyword"))
	private List<Keyword> keyword;
	
	
	
	
	public Blogentry() {
	}

	public Blogentry(String title, String extract) {
		super();
		this.title=title;
		this.extract=extract;
	}


	
	public int getIdblogentry() {
		return idblogentry;
	}
	public void setIdblogentry (int idblogentry) {
		this.idblogentry = idblogentry;
	}
/*public no porque es auto me supongo*/

	public String getTitle() {
		return title;
	}
	
	public void setTitle (String title) {
		this.title = title;
	}

	
	public String getExtract() {
		return extract;
	}

	public void setExtract(String extract) {
		this.extract = extract;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public Date getCreatedat() {
		return createdat;
	}

	public void setCreatedat(Date createdat) {
		this.createdat = createdat;
	}
	
	
	public List<Keyword> getKeyword() {
		return keyword;

	}

	public void setKeyword(List<Keyword> keyword) {
		this.keyword = keyword;
	}

	public void addKeyword(Keyword keyword) {
		if (this.keyword == null) {
		this.keyword = new ArrayList<Keyword>();
		}
		this.keyword.add(keyword);
		}
	
	@Override
	public String toString() {
		return "Blogentry [idblogentry=" + idblogentry + ", title=" + title + ", extract=" + extract + ", filename=\" + filename + \"]";
	}



}
