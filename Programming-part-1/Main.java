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
}
  public void login(){
  System.out.print("You can now login.");
  System.out.println("Enter your userName: ");
  Scanner scanner = new Scanner(System.in);
  userName = scanner.nextLine();
  System.out.println("Enter your password: ");
  password = scanner.nextLine();
}

public boolean checkUserName(String Name){
boolean hasUnderscore = userName.contains("_");
boolean shortEnough = userName.length() <= 5;
return hasUnderscore && shortEnough;
}

public boolean checkUserPasswordComplexity(String password){
boolean shortEnough = password.length() < 8;
boolean hasCapital = false;
boolean hasNumber = false;
boolean hasSpecialCharacter = false;
return shortEnough && hasCapital && hasNumber && hasSpecialCharacter;
}

public boolean checkCellPhoneNumber(String cellPhoneNumber){
String phoneNumberRegex = "^\\+27[0-9]{9}$";
if(cellPhoneNumber.matches(phoneNumberRegex)){
  System.out.println("Cell phone number successfully added");
}
return cellPhoneNumber.matches(phoneNumberRegex);
}

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
 
public boolean loginUser(String userName, String password){
  
  if(this.userName == null) return false;
  return this.userName.equals(userName) && this.password.equals(password);

}


public String returnLoginStatus(String userName, String password){
  if(loginUser(userName, password)){
    return"Welcome," + firstName + lastName + "." + "It is nice to see you again.";
  }
    else{
      return"Username or password incorrect. please try again.";
    }
  }
}
