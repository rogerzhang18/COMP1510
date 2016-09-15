package p4;

public class Cards {
    enum Rank {
        Ace,
        Two,
        Three,
        Four,
        Five,
        Six,
        Seven,
        Eight,
        Nine,
        Ten,
        Jack,
        Queen,
        King
    }
    public static void main(String[] args) {
        Rank highCard;
        Rank faceCard;
        Rank card1;
        Rank card2;
        
        highCard = Rank.Ace;
        faceCard = Rank.King;
        card1 = Rank.Eight;
        card2 = Rank.Ten;
        
        System.out.println ("A Blackjack hand: " + highCard + " " + faceCard);
        
        int card1Val = card1.ordinal()+1;
        int card2Val = card2.ordinal()+1;

        
        System.out.println ("A two card hand: " + card1 + " " + card2);
        System.out.println ("Hand Value: " + (card1Val + card2Val));
    }
    
}
