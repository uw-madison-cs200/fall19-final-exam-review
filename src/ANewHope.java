/**
 * Diagrams
 *
 * Star Wars: A New Hope
 * 
 * @author T.J.
 */
public class ANewHope {
	public static void main(String[] args) {
		if (args.length != 1
				|| (!args[0].equals("true") && !args[0].equals("false"))) {
			System.out.println("Please provide a boolean argument for whether the rebels win.");
			return;
		}
		
//		System.out.printf("%+5d, %d\n", 1, 2);
		boolean rebelsWin = args[0].equals("true");

		DeathStar deathStar = new DeathStar();
		System.out.println(deathStar);

		Pilot pilot;

		if (rebelsWin) {
			pilot = new Pilot("Luke Skywalker", true);
		} else {
			pilot = new Pilot("Biggs Darklighter", false);
		}

		XWing theShip = new XWing(pilot);

		System.out.println(pilot + " is attempting to destroy the Death Star!");
		theShip.attemptDestroy(deathStar);

		System.out.println(deathStar);
	}
}
