//package grades;
//
//import java.util.HashMap;
//
//public class Student {
//    public static void main(String[] args) {
//
//studen.name  get if (args == null) {
//    key : value paron is what we need
//                    System.out.println(String.indexOf)
//
//        }
//        public stativ void recordAttendance(String date, String value)System.out.println("hello how are you")
//    }
//    HashMap<String, String> username = new HashMap<>()
//            user.put("your grade is", "you failed");
//
//    public void setUsername(HashMap<String, String> username) {
//        this.username = username;
//    }System.out.println("no user or username was found");
//    System.out.println("do you want ot keep paying?");"A"
//    Scanner.scanner
//
//;}
package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;
        for(int grade: this.grades){
            sum += grade;
        }
        return sum / this.grades.size();
    }
}
