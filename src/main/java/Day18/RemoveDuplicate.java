package Day18;

        import java.util.Arrays;
        import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "sainathreddy";
        LinkedHashSet<Character> chars = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++)
        {

            chars.add(s.charAt(i));
        }
        s = "";
        for(Character c:chars)
        {
            s+=c;
        }
        System.out.println(s);
    }
}