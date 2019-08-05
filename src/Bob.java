//import java.util.Scanner;
//// THIS NEEDS SOME WORK ITS THERE BUT NOT REALLY
//public class Bob {
//    public static void main(String[] args) {
//        do {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Question bob");
//            String UserQuestion = scanner.nextLine();
//
//            if (UserQuestion.endsWith("?")) {
//                System.out.println("Sure.");
//            } else if (UserQuestion.endsWith("!")) {
//                System.out.println("Whoa, chill out!");
////                else if (UserQuestion.isEmpty())
//            } else if (UserQuestion.equals("")) {
//                System.out.println("Fine. Be that way!");
////                else if (UserQuestion.equalsIgnoreCase("bye")||
////                UserQuestion.equalsIgnoreCase("bye."))
//            } else if (UserQuestion.contains("bye")) {
//                System.out.println("GoodBye!");
//                break;
//            } else {
//                System.out.println("Whatever.");
//            }
//
//        }while(true);
//    }
//
//}

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean talking = true;
        String message = "";
        System.out.println("Bob is eating cereal...");

        do {
            message = scanner.nextLine().toLowerCase();

            if (message.endsWith("?")) {
                System.out.println("Sure.");
            } else if (message.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (message.isEmpty()) {
                System.out.println("Fine. Be that way!");
//            } else if (message.equalsIgnoreCase("bye") ||
//                        message.equalsIgnoreCase("bye."))
            } else if (message.contains("bye")) {
                talking = false;
            } else {
                System.out.println("Whatever.");
            }
        } while (talking);

        System.out.println("Bob continues eating cereal...");

    }
}
