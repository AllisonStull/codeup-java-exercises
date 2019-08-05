import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    private String[] nouns = {"cat", "wipes", "mollusk", "snail", "computer", "phone", "pepperoni", "grape", "cactus", "orchid", "leaf", "door"};
    private String[] adjectives;

    private static String randomElement(String[] strings) {
        Random wordRandom = new Random();
//        Random adjRandom = new Random();
//        int randomNumber1 = wordRandom.nextInt(nouns.length);
//        int randomNumber2 = Random.nextInt(adjectives.length);

        int sng = wordRandom.nextInt(strings.length);
        return strings[sng];
    }


    public ServerNameGenerator() {
        adjectives = new String[12];
        adjectives[0] = "big";
        adjectives[1] = "colossal";
        adjectives[2] = "gigantic";
        adjectives[3] = "microscopic";
        adjectives[4] = "mammoth";
        adjectives[5] = "teeny";
        adjectives[6] = "tiny";
        adjectives[7] = "puny";
        adjectives[8] = "immense";
        adjectives[9] = "small";
        adjectives[10] = "tall";
        adjectives[11] = "short";
    }

    public static void main(String[] args) {
        ServerNameGenerator sng = new ServerNameGenerator();
//        System.out.println(sng.nouns);
//        System.out.println(Arrays.toString(sng.nouns));
//        System.out.println(Arrays.toString(sng.adjectives));
        for (int i = 0;i<10;i++)
            System.err.printf("%s-%s%n", randomElement(sng.adjectives), randomElement(sng.nouns));
    }
}
