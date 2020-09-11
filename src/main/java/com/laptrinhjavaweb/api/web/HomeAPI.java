package com.laptrinhjavaweb.api.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController(value = "homeAPIOfWeb")
public class HomeAPI {
	
	@GetMapping("/home")
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("web/home");	 
        return mav;
	}
	
	@GetMapping("/login")
	public ModelAndView loginPage() {
	    ModelAndView mav = new ModelAndView("login");		  
	    return mav;
    }
	
	@GetMapping("/logout")
	public ModelAndView logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
		new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return new ModelAndView("redirect:/home");
    }
	
	@GetMapping("/accessDenied")
	public ModelAndView accessDenied() {  
		return new ModelAndView("redirect:/login?accessDenied");
    }
}
