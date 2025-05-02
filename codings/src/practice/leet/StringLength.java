package practice.leet;

public class StringLength {
    //given a sentance find the length of the last string
    //ex: Hello World -> 5
    public static void main(String[] args) {
        String str = "Hello World   ";
        int length = lengthOfLastString(str);
        System.out.println(length);
    }

    private static int lengthOfLastString(String str) {
        int count = 0;
        for(int i = str.length() - 1; i>=0 ; i--){
            char c = str.charAt(i);
            if(c != ' '){
                count++;
            }else if(count>0){
                return count;
            }
        }
        return count;
    }

}
