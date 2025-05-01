package ArraysPractice;
/*
Given a string,
return a string where every appearance of the lowercase word "is"
has been replaced with "is not". The word "is"
should not be immediately preceeded or followed by a
letter -- so for example the "is" in "this" does not count.
(Note: Character.isLetter(char) tests if a char is a letter.)
 */
public class NotIs {
    public static String notReplace(String str) {
        //can also be solved using str.replaceAll("\\bis\\b","is not");
        StringBuilder strBlder=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            if((i+1)<=str.length() && str.charAt(i)=='i' && str.charAt(i+1)=='s'){
                boolean start=i==0||!Character.isLetter(str.charAt(i-1));
                boolean end=(i+1)==str.length()-1 || !Character.isLetter(str.charAt(i+2));
                if(start && end){
                    strBlder.append("is not");
                    i=i+1;
                }
                else{
                    strBlder.append("is");
                    i=i+1;
                }
            }
            else{
                strBlder.append(str.charAt(i));
            }
        }
        return strBlder.toString();
    }
    public static void main(String srgs[]){
         notReplace("is test").equals("is not test");
        notReplace("is-is").equals("is not-is not");
        notReplace("This is right").equals("This is not right");
        notReplace("This is isabell").equals("This is not isabell");
        notReplace("").equals("");
        notReplace("is").equals("is not");
        notReplace("isis").equals("isis");
        notReplace("Dis is bliss is").equals("Dis is not bliss is not");
        notReplace("is his").equals("is not his");
        notReplace("xis yis").equals("xis yis");
        notReplace("AAAis is").equals("AAAis is not");
    }
}
