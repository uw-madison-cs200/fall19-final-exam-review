/**
 * Example class for Diagrams
 *
 * The X-Wing is a spaceship
 *
 * @author T.J.
 */
public class XWing {
	private Pilot pilot;

	public XWing(Pilot pilot) {
		if (pilot.getName().equals("Han Solo")) {
			throw new IllegalArgumentException("Han Solo does not pilot an X-Wing");
		}

		this.pilot = pilot;
	}

	/*
	 * The given pilot attempts to destroy the Death Star
	 * 
	 * @return the current operational status after the attempt
	 */
	public boolean attemptDestroy(DeathStar deathStar) {
		if (pilot.isHero()) {
			deathStar.destroy(this);
		}

		return deathStar.isOperational();
	}

	public String toString() {
		return "an X-Wing piloted by " + pilot;
	}
}
