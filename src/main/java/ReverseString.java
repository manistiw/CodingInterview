public class ReverseString {
    public static String reverse(String str){
        StringBuilder strBr=new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--){
            strBr.append(str.charAt(i));
        }
        return strBr.toString();
    }
}
