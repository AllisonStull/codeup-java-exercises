//METHODS exercise #1
//NEED TO COMPLETE 5 AND 6
// Daniel used double instead of int leaving int just wanted to note that he used double double needed inorder to use decimals
//multiplication w/o * loop below commented out
// Need to do adventure game
//import java.util.Scanner;

//public class MethodsExercises {
//
//    public static int Addition(int a, int b) {
//        return (a + b);
//    }
//
//    public static int Subtraction(int a, int b) {
//        return (a - b);
//
//    public static int Multiplication(int a, int b) {
//        return (a * b);
////        using a loop
////            int result = 0;
////        for (int i = 0; i< b; i++;){
////            result += a;
////        }
////        return result;
//        }
//    }
//
//    public static int Division(int a, int b) {
//        return (a / b);
//    }
//    public static int Modulus(int a, int b) {
//        return (a % b);
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(Addition(5, 6));
//        System.out.println(Subtraction(5, 6));
//        System.out.println(Multiplication(5, 6));
//        System.out.println(Division(5, 6));
//        System.out.println(Modulus(5, 6));
//
//
//
//    }
//
//
//    //#2
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//
//        return getInteger(min,max);
//    }
//}
//**************************************************************************************
import java.util.Scanner;

public class MethodsExercises {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, int b) {
        //return a * b;
        //using loop for repeated addition
//        double result = 0;
//        for (int i = 0; i< b; i++) {
//            result += a;
//        }
//        return result;

        //using recursion for repeated addition
        if (b <= 0) return 0;
        return a + multiply(a, b-1);
    }
    public static double divide(double a, double b) {
        return a / b;
    }
    public static double modulus(double a, double b) {
        return a % b;
    }

//    [visibility ownership] ReturnType methodName(ParamType paramName, ...) {
//        // yada yada
//        ReturnType something;
//        return something;
//    }

    public static int getInteger(int min, int max) {
        int answer;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        answer = scanner.nextInt();
//        System.out.println();
        if (answer < min || answer > max) return getInteger(1,10);

        return answer;
    }


    public static void factorialGame() {
        Scanner scanner = new Scanner(System.in);
        do {
            int fact = getInteger(1, 10);

            factorialChart(fact);

            System.out.println("Wanna play again?");
            if (!scanner.nextLine().toUpperCase().contains("Y")) return;
        } while (true);
    }

    public static void factorialChart(int num) {

        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = 1;
            System.out.print(i + "! = ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j != i) System.out.print(" x ");
                else {
                    for (int k = 1; k <= (num - i); k++) System.out.print("    ");
                    if (num > 9 && i <=9) System.out.print("  ");
                }
                factorial *= j;
            }
            System.out.println(" = " + factorial);

        }
    }

    public static int rollDie(int sides){
        return (int) Math.ceil(Math.random() * sides);
    }

    public static void rollDice() {
        System.out.println("We will roll two dice, How many sides on each?");
        int sides = getInteger(4,20);
        int die1 = rollDie(sides);
        int die2 = rollDie(sides);
        System.out.printf("You rolled a %d and a %d.%n", die1, die2);
    }

    public static void main(String[] args) {
//        System.out.println(add(3,17)); //expected 20
//        System.out.println(subtract(10.1,2.7)); //expected 7.4
//        System.out.println(multiply(.5, 5)); // expected 2.5
//        System.out.println(divide(15,3.0)); // expected 5.0
//        System.out.println(modulus(17.0, 5)); // expected 2
//        System.out.println(divide(9,0));

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1,10);
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            userInput = scanner.nextInt();
//            if (userInput >= 1 && userInput <= 10) break;
//        } while (true);
//        factorialGame();

        rollDice();
    }

}