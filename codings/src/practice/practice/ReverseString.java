package practice.practice;

public class ReverseString {
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(reverse("Hellkheiokmkmo"));
        long e = System.currentTimeMillis();
        System.out.println(e-l);
    }
    public static String reverseInPlace(String str){
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length-1;
        char temp ;
        while(left<=right){
             temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }
}
