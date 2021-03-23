// "main-deck" (c) by Ignacio Slater M.
// "main-deck" is licensed under a
// Creative Commons Attribution 4.0 International License.
// You should have received a copy of the license along with this
// work. If not, see <http://creativecommons.org/licenses/by/4.0/>.

/**
 * Executable example of using the decks.
 *
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("=== GENERIC DECK ===");
    // The Deck class' constructor can be directly called with a card array
    Deck deck = new Deck(new String[]{"Card 1", "Card 2"});
    // Both MainDeck and ExtraDeck constructors receive no parameters
    System.out.println("=== MAIN DECK ===");
    MainDeck mainDeck = new MainDeck();
    System.out.println("=== EXTRA DECK ===");
    ExtraDeck extraDeck = new ExtraDeck();
    System.out.println("=== DECK SIZES ===");
    // The `cards` field can be accessed for all the decks
    System.out.println("Generic deck size: " + deck.cards.length);
    System.out.println("Main deck size: " + mainDeck.cards.length);
    System.out.println("Extra deck size: " + extraDeck.cards.length);
    // The `show` method is only available for the extra deck
    /*  These lines would raise an error
    deck.show();
    mainDeck.show();
    */
    System.out.println("=== EXTRA DECK CARDS ===");
    extraDeck.show();
  }
}
