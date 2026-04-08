public class Register {
    private String firstName;
    private String lastName; 
    private String userName;
    private String password;
    private String cellPhoneNumber;

    public boolean checkUserName(String userName){
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
    
    public boolean checkCellPhoneNumber(String cellPhoneNumber){
        
    }


    public String registerUser(String userName, String password, String cellPhoneNUmber){

    }

}
