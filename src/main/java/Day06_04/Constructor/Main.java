package main.java.Day06_04.Constructor;

class Main1 {
    int x;
}
public class Main extends Main1
{
    int y;

    public Main()
    {
        x=5;
        y=10;
    }

    public static void main(String[] args)
    {
        Main a = new Main();
        System.out.println(a.x+" and "+a.y);

    }

}