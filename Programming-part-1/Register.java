package com.mycompany.nkala.prog.part.assignment;

import java.util.Scanner;

  public class Login{
  public static void main(String[] args){
   String firstName;
   String lastName;
   String username;
   String password;
   String cellPhoneNumber;


    System.out.println("++==================================================++");
    System.out.println("++                                                  ++");
    System.out.println("++                 HI THERE!  ^_^                   ++");
    System.out.println("++      PLEASE REGISTER TO CREATE AN ACCOUNT.       ++");
    System.out.println("++                                                  ++");
    System.out.println("++                                                  ++");
    System.out.println("++==================================================++");
    System.out.println("===================Account Registration===============");


Scanner scanner = new Scanner(System.in);
Login userLogin = new Login();
System.out.println("Enter your First name: ");
firstName = scanner.nextLine();

System.out.println("Enter your Last name: ");
lastName = scanner.nextLine();

System.out.println("Enter a Username: ");
username = scanner.nextLine();

System.out.println("Enter a password: ");
password = scanner.nextLine();

System.out.println("Enter your Cell phone number: ");
cellPhoneNumber = scanner.nextLine();

System.out.println(userLogin.registerUser(firstName, lastName, username, password, cellPhoneNumber));

if(userLogin.username == null){
    System.out.println("Registration failed. Please try again");
    scanner.close();
    return;
}
    System.out.println("++=======================================================++");
    System.out.println("++                                                       ++");
    System.out.println("++  You have successfully registered your account.       ++");
    System.out.println("++      You can now log in to your account. ^_^          ++");
    System.out.println("++                                                       ++");
    System.out.println("++                                                       ++");
    System.out.println("++=======================================================++");
    System.out.println("=====================ACCOUNT LOGIN.=======================");
  System.out.println("Enter your Username: ");
  username = scanner.nextLine();
  System.out.println("Enter your Password: ");
  password = scanner.nextLine();
  System.out.println(userLogin.returnLoginStatus(username, password));
  scanner.close();
  }
    private String lastName;
    private String username;
    private String password;
    private String cellPhoneNumber;
    
    
    ///////////////////////////////////////////////////////
    // THIS checkUserName METHOD CHECKS THE USER NAME    //  
    // THE USERNAME MUST CONSIST OF:                     //
    // *AN UNDERSCORE                                    //
    // * AND SHOULD HAVE 5 OR LESS LETTERS               //
    //  IT RETURNS TRUE IF BOTH CONDITIONS ARE MET       //
    //////////////////////////////////////////////////////
    /// @param username
    /// @return /
public boolean checkUserName(String username){
boolean hasUnderscore = username.contains("_");
boolean shortEnough = username.length() <= 5;
return hasUnderscore && shortEnough;
}
    private String firstName;


   /////////////////////////////////////////////////////////////////////////////////
    // THIS checkUserPasswordComplexity METHOD CHECKS THE USERPASSWORD COMPLEXITY //  
    // THE PASSWORD MUST CONSIST OF:                                             //
    // *AT LEAST EIGHT CHARACTERS LONG                                          //
    // *CONTAINS A CAPITAL LETTER                                              //
    // *CONTAINS A NUMBER                                                     //
    // *CONTAINS A SPECIAL CHARACTER                                         //
    //  IT RETURNS TRUE IF ALL 4 CONDITIONS ARE MET                         //
    ////////////////////////////////////////////////////////////////////////
    /// @param password/
    /// @return 
public boolean checkUserPasswordComplexity(String password){
boolean longEnough = password.length()>= 8;
boolean hasUpper = false;
boolean hasDigit = false;
boolean hasSpecial = false;

for(char c : password.toCharArray()){
    if (Character.isUpperCase(c))        hasUpper   = true;
    if (Character.isDigit(c))            hasDigit   = true;
    if (!Character.isLetterOrDigit(c))   hasSpecial = true;
}
return hasUpper && hasDigit && hasSpecial;
}

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // THIS checkCellPhoneNumber METHOD CHECKS THE FOLLOWING:                                                                      //  
    // THE PHONE NUMBER MUST CONSIST OF:                                                                                          //
    // *A SOUTH AFRICAN INTERNATIONAL CODE WHICH IS +27                                                                          //
    // *THEN THE INTERNATIONAL CODE MUAT BE FOLLOWED BY ANY NUMBERS FROM 0-9                                                    //
    // *THEN NOT MORE THAN 10 CHARACTERS LONG                                                                                  //
    // *IT RETURNS TRUE IF THE 2 CONDITIONS ARE MET                                                                           //
    // *IT THEN REGISTERS THE USER SUCCESSFULLY IF ALL CONDITIONS ARE MET                                                    //
    // *IT SAVES ALL THE REGISTRATION INFORMATION SO THAT WE CAN USE THE INFORMATION IN THE LOGIN                           //
    //  THE REGEX PATTERN IS FROM:                                                                                         //
    //https://www.geeksforgeeks.org/java/java-program-to-check-for-a-valid-mobile-number/                                 //
    //https://www.geeksforgeeks.org/dsa/validate-phone-numbers-with-country-code-extension-using-regular-expression/     //
    //https://www.geeksforgeeks.org/dsa/write-regular-expressions/                                                      //
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /// @param cellPhoneNumber/
    /// @return 
public boolean checkCellPhoneNumber(String cellPhoneNumber){
String phoneNumberRegex = "^\\+27[0-9]{9}$";
return cellPhoneNumber.matches(phoneNumberRegex);
}


    //////////////////////////////////////////////////////////////////////////////////////////// 
    // THIS registerUser METHOD CHECKS ALL THE USERS INFORMATION                             //  
    // IF ALL THE CONDITIONS ARE MET THE THE USER WILL BE SUCCESSFULLY REGISTERED           //
    // *A MESSAGE WILL BE DISPLAYED THAT THE REGISTRATION IS SUCCESSFUL                    //
    // *IF ANY CONDITION IS NOT MET, AN ERROR TEXT OF THAT FIELD WILL BE DISPLAYED        //
    //  *IF THE ENTERED IFNORMATION IS CORRECT THEN IT WILL BE SAVED                     //
    /////////////////////////////////////////////////////////////////////////////////////
    /// @param firstName
    /// @param lastName
    /// @param username
    /// @param password
    /// @param cellPhoneNumber
    /// @return /
public String registerUser(String firstName, String lastName, String username, String password, String cellPhoneNumber){
  if(!checkUserName(username)){
   return "Username is not correctly formatted; please ensure that your usernamecontains an underscore and is no more than five characters in length.";
  }

if(!checkUserPasswordComplexity(password)){
   return"Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
}
    if(!checkCellPhoneNumber(cellPhoneNumber)){
       return "Cell phone number incorrectly formatted or does not contains international code.";
    }

    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
    this.cellPhoneNumber = cellPhoneNumber;

  return "Your Account is successfully registered! Welcome," + firstName +"."; 
}
  
    ////////////////////////////////////////////////////////////////////////////////////
    // THIS loginUser METHOD USES THE SAME USERNAME AND PASSWORD TO LOGIN            //  
    // IT VERIFIES THE USER'S                                                       //
    // IT CHECKS IF:                                                               //
    // *ENTERED USERNAME AND PASSWORD ENTERED MATCHES THE SAVED                   //                       
    // *IF BOTH CONDITIONNS ARE MET THE USER CAN LOG IN THEN SEE THE WELCOME PAGE//
    /////////////////////////////////////////////////////////////////////////////
    /// @param userName/
    /// @param password
    /// @return 
 public boolean loginUser(String userName, String password){
  
  if(this.username == null) return false;
  return this.username.equals(userName) && this.password.equals(password);

}

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // THIS returnLoginStatus METHOD USES THE INFORMATION IN loginUser TO RETURN THE APPROPRIATE LOG IN STATUS // 
    // *IF BOTH CONDITIONNS ARE MET THE USER CAN LOG IN THEN SEE THE WELCOME PAGE                             //
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 ///
 ////// @param userName/
    /// @param password
    /// @return 
public String returnLoginStatus(String userName, String password){
  if(loginUser(userName, password)){
    return"Welcome" + firstName + "," + lastName + "." + "It is nice to see you again.";
  }
    else{
      return"Username or password incorrect. please try again.";
    }
  }

    
}

