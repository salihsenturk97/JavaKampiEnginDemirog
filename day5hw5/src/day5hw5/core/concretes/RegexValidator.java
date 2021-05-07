package day5hw5.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5hw5.core.abstracts.EmailValidator;
import day5hw5.entities.concretes.User;

public class RegexValidator implements EmailValidator {

	@Override
	public boolean validator(User user) {
		

		String regex =  "^(.+)@(.+).(\\.com|io)$";
		
          
            if(!(user.getEmail().matches(regex))) {
            	System.out.println("Hatalý mail adresi");
            	return true;
            }
            else {
    			return false;
    		}
	}

}
