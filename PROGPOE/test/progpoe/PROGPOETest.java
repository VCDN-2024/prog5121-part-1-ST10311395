//Katelyn Narain :) ST10311395

package progpoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PROGPOETest {
    
    public PROGPOETest() {
    }

    @Test
    public void testIsValidUsername() {
        //assertEquals  true
        assertTrue(PROGPOE.isValidUsername("ky_1"));
        //system returns
        System.out.println("Welcome <user first name>, <user last name> it is great to see you");
    }
        
    @Test
    public void testIsInvalidUsername() {
        //assertEquals  false
        assertFalse(PROGPOE.isValidUsername("kyle!!!!!!!"));
        System.out.println("Username is not correctly formatted, please ensure you meet requirements");
    }
    
   
    public void testCheckPasswordComplexity() {
        //assertEquals  true
        assertTrue(PROGPOE.checkPasswordComplexity( "Ch&&sec@ke99!"));
        
    }

    public void testInvalidPasswordComplexity(){
        //assertEquals  false
         assertFalse(PROGPOE.checkPasswordComplexity( "password"));
    }
    
    
    
    @Test
    public void testGetEnteredUsername() {
        
    }

    
    @Test
    public void testGetEnteredPassword() {
    }
}

    
