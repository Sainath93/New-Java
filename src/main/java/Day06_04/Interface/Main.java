package main.java.Day06_04.Interface;

interface Name1{
   abstract void methodone();

}

interface Name2 {
    abstract void mehtodtwo();
}

class  MyClass implements Name1, Name2 {

    @Override
    public void methodone() {
        System.out.print("Method one done ");

    }

    @Override
    public void mehtodtwo() {
        System.out.print("Method two done");

    }
}
 public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.methodone();
        myObject.mehtodtwo();
    }
}

