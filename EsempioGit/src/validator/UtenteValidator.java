package validator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import model.Utente;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class UtenteValidator implements Validator {

	@Override
	public boolean supports(Class arg0) {
		return Utente.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "required.username");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required.password");

		Utente utente= (Utente)arg0;
		final File file = new File("utenti.properties");
		FileInputStream fileInput;
		try {
			fileInput = new FileInputStream(file);

			final Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();
			String password=properties.getProperty(utente.getUsername());
			if(!password.equals(utente.getPassword())){
				errors.rejectValue("username", "errors.username");
			}


		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			errors.rejectValue("username", "errors.system");
		}
		catch (final IOException e)
		{
			errors.rejectValue("username", "errors.system");
		}
		catch (final NullPointerException e)
		{
			errors.rejectValue("username", "errors.system");

		}
	}
}

