// Here, Box allows one object to initialize another.
class Box {
	double width;
	double height;
	double depth;

	// Notice this Constructor. It takes an object of type Box.
	Box(Box ob) { // Pass Object to Constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	// Constructor usedwhen no dimensions specified 
	Box(){
		width = height = depth = -1;
	} 

	// constructor used when cube is created
	Box(double len){
		width = height = depth = len;
	}
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	// compute and return volue
	double volume(){
		return width*height*depth;
	}
}

class OverloadCons{
	public static void main(String ags[]){
		// Create Boxes using he various constructors
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mycube = new Box(7);
		// create copy of mybox1
		Box myclone = new Box(mybox1);
		double vol;

		//Get volume of first box
		vol = mybox1.volume();
		System.out.println("volume of mybox1 is "+ vol);

		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is "+ vol);

		// get volume of cube
		vol = mycube.volume();
		System.out.println("Volume of Mycube is " + vol);

		// get volume of clone
		vol = myclone.volume();
		System.out.println("volume of Myclone is " + vol);
	}
}