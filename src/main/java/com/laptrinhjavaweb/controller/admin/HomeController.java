package com.laptrinhjavaweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "HomeControllerOfadmin")
public class HomeController {
	
   @RequestMapping(value = "/admin-home", method = RequestMethod.GET)
   public ModelAndView homePage() {
      ModelAndView mav = new ModelAndView("admin/home");
      return mav;
   }
}