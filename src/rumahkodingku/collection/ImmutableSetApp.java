package rumahkodingku.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Immutable Set merupakan collection yang tidak dapat diubah setelah objek dibuat
public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> singleton = Collections.singleton("Thomas");
        Set<String> mutable = new HashSet<>();

        mutable.add("Thomas");
        mutable.add("Alberto");

        Set<String> immutable = Collections.unmodifiableSet(mutable);
        Set<String> set = Set.of("Thomas", "Alberto");

        // set.remove("Thomas"); // Error karena immutable / tidak dapat diubah
    }
}
