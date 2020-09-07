package com.laptrinhjavaweb.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;
import com.laptrinhjavaweb.repository.NewRepository;
import com.laptrinhjavaweb.service.INewService;
import com.laptrinhjavaweb.service.impl.NewService;

@Controller(value = "NewControllerOfadmin")
public class NewController {

	@Autowired
	private INewService newService;
	
	@RequestMapping(value = "/admin/new/list", method = RequestMethod.GET)
	public ModelAndView newList(@ModelAttribute("model") NewDTO newDTO) {
		ModelAndView mav = new ModelAndView("admin/new/list");
		newDTO.setListResult(newService.findAll());
		mav.addObject("model", newDTO);
		return mav;
	}
	
	@RequestMapping(value = "/admin/new/edit", method = RequestMethod.GET)
	public ModelAndView newEdit() {
		ModelAndView mav = new ModelAndView("admin/new/edit");
		return mav;
	}
}
