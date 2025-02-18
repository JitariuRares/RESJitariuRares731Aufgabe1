import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\asus\\IdeaProjects\\RESJitariuRares731Aufgabe1\\evenimente.tsv";
//        String outputFilePath = "C:\\Users\\asus\\IdeaProjects\\model_a1\\src\\spielanzahl.txt";

        List<Game> games = TSVReader.readGamesFromTSV(filePath);

        //a
        System.out.println("--- All Games ---");
        games.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);


    }
}

