import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Radar" ,strReversed= "";
        int strLength = str.length();
        for (int i =(strLength - 1); i>= 0; --i){
             char Str = strReversed.charAt(i);

        }
        if (str.toLowerCase().equals(str.toLowerCase())){
            System.out.println(str + " if the number is palindrome ");
        }else {
            System.out.println(str + " if the number is not palindrome");
        }
    }
}
