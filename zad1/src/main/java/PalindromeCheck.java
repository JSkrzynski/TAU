import java.util.Locale;

public class PalindromeCheck {
    public String isPalindrome(String str){
        String reversed = "";
        str = str.toLowerCase(Locale.ROOT).replace(" ","");
        for (int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        if(str.equals(reversed)) {
            return "YES";
        }
        return "NO";
    }
    public boolean isPalindromeButResponseInBoolean(String str){
        String reversed = "";
        str = str.toLowerCase(Locale.ROOT).replace(" ", "");
        for (int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        if(str.equals(reversed)) {
            return true;
        }
        return false;
    }

}