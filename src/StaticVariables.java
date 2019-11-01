/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class StaticVariables {
    
      public static  String userName = "";
      public static int userId = 0;
      
public static boolean isValidEmailAddress(String email) {
    boolean stricterFilter = true; 
    String stricterFilterString = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";
    String laxString = ".+@.+\\.[A-Za-z]{2}[A-Za-z]*";
    String emailRegex = stricterFilter ? stricterFilterString : laxString;
    java.util.regex.Pattern p = java.util.regex.Pattern.compile(emailRegex);
    java.util.regex.Matcher m = p.matcher(email);
    return m.matches();
}

public static boolean isValidPhone(String phone){
    boolean stricterFilter = true;
    String stricterFilterString = "^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$";
    String laxString = "^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$";
    String pphoneRegex = stricterFilter ? stricterFilterString : laxString;
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(pphoneRegex);
        java.util.regex.Matcher m = p.matcher(phone);
        
        return m.matches();
}
    
}
    


