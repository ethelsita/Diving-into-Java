package com.trifulcas.mavensecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/editor")
public class EditorController {

	@GetMapping("/")
	public String inicio() {
		return "index-editor";
	}
	
}
