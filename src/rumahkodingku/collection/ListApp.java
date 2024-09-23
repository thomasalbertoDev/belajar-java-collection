package rumahkodingku.collection;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    // List adalah interface yang mewakili kumpulan objek yang tersusun dalam urutan tertentu. List ini memungkinkan elemen duplikat dan memungkinkan elemen null.

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Thomas");
        strings.add("Alberto");

        strings.addAll(List.of("Rumah", "Kodingku"));

        for(var value: strings){
            System.out.println(value);
        }

        System.out.println(strings.get(0));
    }
}
