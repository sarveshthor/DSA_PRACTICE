package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//find the occurence of each character in a given string
public class OccurenceChar {


    public static void main(String[] args) {

    String s1 = "sarveshrohira";

    char[] ch = s1.toCharArray();
    Arrays.sort(ch);
    String s = new String(ch);

    HashMap<Character, Integer> map = new HashMap<>();

    int n = s.length();

        for(int i = 0 ; i<n ; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, 1 + map.get(c));
            }
            else{
                map.put(c, 1);
            }
        }

    for(Map.Entry<Character, Integer> entry : map.entrySet()){
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }


}
}
