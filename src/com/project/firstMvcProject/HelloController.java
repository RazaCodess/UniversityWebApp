package com.project.firstMvcProject;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HelloController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields("skills");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyymmdd");
		binder.registerCustomEditor(Date.class, "DOB", new CustomDateEditor(simpleDateFormat, false));
		binder.registerCustomEditor(String.class,"first_name", new CustomNameEditor());
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView viewPage() {
		ModelAndView modelAndView = new ModelAndView("form");
		return modelAndView;
	}
	
	@RequestMapping(value = "/student_register", method = RequestMethod.POST)
	public ModelAndView helloWorld(@Valid @ModelAttribute("form") Form forms,BindingResult result) {
		System.out.println(forms);
		System.out.println(result.hasErrors());
		if(result.hasErrors()) {
			
			ModelAndView modelAndView = new ModelAndView("form");
			modelAndView.addObject("message","fuck you for submitting wrong data ");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("view");
		modelAndView.addObject("message","form successfully submitted for ");
		return modelAndView;
	}

	
	
	

}
