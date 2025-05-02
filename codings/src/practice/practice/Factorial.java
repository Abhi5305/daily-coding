package practice.practice;

public class Factorial {
    public static int fact(int num){
        if(num<1){
            return 1;
        }
        return num*fact(num-1);
    }

    public static void main(String[] args) {
        try{
            System.out.println(fact(4));
        } catch (StackOverflowError e) {
            System.out.println("Stack is full !");
        }
    }
}
