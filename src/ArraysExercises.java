//public class ArraysExercises {
//    public static void main(String[] args) {
//        String[] Person = {"Kodi", "Zoey", "CHole"};
//
//        for (String Persons : Person) {
//            System.out.println(Persons);
//        }
//        static Person[] addPerson(Person[]group, Person singlePerson){
//
//        }
//    }
//}
import java.util.Arrays;

public class ArraysExercises {

    private static Person[] addPerson(Person[] group, Person newMember) {
        Person[] newGroup = Arrays.copyOf(group, group.length + 1);
        newGroup[newGroup.length-1] = newMember;
        return newGroup;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Larry");
        people[1] = new Person("Moe");
        people[2] = new Person("Carl");
//        Person[] people = {new Person("Larry"), new Person("Moe"), new Person("Curly")};

//        for (Person character : people) {
//            System.out.println(character.getName());
//        }

        Person[] newGroup = addPerson(people, new Person("Linda"));
//        Arrays.toString(newGroup);
        for (Person character : newGroup) {
            System.out.println(character.getName());
        }

    }
}