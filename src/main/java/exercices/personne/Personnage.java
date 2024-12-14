package exercices.personne;

public class Personnage {
    private String orientation;
    public Personnage() {
        this.orientation = "NORD"; // Orientation initiale
    }

    public String tourner(int fois) {
        String[] directions = {"NORD", "EST", "SUD", "OUEST"};
        return directions[(fois % 4 + 4) % 4];
    }

}


