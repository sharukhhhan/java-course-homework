package Arrays;

public class Card {
    private String Mast;
    private String Rank;

    public Card(String m, String r) {
        this.Mast = m;
        this.Rank = r;
    }

    public String toString() {
        return this.Mast + " " + this.Rank;
    }
}
