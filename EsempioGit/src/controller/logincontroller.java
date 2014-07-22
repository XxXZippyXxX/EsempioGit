package controller;

import model.Utente;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Utente;


@Controller
@RequestMapping("/login.do")
public class logincontroller
{


	@RequestMapping( method = RequestMethod.POST)
	protected String login(@ModelAttribute("utente") Utente utente)
	{
		
		System.out.println(utente.getUsername() + utente.getPassword());


		return "login";
	}


}
