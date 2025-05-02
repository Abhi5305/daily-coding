package practice.leet;

public class ReverseOnlyLetters {
    //from given a string reverse only english alphabets
    public static void main(String[] args) {
        String str = "ab-cd";
        String reversed = reverseString(str);
        System.out.println(reversed);
    }

    private static String reverseString(String str) {
        int l = 0;
        int r = str.length()-1;
        char[] c = str.toCharArray();
        while(l < r){
            while(!isEnglish(c[r])){
                r--;
            }
            if(isEnglish(c[l])){
                char temp = c[l];
                c[l] = c[r];
                c[r] = temp;
                r--;
            }

            l++;
        }
        return new String(c);
    }
    public static boolean isEnglish(char c){
        return (c>= 65 && c<=90) || (c>=97 && c<=122);
    }

}
