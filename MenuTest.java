import java.awt.*;
import java.awt.event.*;

public class MenuTest extends Frame {
	public MenuTest(){
		setSize(250,150);
		setTitle("Menu Demo");
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		Menu File = new Menu("File"); 		Menu Edit = new Menu("Edit");
		Menu Format = new Menu("Format"); 		Menu Help = new Menu("Help");
		MenuItem mi1 = new MenuItem("New"); 		MenuItem mi2 = new MenuItem("Open");
		MenuItem mi3 = new MenuItem("Save"); 		MenuItem mi4 = new MenuItem("Save As");
		MenuItem mi5 = new MenuItem("Page Setup"); 		MenuItem mi6 = new MenuItem("Exit");
		MenuItem mi7 = new MenuItem("Cut"); 		MenuItem mi8 = new MenuItem("Copy");
		MenuItem mi9 = new MenuItem("Paste"); 		MenuItem mi10 = new MenuItem("Option");
		MenuItem mi11 = new MenuItem("About");
		File.addSeparator();
		File.add(mi1); 		File.add(mi2);
		File.add(mi3); 		File.add(mi4);
		File.addSeparator();
		File.add(mi5); 		File.add(mi6);
		mb.add(File);
		Edit.add(mi7); 		Edit.add(mi8);
		Edit.add(mi9);
		mb.add(Edit);
		Format.add(mi10); mb.add(Format);
		Help.add(mi11); mb.add(Help);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void WindowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		MenuTest frm = new MenuTest();
	}
}