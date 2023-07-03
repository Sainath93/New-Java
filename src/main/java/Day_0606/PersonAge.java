package main.java.Day_0606;

public class PersonAge {

    public static void age(int age){
        if(age < 13){
            System.out.println("Kid");
        } else if (age > 13 && age <19) {
            System.out.println("Teen");
        }
        else if(age > 19){
        System.out.println("Adult");

        }

    }
    public static void main(String[] arg){
        int age = 14;
        age(age);
    }
}