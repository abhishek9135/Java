import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Billing extends JFrame {
  private JRadioButton ph;
  private JRadioButton ar;
  private JRadioButton ad;
  private ButtonGroup courses;
  private JCheckBox eligible;
  private JButton calcCharge;
  private JButton clear;
  private JButton exit;
  private JTextField feePerQuater
  private JTextField concessionAmount
  private JTextField feeToBePaid
  private Jpanel pan;

  private boolean isEligibe = false;

  public Billing () {
    setTitle("Billing");
    setSize(300,300);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String args[]) {
    Billing billing = new Billing();
    billing.setVisible(true);
    ph = new JRadioButton("Pharmacy");
    ar = new JRadioButton("Architecture");
    ad = new JRadioButton("Art & Design");
    courses = new ButtonGroup();
    courses.add(ph);
    courses.add(ar);
    courses.add(ad);
    eligible = new JCheckBox("Eligible for concession");
    calcCharge = new JButton("Calculate Charge");
    clear = new JButton("Clear");
    exit = new JButton("Exit");
    JLabel fpq = new JLabel("Fee Per Quarter");
    JLabel ca = new JLabel("Concession Amount");
    JLabel ftp = new JLabel("Fee Per Quarter");
    feePerQuater  = new JTextField();
    concessionAmount = new JTextField();
    feeToBePaid = new JTextField();

    exit.addOnActionListener(e -> {
      System.exit(0);
    })
    eligible.addItemListener(e -> {
      isEligible = e.getStateChange();
      calculateCharges()
    })

    calcCharge.addActionListener(e -> {
      calculateCharges();
    }
  }

  public static void calculateCharge() {
    float _concessionAmount = 0.0;
    float _feePerQuarter = 0.0;
    float _feeToBePaid = 0.0;

    if(ph.isSelected()) {
      _feePerQuarter = 2000.0;
    } else if(ar.isSelected()) {
      _feePerQuarter = 2500.0;
    } else if(ad.isSelected()) {
      _feePerQuarter = 2300.0;
    }

    if (isEligible)
    _concessionAmount = _feePerQuarter * 0.07;

    _feeToBePaid = _feePerQuarter - _concessionAmount;

    feePerQuarter.setText(String.valueOf(_feePerQuarter));
    concessionAmount.setText(String.valueOf(_concessionAmount));
    feeToBePaid.setText(String.valueOf(_feeToBePaid)
  }
}