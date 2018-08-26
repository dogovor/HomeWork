import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListTask1 {
    public static void main(String[] args) throws IllegalAccessException {
        ArrayList<String> names;
        names = new ArrayList<>(Arrays.asList("AMELIA", "OLIVER", "JESSICA", "GEORGE", "SCARLETT", "JOSEPH", "FLORENCE", "ALEXANDER"));
        if (names.size() == 0)
            throw new IllegalAccessException("ArrayList is void!");
        System.out.println(longestName(names));
    }

    private static String longestName(ArrayList<String> str) {
        String s = str.get(0);
        for (String i : str) {
            if (i.length() > str.get(0).length())
                s = i;
        }
        return s;
    }
}





