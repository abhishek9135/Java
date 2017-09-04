import java.awt.*;
import java.awt.event.*;

public class CalFrame extends Frame implements ActionListener {
	Label l1,l2,l3; 
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5,b6;
	Panel p1;
	public CalFrame(String title) {
		super(title);
		setSize(400,300);
		l1 = new Label(" First Number ");
		l2 = new Label(" Second Number ");
		l3 = new Label(" Result ");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(12);
		b1 = new Button(" Add ");
		b2 = new Button(" Substract ");
		b3 = new Button(" Divide ");
		b4 = new Button(" Multiply ");
		b5 = new Button(" Refresh ");
		b6 = new Button(" Exit ");
		p1 = new Panel(new GridLayout(6,2));
		
		p1.add(l1); p1.add(t1); p1.add(l2); p1.add(t2); p1.add(l3); p1.add(t3);
		p1.add(b1); p1.add(b2); p1.add(b4); p1.add(b3); 
		p1.add(b5); p1.add(b6);
		add(p1);
		p1.setSize(400,300);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {	
		if(ae.getSource() == b6) System.exit(0);
		String s1 = t1.getText();
		String s2 = t2.getText();
		int z,x = Integer.parseInt(s1);
		int y = Integer.parseInt(s2);
		if(ae.getSource() == b1) {
			 z = x+y;
			String s3 = String.valueOf(z);
			t3.setText(s3);
		} else if(ae.getSource() == b2) {
			z = x-y;
			String s3 = String.valueOf(z);
			t3.setText(s3);
		}else if(ae.getSource() == b3) {
			z = x/y;
			String s3 = String.valueOf(z);
			t3.setText(s3);
		}else if(ae.getSource() == b4) {
			z = x*y;
			String s3 = String.valueOf(z);
			t3.setText(s3);
		}else if(ae.getSource() == b5) {
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
		} 
	}
	public static void main(String[] args) {
		CalFrame frm = new CalFrame(" Calculator ");
	}
}