package rumahkodingku.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * HashSet adalah collection yang tidak memperdulikan urutan data dan tidak memperbolehkan data yang sama
 * LinkedHashSet adalah implementasi dari Set yang memperdulikan urutan data dan tidak memperbolehkan data yang sama
 */

public class SetApp {
    public static void main(String[] args) {
        // Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();

        names.add("Thomas");
        names.add("Alberto");
        names.add("Thomas");
        names.add("Alberto");

        for(var name: names){
            System.out.println(name);
        }
    }
}
