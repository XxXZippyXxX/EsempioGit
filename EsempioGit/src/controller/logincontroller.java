package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

import model.Utente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import validator.UtenteValidator;
import model.Utente;


@Controller
@RequestMapping("/login.do")
public class logincontroller
{
	@Autowired
	private UtenteValidator validatore;
	
	public logincontroller(){
		
	}

	public logincontroller(UtenteValidator validatore) {
		this.validatore= validatore;
	}

	@RequestMapping( method = RequestMethod.POST)
	protected String login(@ModelAttribute("utente") Utente utente, BindingResult errors ) throws IOException
	{
		this.validatore.validate(utente, errors);
		if(errors.hasErrors())
			return "index";
		return "login";

}
}