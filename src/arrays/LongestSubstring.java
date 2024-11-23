package arrays;

import java.util.HashMap;

//find the length of longest substring with non-repeating characters
public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcdefabcbb";

        HashMap<Character, Integer> map = new HashMap<>();

        int n = s.length();
        int max_length = 0;
        int start = 0;

        for(int i = 0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch) && map.get(ch) >= start){
                start = map.get(ch) + 1;
            }

            map.put(ch, i);
            //keep calculating length at every index
            max_length = Math.max(max_length, i - start + 1);
        }

        System.out.println(max_length);
    }
}
