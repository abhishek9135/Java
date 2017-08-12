import java.awt.*;
import java.awt.event.*;

public class ShopDesign extends Frame implements ActionListener,ItemListener {
	Button Bcal,BExit;
	TextField t1,t2,t3,t4,t5,t6,t7;
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	CheckboxGroup cbg1 = new CheckboxGroup();
	Checkbox rb1 = new Checkbox("5",cbg1,false);
	Checkbox rb2 = new Checkbox("10",cbg1,false);
	Checkbox rb3 = new Checkbox("15",cbg1,false);
	int tmp;
	public ShopDesign(String title){
		super(title);
		Bcal = new Button("Calculate"); BExit = new Button("Exit");
		t1 = new TextField(""); 		t2 = new TextField("");
		t3 = new TextField(""); 		t4 = new TextField("");
		t5 = new TextField(""); 		t6 = new TextField("");
		t7 = new TextField("");
		l1 = new Label("Item Code"); 		l2 = new Label("Item Name");
		l3 = new Label("Price/Unit"); 		l4 = new Label("Quantity");
		l5 = new Label("Total Amount"); 		l6 = new Label("Discount");
		l7 = new Label("Discount Amount"); 	l8 = new Label("Payable Amount");
		
		setLayout(new GridLayout(11,2,10,10));
		setSize(660,440);
		setVisible(true);
		add(l1);	add(t1);
		add(l2);	add(t2);
		add(l3);	add(t3);
		add(l4);	add(t4);
		add(l5);	add(t5);
		add(Bcal);	add(BExit);
		add(l6);	
		add(rb1);	add(rb2); 	add(rb3);
		add(l7);	add(t6);
		add(l8);	add(t7);	
		Bcal.addActionListener(this);BExit.addActionListener(this);
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		rb3.addItemListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String s1 = t3.getText();
		String s2 = t4.getText();
		if(ae.getSource() == BExit) {
			System.exit(0);
		}else if(ae.getSource() == Bcal) {
			tmp =  Integer.parseInt(s1)*Integer.parseInt(s2);
			String s3 = String.valueOf(tmp);
			t5.setText(s3);
		}
	}

	
	public void itemStateChanged(ItemEvent ie){
		if(ie.getSource() == rb1) {
			if(ie.getStateChange() == ie.SELECTED) {
				double dl = 0.05*Integer.parseInt(t5.getText());
				String s4 = String.valueOf(dl);
				t6.setText(s4);
				dl = Integer.parseInt(t5.getText()) - dl;
				s4 = String.valueOf(dl);
				t7.setText(s4);
			}
		}
		if(ie.getSource() == rb2) {
		 	if(ie.getStateChange() == ie.SELECTED) {
				double dl = 0.1*Integer.parseInt(t5.getText());
				String s4 = String.valueOf(dl);
				t6.setText(s4);
				dl = Integer.parseInt(t5.getText()) - dl;
				s4 = String.valueOf(dl);
				t7.setText(s4);
			}
		} 
		if(ie.getSource() == rb3) {
			 if(ie.getStateChange() == ie.SELECTED) {
				double dl = 0.15*Integer.parseInt(t5.getText());
				String s4 = String.valueOf(dl);
				t6.setText(s4);
				dl = Integer.parseInt(t5.getText()) - dl;
				s4 = String.valueOf(dl);
				t7.setText(s4);
			}
		}
	}
	public static void main(String[] args){
		ShopDesign frm = new ShopDesign("Shop");
	}
}