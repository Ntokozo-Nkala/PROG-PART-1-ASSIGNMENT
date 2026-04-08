public class Register {
    private String firstName;
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
    ///////////////////////////////////////////////////////
    public boolean checkUserName(String username){
    boolean hasUnderscore = userName.contains("_");
    boolean shortEnough = userName.length() <= 5;
    return hasUnderscore && shortEnough; // can also be return;
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
        boolean shortEnough = password.length() < 8;
        boolean hasCapital = false;
        booolean hasNumber = false;
        boolean hasSpecialCharacter = false;
        return shortEnough && hasCapital && hasNmber && hasSpecialCharacter;
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
    public boolean checkCellPhoneNumber(String phoneNumber){
    return phoneNumber.matches = "^\\+27[0-9]{9}$";
    }


    //////////////////////////////////////////////////////////////////////////////////////////// 
    // THIS registerUser METHOD CHECKS ALL THE USERS INFORMATION                             //  
    // IF ALL THE CONDITIONS ARE MET THE THE USER WILL BE SUCCESSFULLY REGISTERED           //
    // *A MESSAGE WILL BE DISPLAYED THAT THE REGISTRATION IS SUCCESSFUL                    //
    // *IF ANY CONDITION IS NOT MET, AN ERROR TEXT OF THAT FIELD WILL BE DISPLAYED        //
    //  *IF THE ENTERED IFNORMATION IS CORRECT THEN IT WILL BE SAVED                     //
    //////////////////////////////////////////////////////////////////////////////////////
    public String registerUser(String firstName, String lastName, String username, String password, String phoneNumber){
    if(registerUser(username.equals(checkUserName) && password.equals(checkUserPasswordComplexity))){
        return "Hi" + "," + firstName + "Your account has been registered successfully!";
    }
    else if(!checkUserName(username)){
        return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length";
    }
    else if(!checkPasswordComplexity(password)){
        return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number and a special character.";
    }
    if(phoneNumber){
        return "Cell phone number successfully added.";
    }
    else{
        return "Cell phone number incorrectly formatted or does not contain international code";
    }

    //the register now saves the information and used in the login. 
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
    this.cellPhoneNumber = phoneNumber;

}    

    ////////////////////////////////////////////////////////////////////////////////////
    // THIS loginUser METHOD USES THE SAME USERNAME AND PASSWORD TO LOGIN            //  
    // IT VERIFIES THE USER'S                                                       //
    // IT CHECKS IF:                                                               //
    // *ENTERED USERNAME AND PASSWORD ENTERED MATCHES THE SAVED                   //                         //
    // *IF BOTH CONDITIONNS ARE MET THE USER CAN LOG IN THEN SEE THE WELCOME PAGE//
    //////////////////////////////////////////////////////////////////////////////
    public boolean loginUser(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            return true;
        }
        else{
            return false;
        }
   }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // THIS returnLoginStatus METHOD USES THE INFORMATION IN loginUser TO RETURN THE APPROPRIATE LOG IN STATUS // 
    // *IF BOTH CONDITIONNS ARE MET THE USER CAN LOG IN THEN SEE THE WELCOME PAGE                             //
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////  
   public String returnLoginStatus(String username, String password){
    if(loginUser.equals(username) && loginUser.equals(password)){
        return "Welcome back" + ","  + firstName + lastName + "it is great to see you!";
    }
    else{
        return "Login failed, please ensure that the Username amd Password are correctly formatted";
    }
}
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}

