package practice.interview;

public class Gravity {
    public static void main(String[] args) {
        String[] str = new String[]{"cared","racecar","car"};
        String result = longestPrefix(str);
        System.out.println(result);
    }

    private static String longestPrefix(String[] str) {
        String prefix = str[0]; //start
        for (int i = 0; i <str.length ; i++) {
            while(!str[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){ // if there is no prefix
                    return "";
                }
            }
        }
        return prefix;
    }

}
