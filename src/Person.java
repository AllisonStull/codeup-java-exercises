//// Look up what %s is still do not understand what these do
////// OOP Exercise #1
////public class Person {
////
////    private String name;
////public Person(String name){
////    this.name = name;
////}
////    // returns the person's name
////    public String getName() {
////        return this.name;
////    }
////    // changes the name property to the passed value
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    // prints a message to the console using the person's name
////    public void sayHello(){
////        System.out.printf("Hello %s", this.name);
////    }
////    public static void main(String[] args) {
////    Person Kodi = new Person("Kodi the cat");
////    Kodi.sayHello();
////    }
////}
////// #2

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }
    public Person(){}

    // returns the person's name
    public String getName() {
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String newName) {
        name = newName;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello, my name is %s%n", this.name);
    }

    public static void main(String[] args) {
//        Person person = new Person();
//        Person cody = new Person("Cody the Duck");
//        cody.setName("Cody The Duck");
////        System.out.println(this.name); There is no this in a static
//        cody.sayHello();
//        System.out.println(cody.name);
//        System.out.println(cody);
        int num = 7;
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        person2.setName("Jane");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1.getName());
    }
}