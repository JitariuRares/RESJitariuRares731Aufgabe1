import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TSVReader {
    public static List<Game> readGamesFromTSV(String filePath) {
        List<Game> games = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine();

            while ((line = br.readLine()) != null) {

                String[] fields = line.trim().split("\\s+");


                if (fields.length < 6) {
                    System.err.println("Linie invalida: " + line);
                    continue;
                }

                int id = Integer.parseInt(fields[0]);
                String held = fields[1];
                String antagonist = fields[2];
                String konfrontationsTyp = fields[3];
                String ort = fields[4];
                int globalerEinfluss = Integer.parseInt(fields[5]);

                Game game = new Game(id, held, antagonist, konfrontationsTyp, ort, globalerEinfluss);
                games.add(game);
            }
        } catch (IOException e) {
            System.err.println("Error reading TSV file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error converting number: " + e.getMessage());
        }

        return games;
    }
}
