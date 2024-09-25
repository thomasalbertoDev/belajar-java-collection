package rumahkodingku.collection;

import rumahkodingku.collection.data.Person;

// Immutable adalah sebuah objek yang nilainya tidak dapat diubah setelah objek tersebut dibuat. Immutable adalah salah satu prinsip dalam pemrograman yang sangat penting, karena dengan membuat objek menjadi immutable, maka kita dapat memastikan bahwa objek tersebut tidak akan berubah nilainya.
public class ImutableApp {
    public static void main(String[] args) {
        Person person = new Person("Thomas");

        person.addHobby("Swimming");
        person.addHobby("Coding");

        for(var hobby: person.getHobbies()){
            System.out.println(hobby);
        }
    }
}
