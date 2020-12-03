package com.orsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.orsys.model.Livre;
@Controller
public class HomeController {
@GetMapping("")
public String home(Model m)
{
	Livre l=new Livre("Les miserables","auteur",100);
m.addAttribute("message",l.toString());
return "index";
}

}
