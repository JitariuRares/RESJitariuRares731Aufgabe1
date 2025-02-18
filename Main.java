import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\asus\\IdeaProjects\\RESJitariuRares731Aufgabe1\\evenimente.tsv";


        List<Game> games = TSVReader.readGamesFromTSV(filePath);

        //a
        System.out.println("--- All Games ---");
        games.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);


        // b) Cerem utilizatorului sa introduca o capacitate minima
        System.out.print("Introduceți capacitatea minimă a stadionului: ");
        int minCapacity = scanner.nextInt();

        // Filtram jocurile si le afisam
        List<Game> filteredGames = GameProcessor.filterGamesByGlobalerEinfluss(games, minCapacity);

        System.out.println("\n--- Meciuri care îndeplinesc criteriul de capacitate ---");
        for (Game game : filteredGames) {
            System.out.println(game.getHeld() + " vs " + game.getAntagonist());
        }


    }
}

