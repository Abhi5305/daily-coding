package practice.practice;

import java.security.SecureRandom;
import java.util.*;

public class ReferralCode {
    private final String NUMBERS = "0123456789";
    private final String LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private final String ALFANUMERIC = NUMBERS+LETTERS;

    public String generateCode(int codeLength){
        Random random = new SecureRandom();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
        stringBuilder.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
        for (int i=2; i<codeLength; i++){
            int index = random.nextInt(ALFANUMERIC.length());
            stringBuilder.append(ALFANUMERIC.charAt(index));
        }
        return suffleCode(stringBuilder.toString());
    }

    public String suffle(String str){
        char[] ch = str.toCharArray();
        Random secureRandom = new SecureRandom();
        int index = secureRandom.nextInt(str.length());
        for(int i=0;i< ch.length;i++){
            char temp = ch[i];
            ch[i] = ch[index];
            ch[index] = temp;
        }
        return new String(ch);
    }
    public String suffleCode(String string){
        //Convert string to list
        List<Character> characters = new ArrayList<>();
        for(char c : string.toCharArray()){
            characters.add(c);
        }
        //Suffle the list
        Collections.shuffle(characters);
        // convert list back to string
        StringBuilder stringBuilder = new StringBuilder();
        for (char l : characters){
            stringBuilder.append(l);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ReferralCode referralCode = new ReferralCode();
        System.out.println(referralCode.generateCode(6));
    }
}
