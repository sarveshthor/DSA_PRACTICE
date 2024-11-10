package Strings;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ls = groupAnagrams(arr);
        System.out.println(ls.toString());
    }

    public static List<List<String>> groupAnagrams(String[] arr){
        int n = arr.length;

        List<List<String>> res = new ArrayList<>();

        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        for(int i = 0 ; i<n ; i++){
            String s = arr[i];
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedString = new String(c);

            if(!hm.containsKey(sortedString)){
                hm.put(sortedString, new ArrayList<>());
            }
            hm.get(sortedString).add(s);
        }

        for(Map.Entry<String, ArrayList<String>> entry : hm.entrySet()){
            res.add(entry.getValue());
        }

        return res;
    }
}
