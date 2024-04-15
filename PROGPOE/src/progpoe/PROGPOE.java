//Katelyn Narain  :) ST10311395
package progpoe;
import javax.swing.JOptionPane;

public class PROGPOE {
 private String username;
 private String password;
 
 
    public PROGPOE () {
        //setters
        this.username = username;
        this.password = password;
        
       }
//get username 
 public static String getUsername() {
        return JOptionPane.showInputDialog("Enter username (must be 5 characters long and contain an underscore):");
    }
 //check if usernane meets requirements
 public static boolean isValidUsername(String username) {
        return username != null && username.length() == 5 && username.contains("_");
    }
 //get password
 public static String getPassword() {
        return JOptionPane.showInputDialog("Enter password (must be 5 characters long and contain an underscore):");
    }
 //check if password meets requirements
 public static boolean checkPasswordComplexity(String password)
    {   
       
        
        //regex declared to make sure there are capital ltters, numbers and special characters
         /*
        Title: how to validate password with regular expression
        Author: mkyong
        Date: 5 November 2020
        Code version: 1
        Availability: https://mkyong.com/regular-expressions/how-to-validate-password-with-regular-expression/
        */
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$";
        //if the password has 8 characters and matches regex 
        
        return (password.length() >= 8 && password.matches(regex));
        
    }
 //get first name
 public static String getFirstname() {
        return JOptionPane.showInputDialog("Enter First name:");
    }
 //get last name
 public static String getLastname() {
        return JOptionPane.showInputDialog("Enter last name:");
    }
 //get username to login
public static String getEnteredUsername() {
        return JOptionPane.showInputDialog("Enter username to login:");
    }
//get password to login
 public static String getEnteredPassword() {
        return JOptionPane.showInputDialog("Enter password to login:");
    }  
 
 //main
    public static void main(String[] args) {

        //output get username
        String username = getUsername();
        
        //output get password
        String password = getPassword();
        //check if username meets requirements
        if (isValidUsername(username)){
        //output message if it meets requirements
        JOptionPane.showMessageDialog(null, "Username successfully captured");
        
        
        
        //check if password meets requirements
        if(checkPasswordComplexity(password)){
        //output message if it meets requirements
        JOptionPane.showMessageDialog(null, "Password successfully captured");
         }
            //if password does not meet requirements                                  
            else {
               //output message
               JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and special character");
               //returns to main (asks the user to enter username)
               main(null); 
            }
                } 
        //if username does not meet requirements
        else {
            //output message
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore ans is no longer than 5 characters in length");
           //re run program and ask user for username again
            main(null); 
        } 
        
        //output get first name
        String firstname = getFirstname();
        
        //output get last name
        String lastname = getLastname();
        
    //  PROGPOE user = new PROGPOE(username, password);
        // Simulate login process
        String enteredUsername = getEnteredUsername();
        String enteredPassword = getEnteredPassword();
        
        // Check if entered credentials match sign up account
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            
            JOptionPane.showMessageDialog(null, "Welcome " + firstname + " " + lastname + " it is great to see you again");
        } else {
            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again");
             main(null);  
        }
}
}
//Katelyn Narain  :) ST10311395
    

