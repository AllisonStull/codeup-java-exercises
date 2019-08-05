//import java.util.Scanner;
//
//
//public class ConsoleExercises {
//    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f", pi);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a Integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println(userInput);
//
//
////        Explore the Scanner Class. #2
//
//        System.out.print("Enter three words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//        System.out.println(userInput1);
//        System.out.println(userInput2);
//        System.out.println(userInput3);
//
//
//
////        #3 and #43
//        scanner.nextLine();
//        System.out.printf("%nEnter a sentence: ");
//        String userInput4 = scanner.nextLine();
//        System.out.println(userInput4);
//
////        Calculate the perimeter and area of Codeup's classrooms.
////         1.Prompt the user to enter values of length and width of a classroom at Codeup.
////          Use the nextLine method to get user input and cast the resulting string to a numeric type.
////             *****Assume that the rooms are perfect rectangles.
////             *****Assume that the user will enter valid numeric data for length and width.
//
//        System.out.print("what is the width of the classroom?: ");
//        String userInput5 = scanner.nextLine();
//        double width = Double.valueOf(userInput5);
//        System.out.println(width);
//
//        System.out.println("what is the length of the classroom?: ");
//        userInput5 =  scanner.nextLine();
//        double length = Double.valueOf(userInput5);
//
////        2. Display the area and perimeter of that classroom.
////        The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//        System.out.printf("Area of classroom = %.2f%n", width * length);
//        System.out.printf("Perimeter of classroom = %.2f%n", 2 * width + 2 * length);
//
////        #3 part of the bonus
//
//        System.out.printf("volume of classroom = %.2f%n", width * length * 10.0);
//
//    }
//}

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.141592;
        System.out.printf("The value of pi is %napproximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.print("Please enter an integer (make sure you do it right): ");
        int input = scanner.nextInt();
        System.out.println(input);

        System.out.print("Please enter three words: ");
        String input1 = scanner.next();
        String input2 = scanner.next();
        String input3 = scanner.next();
        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);
        //nextLine() called to clear input
        scanner.nextLine();
        System.out.printf("%nPlease enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.printf("Here is your sentence: %s%n", sentence);

        System.out.printf("What is the width of the classroom?: ");
        String answer = scanner.nextLine();
        double width = Double.valueOf(answer);
//        double width = new Double(answer);
        System.out.println(width);
        System.out.printf("What is the length of the classroom?: ");
        answer = scanner.nextLine();
        double length = Double.valueOf(answer);

        System.out.printf("Area of classroom = %.2f%n", width * length);
        System.out.printf("Perimeter of classroom = %.2f%n", 2 * width + 2 * length);
        System.out.printf("Volume of classroom = %.2f%n", width * length * 10.0);

    }
}