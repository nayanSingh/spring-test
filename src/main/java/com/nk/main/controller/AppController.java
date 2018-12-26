package com.nk.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello ";
	}
}
