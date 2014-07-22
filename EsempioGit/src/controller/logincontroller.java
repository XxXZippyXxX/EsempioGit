package controller;

import javax.servlet.http.HttpServletRequest;

import model.Utente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class logincontroller
{

	@Autowired
	private HttpServletRequest context;


	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ModelAttribute("utente")
	public String login(final ModelMap model)
	{
		final Utente utente = new Utente();
		model.addAttribute("utente", utente);

		System.out.println(utente.getUsername() + utente.getPassword());


		return "login";
	}


}
