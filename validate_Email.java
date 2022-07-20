package Validate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;


public class validate_Email {

	 public static boolean isValidEmail(String email)
	    {
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
	                            "[a-zA-Z0-9_+&*-]+)*@" +
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
	                            "A-Z]{2,7}$";
	                              
	        Pattern pat = Pattern.compile(emailRegex);
	        if (email == null)
	            return false;
	        return pat.matcher(email).matches();
	    }
	  
	    public static void main(String[] args)
	    {
	        ArrayList<String> result = new ArrayList<>();
	            
	          result.add("ritesh.dwivedi_cs18@gla.ac.in");
	          result.add("writing.soul.org");
	          result.add("riteshkumar96977@gmail.com");
	          
	            
	        for(String i : result){
	            if (isValidEmail(i))
	                System.out.println(i + " - is a Valid emailId");
	            else
	                System.out.println(i + " - is not a valid emailId");
	        }
	    }
	}
