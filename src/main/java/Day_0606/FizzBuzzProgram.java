package main.java.Day_0606;

public class FizzBuzzProgram {
    public static void main(String[] arg){
        int n=100;
        for (int i=1;i<=100;i++){
            if (i % 5 == 0 && i % 3 == 0 ){
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else
                System.out.println(i+" ");

        }
    }
}
