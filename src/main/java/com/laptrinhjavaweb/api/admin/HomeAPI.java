package com.laptrinhjavaweb.api.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController(value = "homeAPIOfAdmin")
public class HomeAPI {

	@GetMapping("/admin/home")
	public ModelAndView homePage() {
	      ModelAndView mav = new ModelAndView("admin/home");
	      return mav;
    }
}
