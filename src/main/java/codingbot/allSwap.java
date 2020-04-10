package codingbot;
//We'll say that 2 strings "match" if they are non-empty and
//their first chars are the same. Loop over and then return the given array
//of non-empty strings as follows: if a string matches an earlier string in
//the array, swap the 2 strings in the array. When a position in the array
//has been swapped, it no longer matches anything. Using a map, this can be
//solved making just one pass over the array. More difficult than it looks.
// allSwap(["ab", "ac"]) → ["ac", "ab"]
// allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
// allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]

import java.util.HashMap;
import java.util.Map;

public class allSwap {
    public static void main(){

    }
    public String[] allSwap(String[] strings) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<strings.length;i++){
            if(map.containsKey(strings[i].substring(0,1))){
                String temp=strings[i];
                strings[i]=strings[map.get(strings[i].substring(0,1))];
                strings[map.get(strings[i].substring(0,1))]=temp;
                map.remove(strings[i].substring(0,1));
            }
            else{
                map.put(strings[i].substring(0,1),i);
            }
        }
//Tests:
//allSwap(["ab", "ac"]) → ["ac", "ab"]	["ac", "ab"]	OK
//allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]	["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]	OK
//allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]	["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]	OK
//allSwap(["ax", "bx", "cx", "ay", "cy", "aaa", "abb"]) → ["ay", "bx", "cy", "ax", "cx", "abb", "aaa"]	["ay", "bx", "cy", "ax", "cx", "abb", "aaa"]	OK
//allSwap(["easy", "does", "it", "every", "ice", "eaten"]) → ["every", "does", "ice", "easy", "it", "eaten"]	["every", "does", "ice", "easy", "it", "eaten"]	OK
//allSwap(["list", "of", "words", "swims", "over", "lily", "water", "wait"]) → ["lily", "over", "water", "swims", "of", "list", "words", "wait"]	["lily", "over", "water", "swims", "of", "list", "words", "wait"]	OK
//allSwap(["4", "8", "15", "16", "23", "42"]) → ["42", "8", "16", "15", "23", "4"]	["42", "8", "16", "15", "23", "4"]	OK
//allSwap(["aaa"]) → ["aaa"]	["aaa"]	OK
//allSwap([]) → []	[]	OK
//allSwap(["a", "b", "c", "xx", "yy", "zz"]) → ["a", "b", "c", "xx", "yy", "zz"]	["a", "b", "c", "xx", "yy", "zz"]	OK



        return strings;
    }
}
