package controller;

import model.Utente;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/requestLogin.do")
public class redirectController {
	@RequestMapping(method={org.springframework.web.bind.annotation.RequestMethod.GET})
	  protected String handleRequestInternal(@ModelAttribute("utente") Utente utente)
	    throws Exception
	  {
	    return "index";
	  }
}
