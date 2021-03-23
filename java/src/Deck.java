// "main-deck" (c) by Ignacio Slater M.
// "main-deck" is licensed under a
// Creative Commons Attribution 4.0 International License.
// You should have received a copy of the license along with this
// work. If not, see <http://creativecommons.org/licenses/by/4.0/>.

/**
 * Simple implementation of a generic deck.
 * <p>
 * This code is meant to be used as an example of basic <i>Java</i> syntax.
 *
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class Deck {

  String[] cards; // For simplicity, cards are represented as a String array

  /**
   * Creates a new deck using an array of cards.
   */
  public Deck(String[] cards) {
    System.out.println("Called 'Deck' class' constructor");
    this.cards = cards;
  }
}
