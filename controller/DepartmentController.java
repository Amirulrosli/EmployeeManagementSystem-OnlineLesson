package com.nep.onlinelesson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DepartmentController {

	@RequestMapping(value="/departments")
	private String index() {
		return "departments";
	}
	
}
