package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController



public class DojoController {
	@RequestMapping("/{word}")
	public String returnAwesome(@PathVariable("word") String word) {
		return "The " + word + " is awesome!";
	}

	@RequestMapping("/{title}-dojo")
	public String returnTitle(@PathVariable("title") String title) {
		return title + " Dojo is located in Southern California";
	}
	@RequestMapping("/{location}")
	public String returnLocation(@PathVariable("location") String location) {
		return location + " dojo is the headquarters";
	}
}
