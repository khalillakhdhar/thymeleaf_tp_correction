package com.orsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.orsys.model.Livre;
@Controller
public class HomeController {
@GetMapping("affiche")
public String home(Model m)
{
	Livre l=new Livre("Les miserables","auteur",100);
m.addAttribute("message",l.toString());
return "index";
}
@GetMapping("")
public String yes()
{


	return "livre";
}
@PostMapping("display")
public String displaylivres(Model m,@RequestParam String auteur,@RequestParam int prix,@RequestParam String titre)
{
	Livre l = new Livre(titre, auteur, prix);
	m.addAttribute("livre",l.toString());
return "affiche";

}
{}
}
