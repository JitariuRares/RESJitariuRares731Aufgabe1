import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class GameProcessor {

    public static List<Game> filterGamesByGlobalerEinfluss(List<Game> games, int min) {
        return games.stream()
                .filter(game -> game.getGlobalerEinfluss() >= min)
                .collect(Collectors.toList());
    }

}


