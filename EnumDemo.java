// An Emnumeration of Apple varieties.
enum Apple{
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo{
	public static void main(String[] args) {
		Apple ap;
		ap = Apple.RedDel;
		// Output an enum Value.
		System.out.println("Value of ap: "+ ap);
		System.out.println();

		ap = Apple.GoldenDel;
		// Compare Two enum values 
		if(ap == Apple.GoldenDel)
			System.out.println("ap Contains GoldenDel. \n ");

		// Use an enum to control a switch statement.
		switch(ap) {
			case Jonathan:
				System.out.println(" Jonathan is Red.");
				break;
			case GoldenDel:
				System.out.println("Golden Delicious is Yellow.");
				break;
			case RedDel:
				System.out.println("Red Delicious is red.");
				break;
			case Winesap:
				System.out.println("Winesap is red.");
				break;
			case Cortland:
				System.out.println("Cortland is red.");
		}
	}
}