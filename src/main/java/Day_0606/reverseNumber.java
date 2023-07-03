package main.java.Day_0606;

public class reverseNumber {

    public static void main (String[] arg){
        int n=12345;
        int reverse=0;
        while(n!=0){
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n /10;
        }
        System.out.println(reverse);
    }
}
