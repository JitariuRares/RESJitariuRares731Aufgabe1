public class Game {
    private int id;
    private String held;
    private String antagonist;
    private String konfrontationsTyp;
    private String ort;
    private int globalerEinfluss;

    public Game(int id, String team1, String team2, String date, String city, int capacity) {
        this.id = id;
        this.held = held;
        this.antagonist = antagonist;
        this.konfrontationsTyp = konfrontationsTyp;
        this.ort = ort;
        this.globalerEinfluss = globalerEinfluss;
    }

    public int getId() {
        return id;
    }

    public String getHeld() {
        return held;
    }

    public String getAntagonist() {
        return antagonist;
    }

    public String getKonfrontationsTyp() {
        return konfrontationsTyp;
    }

    public String getOrt() {
        return ort;
    }

    public int getGlobalerEinfluss() {
        return globalerEinfluss;
    }

    @Override
    public String toString() {
        return konfrontationsTyp + ": " + held + " vs " + antagonist + " - ort: " + ort + " (globarer einfluss: " + globalerEinfluss + ")";
    }
}

