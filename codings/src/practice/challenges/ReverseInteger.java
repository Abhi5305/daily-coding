package practice.challenges;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        //int x = 9792798;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer value : ");
        int x = sc.nextInt();
        System.out.print(reverseInt(x));
    }

    private static int reverseInt(int x) {
        int result = 0 ;
        while(x>0){
            result = result*10 + x%10;
            x /= 10;
        }
        return result;
    }
}
