// Example of Swing Application
import javax.swing.*;

class SwingDemo{
	SwingDemo(){
		//Creates a new JFrame Container.
		JFrame jfrm = new JFrame("A Simple Swing Application ");
		// Giving The Frame an Initial Size.
		jfrm.setSize(275,100);
		//Terminates the program when the user closes the Application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Create a Text-Based Label.
		JLabel jlab = new JLabel(" Swinf Means Powerful GUIs. ");

		//Add The Label to the content pane.
		jfrm.add(jlab);
		// Display The Frame
		jfrm.setVisible(true);
	}

	public static void main(String args[]){
		// Create the Frame on the event dispatching thread
		/*SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new SwingDemo();
			}
		});*/
		// Not Prefered Way to Initial A Swing Obj To the Main Thread Of Application better Use one of the Event Dispatching Thread 
		SwingDemo s = new SwingDemo();
	}
}