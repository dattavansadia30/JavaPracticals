
public class Card {
    private String rank;
    private String suit;

    public Card(String r, String s) {
        rank = r;
        suit = s;
    }

    public String toString() {
        return rank + " of " + suit;
    }

    public boolean equals(Object obj) {
        Card c = (Card) obj;
        return rank.equals(c.rank) && suit.equals(c.suit);
    }

    public int hashCode() {
        return rank.hashCode() + suit.hashCode();
    }
}