import java.util.Scanner;

public class Main{
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
    System.out.println("[]+++++++++++Account Registration++++++++++++[]");

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your first name: ");
String firstName = scanner.nextLine();

System.out.print("Enter your Last name: ");
String lastName = scanner.nextLine();

System.out.print("Enter your username: ");
String userName = scanner.nextLine();

System.out.print("Enter your password: ");
String password = scanner.nextLine();

System.out.print("Enter your cell phone number: ");
String cellPhoneNumber = scanner.nextLine();



System.out.println("\nYour information has been successfully saved: ");
System.out.println("First Name: " + firstName);
System.out.println("Last Name: " + lastName);
System.out.println("Username: " + userName);
System.out.println("Password: " + password);
System.out.println("Cell Phone Number: " + cellPhoneNumber);

  System.out.print("You can now login.");
  System.out.println("Enter your userName: ");
  Scanner scanner = new Scanner(System.in);
  userName = scanner.nextLine();
  System.out.println("Enter your password: ");
  password = scanner.nextLine();
    
    ///////////////////////////////////////////////////////
    // THIS checkUserName METHOD CHECKS THE USER NAME    //  
    // THE USERNAME MUST CONSIST OF:                     //
    // *AN UNDERSCORE                                    //
    // * AND SHOULD HAVE 5 OR LESS LETTERS               //
    //  IT RETURNS TRUE IF BOTH CONDITIONS ARE MET       //
    ///////////////////////////////////////////////////////
public boolean checkUserName(String userName){
boolean hasUnderscore = userName.contains("_");
boolean shortEnough = userName.length() <= 5;
return hasUnderscore && shortEnough;
}


   /////////////////////////////////////////////////////////////////////////////////
    // THIS checkUserPasswordComplexity METHOD CHECKS THE USERPASSWORD COMPLEXITY //  
    // THE PASSWORD MUST CONSIST OF:                                             //
    // *AT LEAST EIGHT CHARACTERS LONG                                          //
    // *CONTAINS A CAPITAL LETTER                                              //
    // *CONTAINS A NUMBER                                                     //
    // *CONTAINS A SPECIAL CHARACTER                                         //
    //  IT RETURNS TRUE IF ALL 4 CONDITIONS ARE MET                         //
    /////////////////////////////////////////////////////////////////////////
public boolean checkUserPasswordComplexity(String password){
boolean longEnough = password.length() >= 8;
boolean hasCapital = false;
boolean hasNumber = false;
boolean hasSpecialCharacter = false;
return shortEnough && hasCapital && hasNumber && hasSpecialCharacter;
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
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
    //////////////////////////////////////////////////////////////////////////////////////
public String registerUser(String firstName, String lastName, String userName, String password, String cellPhoneNumber){
  if(!checkUserName(userName)){
    System.out.println("Username is not correctly formatted; please ensure that your usernamecontains an underscore and is no more than five characters in length.");
  }

if(!checkUserPasswordComplexity(password)){
   System.out.println("PASSWORD IS NOT CORRECTLT FORMATTED; PLEASE ENSURE THAT THE PASSWORD CONATINS ATA LEAST EIGHT CHARACTERS, A CAPITAL LETTER, A NUMBER, AND A SPECIAL CHARACTER.");
}
    if(!checkCellPhoneNumber(cellPhoneNumber)){
       System.out.println("CELL PHONE NUMBER INCORRECTLY FORMATTED OR DOES NOT CONTAIN INTERNATIONAL CODE.");
    }

    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.password = password;
    this.cellPhoneNumber = cellPhoneNumber;

  return "Your Accound is successfully! Welcome," + firstName +"."; 
}
  
    ////////////////////////////////////////////////////////////////////////////////////
    // THIS loginUser METHOD USES THE SAME USERNAME AND PASSWORD TO LOGIN            //  
    // IT VERIFIES THE USER'S                                                       //
    // IT CHECKS IF:                                                               //
    // *ENTERED USERNAME AND PASSWORD ENTERED MATCHES THE SAVED                   //                       
    // *IF BOTH CONDITIONNS ARE MET THE USER CAN LOG IN THEN SEE THE WELCOME PAGE//
    //////////////////////////////////////////////////////////////////////////////
public boolean loginUser(String userName, String password){
  
  if(this.userName == null) return false;
  return this.userName.equals(userName) && this.password.equals(password);

}

 //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // THIS returnLoginStatus METHOD USES THE INFORMATION IN loginUser TO RETURN THE APPROPRIATE LOG IN STATUS // 
    // *IF BOTH CONDITIONNS ARE MET THE USER CAN LOG IN THEN SEE THE WELCOME PAGE                             //
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
public String returnLoginStatus(String userName, String password){
  if(loginUser(userName, password)){
    return"Welcome," + firstName + lastName + "." + "It is nice to see you again.";
  }
    else{
      return"Username or password incorrect. please try again.";
    }
  }
}
