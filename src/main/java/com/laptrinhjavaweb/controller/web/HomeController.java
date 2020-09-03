package com.laptrinhjavaweb.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "HomeControllerOfweb")
public class HomeController {
	
   @RequestMapping(value = "/home", method = RequestMethod.GET)
   public ModelAndView homePage() {
      ModelAndView mav = new ModelAndView("web/home");
      return mav;
   }
}