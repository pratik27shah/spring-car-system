/**
 * 
 */
package com.egen.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author PRATIK SHAH
 *
 */
@Controller
public class controller {
	
	private static final Logger logger = LoggerFactory.getLogger(controller.class);
	@RequestMapping(value="/",method = {RequestMethod.GET})
	public ModelAndView  firstwebpage(ModelMap model) throws IOException {
	model.addAttribute("data", "Basic Spring Setup");
		return new ModelAndView("view");
	}
	
	
	
	@RequestMapping(value="/secondpage",method = {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView  secondpage(@RequestParam("value") String value,ModelMap model,HttpServletRequest request) throws IOException {
//	model.addAttribute("data", "Basic Spring Setup");
		model.addAttribute("data", value.toString());
		return new ModelAndView("view");
	}

}
