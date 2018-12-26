package com.lichkin.application.controllers.pages.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lichkin.framework.defines.LKFrameworkStatics;

@Controller
@RequestMapping("/employee")
public class EmployeeReportPagesController {

	@GetMapping(value = "/report/index")
	public ModelAndView linkToReport() {
		return new ModelAndView("redirect:/report/index" + LKFrameworkStatics.WEB_MAPPING_PAGES);
	}

}
