package rumahkodingku.collection;

import java.util.List;

// Iterable adalah antarmuka (interface) di Java yang menyediakan kemampuan untuk mengulangi (iterasi) elemen di dalam suatu collection.
// Iterator adalah antarmuka yang menyediakan cara untuk mengakses elemen-elemen dari koleksi satu per satu, tanpa memerlukan pengenalan detail internal dari koleksi tersebut.
public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Thomas ", "Alberto");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
