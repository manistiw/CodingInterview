package general;

public class StringWithDigits {
    public static boolean isDigit(String strg){
        String witoutDigit= strg.replaceAll("\\d","");
        return witoutDigit.isEmpty();
    }
}
