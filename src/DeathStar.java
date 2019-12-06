/**
 * Example class for Diagrams
 *
 * The Death Star is an imperial battlestation which looks like a moon.
 *
 * @author T.J.
 */
public class DeathStar {
	// Is the Death Star currently operational?
	private boolean fullyOperational = true;
	// If the station is not fully operational, who destroyed it?
	private XWing destroyer;

	public boolean isOperational() {
		return fullyOperational;
	}

	public void destroy(XWing ship) {
		fullyOperational = false;
		destroyer = ship;
	}

	public String toString() {
		if (fullyOperational) {
			return "The Death Star is fully operational.";
		} else {
			return "The Death Star was destroyed by " + destroyer + "!";
		}
	}
}
