package practice.interview;

public class rotateString {
    public static String rotateClockwise(String string, int d){
        int n = string.length();
        if(n==0){
            return "";
        }
        d = d%n;
        return string.substring(n-d)+string.substring(0,n-d);
    }

    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(rotateClockwise(str,9));
    }
}
