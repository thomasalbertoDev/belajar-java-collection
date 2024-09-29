package rumahkodingku.collection;

import java.util.EnumSet;

/*
 * ENUM SET adalah collection yang hanya menampung objek enum
 * 
 */
public class EnumSetApp {
    private static enum Gender {
        MALE, FEMALE, NOT_KNOWN
    }

    public static void main(String[] args) {
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class); // Menampilkan semua objek enum

        for (var gender : genders) {
            System.out.println(gender);
        }
    }
}
