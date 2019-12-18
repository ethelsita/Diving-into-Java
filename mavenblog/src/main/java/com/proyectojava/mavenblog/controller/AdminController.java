package com.proyectojava.mavenblog.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyectojava.mavenblog.model.Blogentry;
import com.proyectojava.mavenblog.model.Keyword;
import com.proyectojava.mavenblog.services.IBlogentryService;
import com.proyectojava.mavenblog.services.IKeywordService;



@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private IBlogentryService blogentryService;
	
	@Autowired
	private IKeywordService keywordService;
	
	@GetMapping("/")
	public String inicio() {
		return "redirect:/";
	}
	@GetMapping("/deleteblogentry")
	public String deleteBlogentry(@RequestParam("idblogentry") int idblogentry) {
		Blogentry blogentry = blogentryService.getBlogentry(idblogentry);
		blogentryService.delete(blogentry);

		return "redirect:/";
	}
	
	@GetMapping("/editarblogentry")
	public String editarBlogentry(Model modelo, @RequestParam("idblogentry") int idblogentry) {
		Blogentry blogentry = blogentryService.getBlogentry(idblogentry);
		modelo.addAttribute("blogentry", blogentry);
		List<Keyword> keyword = keywordService.getKeyword();
		modelo.addAttribute("keyword", keyword);
		return "blogentry_form";
	}

	@PostMapping("/saveblogentry")
	public String saveBlogentry(@ModelAttribute("blogentry") Blogentry blogentry) {

		blogentryService.save(blogentry);
		return "redirect:/";
	}
	
/*	@PostMapping("/saveblogentry")
	public String saveBlogentry(@RequestParam("keywords")String[] keywords,@ModelAttribute("blogentry") Blogentry blogentry) {
		System.out.println(Arrays.toString(keywords));
		
		
		blogentryService.save(blogentry);
		return "redirect:/";
	}
	*/
	
	@PostMapping("/doupload")
	public String doUpload(@ModelAttribute("blogentry") Blogentry blogentry) {

		blogentryService.save(blogentry);
		return "redirect:/";
	}
	@GetMapping("updateblogentry")
	public String updateBlogentry(@RequestParam("idblogentry") int idblogentry, Model modelo) {

		Blogentry blogentry = blogentryService.getBlogentry(idblogentry);
		modelo.addAttribute(blogentry);
		return "redirect:/";
	}

	@GetMapping("/addblogentry")
	public String addBlogentry(Model modelo) {
		Blogentry blogentry = new Blogentry();
		modelo.addAttribute(blogentry);
		List<Keyword> keyword = keywordService.getKeyword();
		modelo.addAttribute("keyword", keyword);
		return "blogentry_form";
	}
}
