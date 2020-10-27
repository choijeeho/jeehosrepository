package com.example.demo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/displays")
public class DisplayController {

	@GetMapping("/{display}")
	public String getDisplay(@PathVariable String display) {
		
		return "display id : " + display;
	}
}
