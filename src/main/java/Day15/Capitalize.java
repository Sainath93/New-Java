package Day15;

        import java.util.stream.Stream;

public class Capitalize {
    public static void main(String[] args)
    {
        String[] names = {"sainath","Reddy","Moku","Tyson"};
        Stream.of(names).map(name->name.substring(0,1).toUpperCase()+name.substring(1)).
                sorted().
                forEach(name->System.out.println(name));
    }
}