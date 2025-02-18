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

//        // c) Afișarea jocurilor din München care au loc după 2024-06-30, în ordine cronologică
//        String targetCity = "München";
//        String minDate = "2024-06-30";
//
//        List<Game> filteredByCityAndDate = GameProcessor.filterGamesByCityAndDate(games, targetCity, minDate);
//
//        System.out.println("\n--- Meciuri din " + targetCity + " după " + minDate + " ---");
//        for (Game game : filteredByCityAndDate) {
//            System.out.println(game.getDate() + ": " + game.getTeam1() + " vs " + game.getTeam2());
//        }
//
//
//        // b) Cerem utilizatorului să introducă o capacitate minimă
//        System.out.print("Introduceți capacitatea minimă a stadionului: ");
//        int minCapacity = scanner.nextInt();
//
//        // Filtrăm jocurile și le afișăm
//        List<Game> filteredGames = GameProcessor.filterGamesByCapacity(games, minCapacity);
//
//        System.out.println("\n--- Meciuri care îndeplinesc criteriul de capacitate ---");
//        for (Game game : filteredGames) {
//            System.out.println(game.getTeam1() + " vs " + game.getTeam2() +
//                    " - Datum: " + game.getDate() +
//                    " - Spielort: " + game.getCity());
//        }
//
//
//
//        //d
//        GameProcessor.countGamesPerCity(games, outputFilePath);
//
//        scanner.close();
    }
}

