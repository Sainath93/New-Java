package main.java.Runtime_Polymorphism;

public class JAVA extends Universisty{
    public void Course(){
        System.out.print("Course from the Java ");
    }

    public static void main(String[] args) {
        Universisty U = new Universisty();
        Universisty UI = new UI();
        Universisty JAVA = new JAVA();
        U.Course();
        JAVA.Course();

        UI.Course();


    }
}