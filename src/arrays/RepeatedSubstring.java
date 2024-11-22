package arrays;

/*Given a string ‘str’, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

Examples:

Input: str = "abcabcabc"
Output: true
The given string is 3 times repetition of "abc"*/

public class RepeatedSubstring {

    public static void main(String[] args) {
        String s = "abcabcab";
        System.out.println(repeatedSub(s));
    }

    public static boolean repeatedSub(String s){
        int n = s.length();

        for(int i = n/2 ; i>0 ; i--){

            if(n%i == 0){
                StringBuilder sb = new StringBuilder();
                String subString = s.substring(0,i);//i not included
                for(int j = 0 ; j<n/i ; j++){
                    sb.append(subString);
                }

                if(sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
