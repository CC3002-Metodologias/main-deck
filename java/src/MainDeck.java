// "main-deck" (c) by Ignacio Slater M.
// "main-deck" is licensed under a
// Creative Commons Attribution 4.0 International License.
// You should have received a copy of the license along with this
// work. If not, see <http://creativecommons.org/licenses/by/4.0/>.

/**
 * Simple implementation of the <i>Main deck</i> from the <i>Yu-Gi-Oh!</i> game.
 * <p>
 * This code is meant to be used as an example of basic <i>Java</i> syntax.
 *
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class MainDeck extends Deck {

  /**
   * Constructor of the <i>Main deck</i>.
   */
  public MainDeck() {
    // Here we call the constructor of the superclass and impose that the `cards` array
    // will be of size 60 (and won't change)
    super(new String[60]);
    System.out.println("Called 'MainDeck' class' constructor");
    // The array is allocated but empty, so we need to fill it with values
    for (int i = 0; i < 60; i++) {
      cards[i] = "Main deck: Card " + i;
    }
  }
}
