package rumahkodingku.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Collection pada java merupakan  interface yang mewakili sekelompok objek atau elemen, yang biasanya disebut collection. Collection ini menyediakan cara untuk menyimpan, memanipulasi, dan mengelola data dalam jumlah besar secara efisien.
public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        // Menambahkan 1 data
        collection.add("Thomas");
        collection.add("Alberto");

        // Menambahkan banyak data sekaligus
        collection.addAll(List.of("Rumah", "Kodingku"));

        for (var name : collection) {
            System.out.println(name);
        }

        // Menghapus data
        collection.remove("Thomas");
        collection.removeAll(List.of("Alberto", "Rumah"));

        for (var name : collection) {
            System.out.println(name);
        }

        // Mengecek apakah data ada di collection
        System.out.println(collection.contains("Kodingku"));
        System.out.println(collection.contains("Rumah"));
    }
}
