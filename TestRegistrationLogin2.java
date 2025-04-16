
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class TestRegistrationLogin2 {
    
@Test
public void TestcheckUserName(){
TestRegistrationLogin2 system = new TestRegistrationLogin2();
boolean result = system.checkUserName("kyl_1");
assertTrue(result);
}
@Test
public void TestcheckUserName2(){
TestRegistrationLogin2 system = new TestRegistrationLogin2();
boolean result = system.checkUserName("kyle!!!!!!!");
assertFalse(result);
}
@Test
public void TestcheckPassword(){
TestRegistrationLogin2 system = new TestRegistrationLogin2();
boolean result = system.checkPassword("ch&&sec@ke99!");
assertTrue(result);
}
@Test
public void TestcheckPassword2(){
TestRegistrationLogin2 system = new TestRegistrationLogin2();
boolean result = system.checkPassword("password");
assertFalse(result);
}
@Test
public void TestcheckcellPhoneNumber(){
TestRegistrationLogin2 system = new TestRegistrationLogin2();
boolean result = system.checkcellPhoneNumber("+27838968976");
assertTrue(result);
}
@Test
public void TestcheckcellPhoneNumber2(){
TestRegistrationLogin2 system = new TestRegistrationLogin2();
boolean result = system.checkcellPhoneNumber("08966553");
assertFalse(result);
}

    private boolean checkcellPhoneNumber(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean checkPassword(String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean checkUserName(String kyle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

//Java Programming Joyce Farrell(2012)
//Shaping the direction of Java Mark Reinhold(2012
// AI(for phone pattern assistance)
//Regex(for pattern testing)







