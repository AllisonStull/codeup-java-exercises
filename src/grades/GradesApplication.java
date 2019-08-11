//package grades;
//
//public class GradesApplication {
//    ArrayList<Integer> numbers = new ArrayList<>();
//numbers.add(20);    // adding an element
//numbers.add(0, 21); // specifying an index
//numbers.add(22);
//
//System.out.println(numbers); // [21, 20, 22]
//
//numbers.size(); // 3
//numbers.get(2); // 22
//
//numbers.indexOf(2p0);    // 1
//numbers.indexOf("cat"); // -1
//    // We'll start by defining a hash map
//    HashMap<String, String> usernames = new HashMap<>();
//
//// and putting some data into it
//usernames.put("Ryan", "ryanorsinger");
//usernames.put("Zach", "zgulde");
//usernames.put("Fernando", "fmendozaro");
//usernames.put("Justin", "jreich5");
//
//System.out.println(usernames);
//// {Ryan=ryanorsinger, Zach=zgulde, Fernando=fmendozaro, Justin=jreich5}
//
//// obtaining values from the hash map by key
//usernames.get("Ryan"); // "ryanorsinger"
//usernames.get("Phillip"); // null
//usernames.getOrDefault("Jason", "gocodeup"); // "gocodeup"
//
//// checking if keys or values are present
//usernames.containsKey("Justin"); // true
//usernames.containsValue("fmendozaro"); // true
//    HashMap<String, String> usernames = new HashMap<>();
//usernames.put("Ryan", "ryanorsinger");
//
//System.out.println(usernames); // {Ryan=ryanorsinger}
//
//usernames.putIfAbsent("Zach", "zgulde");
//usernames.putIfAbsent("Zach", "coderdude24");
//System.out.println(usernames); // {Ryan=ryanorsinger, Zach=zgulde}
//
//usernames.remove("Zach");
//System.out.println(usernames); // {Ryan=ryanorsinger}
//
//usernames.replace("Ryan", "torvalds")
//        System.out.println(usernames); // {Ryan=torvalds}
//
//usernames.clear();
//usernames.isEmpty(); // true
//
////
//}
package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static HashMap<String, Student> students = new HashMap<>();
    static Input input = new Input();

    public static void main(String[] args) {

        Student alli = new Student("Alli");
        alli.addGrade(100);
        alli.addGrade(80);
        alli.addGrade(80);
        alli.addGrade(80);

        Student aj = new Student("Aj");
        aj.addGrade(100);
        aj.addGrade(100);
        aj.addGrade(100);
        aj.addGrade(50);

        students.put("allisonStull", alli);
        students.put("AlfredJ", aj);

        System.out.println("Welcome!\n");

        showStudents();

        boolean cont = true;

        do{

            String key = input.getString("What student would you like to see more information on?");

            if(students.containsKey(key)){
                System.out.println("Name: "+ students.get(key).getName() +" - GitHub Username: " + key );
                System.out.println("Current Average: " + students.get(key).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + key);
            }

            cont = input.yesNo("Would you like to see another student?");

        }while(cont);

        System.out.println("Goodbye, and have a wonderful day!\n");

    }

    public static void showStudents(){
        System.out.println("Here are the GitHub usernames of our students:");
        for (String username : students.keySet()) {
            System.out.print(username + " | ");
        }
        System.out.println();
    }
}