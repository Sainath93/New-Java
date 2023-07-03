package main.java.Day06_04.Constructor;

class Parent{
    int x;
}
public class Overload extends Parent {
    int y;

    Overload()
    {
        x=15;
    }
    Overload(int i)
    {
        y=i;

    }

    public static void main(String[] args)
    {
        Overload a = new Overload();
        System.out.println(a.x);

        Overload b = new Overload(15);
        System.out.println("Parameterized: "+b.y);

    }

}