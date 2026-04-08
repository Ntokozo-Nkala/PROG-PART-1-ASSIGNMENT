public class Register {
    private String firstName;
    private String lastName; 
    private String username;
    private String password;
    private String cellPhoneNumber;

    public boolean checkUserName(String username){
    boolean hasUnderscore = userName.contains("_");
    boolean shortEnough = userName.length() <= 5;
    return hasUnderscore && shortEnough; 
    }

    public boolean checkUserPasswordComplexity(String password){
        boolean shortEnough = password.length() < 8;
        boolean hasCapital = true;
        booolean hasNumber = true;
        boolean hasSpecialCharacter = true;
        return shortEnough && hasCapital && hasNmber && hasSpecialCharacter;
    }
    
    //the checkCellPhoneNUmber method checks the following:
    //the number must start with the south african international code which is +27
    //then the international code must be followed by any number starting from 0-9
    //the method will then allow the user to input exactly 9 numbers, nothing more nothing less
    //the regex pattern is from:
    //https://www.geeksforgeeks.org/java/java-program-to-check-for-a-valid-mobile-number/
    //https://www.geeksforgeeks.org/dsa/validate-phone-numbers-with-country-code-extension-using-regular-expression/
    //https://www.geeksforgeeks.org/dsa/write-regular-expressions/
    public boolean checkCellPhoneNumber(String phoneNumber){
    String phoneNumberRegex.matches = "^\\+27[0-9]{9}$";
    return phoneNumber.matches(phoneNumberRegex); //return phoneNumber.matches("^\\+27[0-9]{9}$")
    }

    public String registerUser(String username, String password, String phoneNumber){
    if(registerUser(username) && (password)){
        return "You have been registered successfully";
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
    }



public class Login{
    private String userName;
    private String password;

    public boolean checkUsername(String userName){
        boolean hasUnderscore = userName.contains("_");
        boolean shortEnough = userName.length() <= 5;
    return hasUnderscore && shortEnough;
}
   public boolean checkPasswordComplexity(String password){
    boolean shortEnough = password.length() < 8;
    boolean hasCapital= true;
    boolean hasNumber = true;
    boolean hasSpecialCharacter = true;
    return shortEnough && hasCapital && hasNumber && hasSpecialCharacter;
   }
}
}
