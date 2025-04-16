/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationlogin2;
//Tsholofelo Molomo ST10481285
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class RegistrationLogin2 {

    
    
 final Map<String, User>users; 
//constructor to initialize the registration
   
    public
    RegistrationLogin2()  {  
   users = new HashMap<>();
    }    
     //Method to create a new user account     
    public void register(){
    String username = JOptionPane.showInputDialog("Enter username");
    String password = JOptionPane.showInputDialog("Enter password");
    String cellPhoneNumber = JOptionPane.showInputDialog("Enter South African cell phone number");
    String firstName  = JOptionPane.showInputDialog("Enter first name");
    String lastName = JOptionPane.showInputDialog("Enter last name");
    
    if(checkUserName(username)){
    if(checkPassword(password)){
    if(checkcellPhoneNumber(cellPhoneNumber)){
    users.put(username, new User(username, password, cellPhoneNumber, firstName, lastName));
    JOptionPane.showMessageDialog(null, "Registration successful!");
    } else {
    JOptionPane.showMessageDialog(null,"Cell phone number incorrctly formatted or does not contain international code");
    }
    } else {
    JOptionPane.showMessageDialog(null, "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
    }
    } else {
    JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please contains an underscore and is no more than five characters in length.");
    }
    }
    
    //Method to authenticate a user
    public void login(){
    String username = JOptionPane.showInputDialog("Enter username");
    String password = JOptionPane.showInputDialog("Enter password");
    
    User user = users.get(username);
    if(users != null && users.get(username).getPassword().equals(password)){

    JOptionPane.showMessageDialog(null, "Welcome" + user.getFirstName() + "," + user.getLastName() + "it is great to see you again.");
    } else{
    JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.");
  }
    }
    // Method to validate username format
    public boolean checkUserName(String username){
    return
    username.length()<= 5 && username.contains("_");
    }
    //Method to validate password format
    public boolean checkPassword(String password){
       Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z\\d]).{8,}$");
       Matcher matcher = pattern.matcher(password);
       return
       matcher.matches();
    }
    //Method to validate cell phone number format
    public boolean checkcellPhoneNumber(String cellPhoneNumber){
    Pattern pattern = Pattern.compile("^\\+27\\d{9}$");
    Matcher matcher = pattern.matcher(cellPhoneNumber);
    return
    matcher.matches();
    }
    
    public void run(){
    while (true) {
    int option = Integer.parseInt(JOptionPane.showInputDialog("1. Register\n2. Login\n3. Exit"));
    switch(option){
        case 1:
            register();
            break;
        case 2:
            login();
            break;
        case 3:
            System.exit(0);
            break;
        default:
    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
            
    }
    }
    } 
public static void main(String[] args){
RegistrationLogin2 system = new RegistrationLogin2();
system.run();
}
}

class User {
private String username;
private String password;
private String cellPhoneNumber;
private String firstName;
private String lastName;

public User(String username, String password, String cellPhoneNumber, String firstName, String lastName){
this.username = username;
this.password = password;
this.cellPhoneNumber = cellPhoneNumber;
this.firstName = firstName;
this.lastName = lastName;
}
public String getPassword(){
return password;    
}
public String getFirstName(){
return firstName;
}
public String getLastName(){
return lastName;    
}
    }
//Java Programming Joyce Farrell(2012)
//Shaping the direction of Java Mark Reinhold(2012
// AI(for phone pattern assistance)
//Regex(for pattern testing)












