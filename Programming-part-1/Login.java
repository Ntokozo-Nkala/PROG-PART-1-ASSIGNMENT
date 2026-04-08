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