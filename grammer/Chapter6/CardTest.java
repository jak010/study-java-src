package grammer.Chapter6;

public class CardTest {
    public static void main(String[] args) {

        // static
        System.out.println(Card.height);
        System.out.println(Card.width);


        // instance
        Card c1 = new Card();
        System.out.println(c1.kind);

    }
}


class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}