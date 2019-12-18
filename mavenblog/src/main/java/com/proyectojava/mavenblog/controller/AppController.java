package com.proyectojava.mavenblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyectojava.mavenblog.model.Blogentry;
//import com.proyectojava.mavenblog.model.Keyword;
import com.proyectojava.mavenblog.model.Keyword;
import  com.proyectojava.mavenblog.services.IBlogentryService;
//import com.proyectojava.mavenblog.services.IKeywordService;
import com.proyectojava.mavenblog.services.IKeywordService;

@Controller
public class AppController {

	@Autowired
	private IKeywordService keywordService;

	

	@Autowired
	private IBlogentryService blogentryService;

	/*@GetMapping("/")
	public String inicio(Model modelo) {
		List<Blogentry> blogentry = blogentryService.getBlogentry();
		modelo.addAttribute("blogentry", blogentry);

		return "index";
	}
	**/
	
	@GetMapping("/")
	public String inicio(Model modelo) {
		List<Blogentry> blogentry = blogentryService.getBlogentry();
	//	List<Keyword> keyword = keywordService.getKeywords(1);
		modelo.addAttribute("blogentry", blogentry);
	//	modelo.addAttribute("keyword", keyword);
		return "index";
	}

	/*
	@GetMapping("/products")
	public String productos(Model modelo, @RequestParam int id) {
		
		List<Product> products = productService.getProducts(id);
		Category category=categoryService.getCategory(id);
		modelo.addAttribute("products", products);
		modelo.addAttribute("category", category);

		return "products";
	}
	 */	
	
	@RequestMapping("/filtro")
	public String productos(Model modelo, @RequestParam String palabra) {
		
		List<Blogentry> blogentry = blogentryService.getBlogentrys(palabra);
		modelo.addAttribute("blogentry", blogentry);

		return "index";
	}
	
	
	@GetMapping("/blogentry")
	public String entrada(Model modelo, @RequestParam int idblogentry) {
		Blogentry blogentry = blogentryService.getBlogentry(idblogentry);
		modelo.addAttribute("blogentry", blogentry);
		return "blogentry";
	}
	
	@GetMapping("/login")
	public String login() {	
		return "login";
	}
	
	@GetMapping("/prohibido")
	public String prohibido() {
		return "prohibido";
	}
	
}
