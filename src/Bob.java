import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Question bob");
            String UserQuestion = scanner.nextLine();

            if (UserQuestion.endsWith("?")) {
                System.out.println("Sure.");
            } else if (UserQuestion.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (UserQuestion.equals("")) {
                System.out.println("Fine. Be that way!");
            } else if (UserQuestion.contains("bye")) {
                System.out.println("GoodBye!");
                break;
            } else {
                System.out.println("Whatever.");
            }

        }while(true);
    }

}
