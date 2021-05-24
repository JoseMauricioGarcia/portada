package com.dwa.portada.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {
	
	@GetMapping("/demo/portada/")
	public String Portada() {
		return "demo/portada";
	}
}
