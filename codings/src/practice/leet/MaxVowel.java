package practice.leet;

public class MaxVowel {
    public static void main(String[] args) {
        // find max number of vowel in sub array of given size
        String str = "abjhiiopl";
        int k =3;
        int count = findMaxCountOfVowel(str,k);
        System.out.println(count);
    }

    private static int findMaxCountOfVowel(String str, int k) {
        int count = 0;
        int res = 0 ;
        char[] ch =  str.toCharArray();
        for(int i = 0; i<k; i++){
            count += isVowel(ch[i]);
        }
        for(int r = k; r<str.length(); r++){
            count += isVowel(ch[r]);
            count -= isVowel(ch[r-k]);
            res = Math.max(res,count);
        }

        return res;
    }

    private static int isVowel(char ch) {
        return (ch == 'a' || ch == 'e'||ch == 'i' || ch == 'o'|| ch == 'u') ? 1:0;
    }
}
