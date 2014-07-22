package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Utente;


@Controller
public class logincontroller
{


	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("utente") Utente utente)
	{
		
		System.out.println(utente.getUsername() + utente.getPassword());


		return "login";
	}


}
