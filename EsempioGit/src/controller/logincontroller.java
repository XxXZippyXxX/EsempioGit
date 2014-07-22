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
	protected String login(@ModelAttribute("utente") Utente utente) throws IOException
	{
		try
		{
			final File file = new File("utenti.properties");
			final FileInputStream fileInput = new FileInputStream(file);
			final Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();
			String password=properties.getProperty(utente.getUsername());
			if(password.equals(utente.getPassword()))
				return "login";
			else{
				return "loginko";
			}

			//               final Enumeration enuKeys = properties.keys();
			//               while (enuKeys.hasMoreElements())
			//               {
			//                      final String key = (String) enuKeys.nextElement();
			//                      final String value = properties.getProperty(key);
			//                      System.out.println(key + ": " + value);
			//               }
		}
		catch (final FileNotFoundException e)
		{
			return "loginko";
		}
		catch (final IOException e)
		{
			return "loginko";
		}
	}

}