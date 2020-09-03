package com.laptrinhjavaweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.model.NewModel;

@Controller(value = "NewControllerOfadmin")
public class NewController {

	@RequestMapping(value = "/admin/new/list", method = RequestMethod.GET)
	public ModelAndView newList(@ModelAttribute("model") NewModel model) {
		ModelAndView mav = new ModelAndView("admin/new/list");
		mav.addObject("model", model);
		return mav;
	}
	
	@RequestMapping(value = "/admin/new/edit", method = RequestMethod.GET)
	public ModelAndView newEdit() {
		ModelAndView mav = new ModelAndView("admin/new/edit");
		return mav;
	}
}
