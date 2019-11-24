package com.trifulcas.mavensecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/colab")
public class ColabController {

	@GetMapping("/")
	public String inicio() {
		return "index-colab";
	}
	
}
