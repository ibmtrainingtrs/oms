package com.ibm.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BugController {
	@PostMapping("/bug")
	String createBug() {
		return "Sucess";

	}

	@GetMapping("/bug")
	String getBug() {
		return "Bug is created";
	}

	@PutMapping("/bug/{id}")
	String updateBug(@PathVariable("id") int bugId) {
		System.out.println(bugId);
		return "Bug updated";
	}

	@DeleteMapping("/bug/{id}")
	String deleteBug(@PathVariable("id") int bugId) {
		System.out.println(bugId);
		return "Bug Deleted";
	}

}
