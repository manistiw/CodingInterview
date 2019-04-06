import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static char firstNonRepeatingChar(String str){
        Map<Character,Integer> maps=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            maps.put(str.charAt(i),maps.containsKey(str.charAt(i))?maps.get(str.charAt(i))+1:1);
        }
        for(Map.Entry<Character,Integer>entry:maps.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        throw new RuntimeException("No character found to be repeating");

    }
}
