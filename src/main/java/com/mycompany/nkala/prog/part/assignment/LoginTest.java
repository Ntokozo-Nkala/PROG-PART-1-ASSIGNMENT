/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClasses;
import com.mycompany.nkala.prog.part.assignment.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** 
 * @author Ntokozo
 */
public class LoginTest {
    @Test
    public void testCheckUserNameCorrectlyFormatted() {
    Login login = new Login();
    String expected = "Your Account is successfully registered! Welcome,kyl.";
    String Actual = login.registerUser("kyl", "nkala", "kyl_1", "Ch&&sec@ke99!", "+27821234567");
    assertEquals(expected,Actual,"Your Account is successfully registered! Welcome,kyl.");
    }
    @Test
    public void testCheckUsePasswordComplexity() {
    Login login = new Login();
    String expected = "Your Account is successfully registered! Welcome,kyl.";
    String Actual = login.registerUser("kyl", "nkala", "kyl_1", "Ch&&sec@ke99!", "+27821234567");
    assertEquals(expected,Actual,"Your Account is successfully registered! Welcome,kyl.");
    }
    @Test
    public void testCheckCellPhoneNumber() {
    Login login = new Login();
    String expected = "Your Account is successfully registered! Welcome,kyl.";
    String Actual = login.registerUser("kyl", "nkala", "kyl_1", "Ch&&sec@ke99!", "+27821234567");
    assertEquals(expected,Actual,"Your Account is successfully registered! Welcome,kyl.");
    }
    
   @Test
   public void returnLoginStatus(){
   Login login = new Login();
   String expected = "Welcome kyle,nkala. It is nice to see you again.";
   String Actual = login.returnLoginStatus("kyl_1", "Ch&&sec@ke99!");
   assertEquals(expected, Actual,"Welcome kyle,nkala. It is nice to see you again." );
   }
    
    
}
