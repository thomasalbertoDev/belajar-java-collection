package rumahkodingku.collection;

import java.util.List;

//Iterable merupakan
public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Thomas " , "Alberto");

        for (var name : names){
            System.out.println(name);
        }
    }
}
