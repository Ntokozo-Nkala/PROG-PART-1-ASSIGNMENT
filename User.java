import java.util.Scanner;

public class User{
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
    
    
    
      Scanner inputDevice = new Scanner(System.in);
      System.out.print("Enter your First name: ");
      firstName = inputDevice.nextLine();

      System.out.print("Enter your Last name: ");
      lastName = inputDevice.nextLine();

      System.out.print("Enter your Username: ");
      username = inputDevice.nextLine();

      System.out.print("Enter your Password: ");
      password = inputDevice.nextLine();

      System.out.print("Enter South African Number: ");
      cellPhoneNumber = inputDevice.nextLine();
  }


    static boolean checkUserName(String username){
    boolean hasUnderscore = username.contains("_");
    boolean shortEnough = username.length() <= 5;
    return hasUnderscore && shortEnough;
    }
  }
}