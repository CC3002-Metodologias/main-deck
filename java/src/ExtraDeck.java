// "main-deck" (c) by Ignacio Slater M.
// "main-deck" is licensed under a
// Creative Commons Attribution 4.0 International License.
// You should have received a copy of the license along with this
// work. If not, see <http://creativecommons.org/licenses/by/4.0/>.

import java.util.Arrays;

/**
 * Simple implementation of the <i>Extra deck</i> from the <i>Yu-Gi-Oh!</i> game.
 * <p>
 * This code is meant to be used as an example of basic <i>Java</i> syntax.
 *
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class ExtraDeck extends Deck {

  /**
   * Constructor of the <i>Extra deck</i>.
   */
  public ExtraDeck() {
    // Here we call the constructor of the superclass and impose that the `cards` array
    // will be of size 15 (and won't change)
    super(new String[15]);
    System.out.println("Called 'ExtraDeck' class' constructor");
    // The array is allocated but empty, so we need to fill it with values
    for (int i = 0; i < cards.length; i++) {
      cards[i] = "Extra deck: Card " + i;
    }
  }

  /**
   * Prints the cards of the deck to stdout.
   * <p>
   * This method is specific to the class {@link ExtraDeck}.
   * Neither {@link Deck} nor {@link MainDeck} can be {@code show}ed.
   */
  public void show() {
    System.out.println(Arrays.toString(cards));
  }
}
