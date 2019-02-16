/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
    Card aceClubs1 = new Card ("ace", "clubs", 1);
    Card eightSpades = new Card ("eight", "spades", 8);
    Card sixHearts = new Card ("six", "hearts", 6);

    System.out.println("******* ace of Clubs Tests*******");
    System.out.println("  rank: " + aceClubs1.rank() );
    System.out.println("  suit: " + aceClubs1.suit() );
    System.out.println("  pointValue: " + aceClubs1.pointValue() );
    System.out.println(" toString: " + aceClubs1.toString() );
    System.out.println();

    System.out.println("******* eight of spades Tests********");
    System.out.println("  rank: " + eightSpades.rank() );
    System.out.println("  suit: " + eightSpades.suit() );
    System.out.println("  pointValue: " + eightSpades.pointValue() );
    System.out.println(" toString: " + eightSpades.toString() );
    System.out.println();

    System.out.println("********six of hearts tests*******");
    System.out.println("  rank: " + sixHearts.rank() );
    System.out.println("  suit: " + sixHearts.suit() );
    System.out.println("  pointValue: " + sixHearts.pointValue() );
    System.out.println(" toString: " + sixHearts.toString() );
    System.out.println();

	}
}
