import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.*;

import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Main implements ActionListener
{
  private JButton b1,b2,b3,b4;
  private JButton b5,b6,b7,b8;
  private JButton b9,bA,bB,bC;
  private JButton bD,bE,bF, b0;
  private JButton bplus,beq, bclear;
  private JButton bminus, bdiv, bmulti;
  private JTextField jtf;
  private JFrame jF;
  private JPanel jP;
  private int Buffer;
  int choice;
  int plus;
  int minus;
  int multi;
  double div;

  public Main()
  {
    JFrame.setDefaultLookAndFeelDecorated(true);
    jF = new JFrame("Hexadecimal Calculator");
    jF.setLayout(new BorderLayout());
    jP = new JPanel();
    jtf = new JTextField();
    jP.setLayout(new GridLayout(6,3));
    b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");
    bA = new JButton("A");
    bB = new JButton("B");
    bC = new JButton("C");
    bD = new JButton("D");
    bE = new JButton("E");
    bF = new JButton("F");
    bplus = new JButton("+");
    b0 = new JButton("0");
    beq = new JButton("=");
    bminus = new JButton("-");
    bmulti = new JButton("*");
    bdiv = new JButton("/");
    bclear = new JButton("CLR");
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    bA.addActionListener(this);
    bB.addActionListener(this);
    bC.addActionListener(this);
    bD.addActionListener(this);
    bE.addActionListener(this);
    bF.addActionListener(this);
    bplus.addActionListener(this);
    bminus.addActionListener(this);
    b0.addActionListener(this);
    beq.addActionListener(this);
    bmulti.addActionListener(this);
    bdiv.addActionListener(this);
    bclear.addActionListener(this);
    jP.add(b1);
    jP.add(b2);
    jP.add(b3);
    jP.add(b4);
    jP.add(b5);
    jP.add(b6);
    jP.add(b7);
    jP.add(b8);
    jP.add(b9);
    jP.add(bA);
    jP.add(bB);
    jP.add(bC);
    jP.add(bD);
    jP.add(bE);
    jP.add(bF);
    jP.add(bplus);
    jP.add(bminus);
    jP.add(bdiv);
    jP.add(bmulti);
    jP.add(bclear);
    jP.add(b0);
    jP.add(beq);
    jF.add(jtf, BorderLayout.NORTH);
    jF.add(jP, BorderLayout.CENTER);
    jF.pack();
    //jF.setSize(400,400);
    jF.setVisible(true);
  }

  public static void main (String [] args)
  {
    new Main();
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource()==bclear)
    {
      jtf.setText("");
    }
    if (e.getSource()==b1)
    {
      String s = jtf.getText();
      s = s+"1";
      jtf.setText(s);
    }
    else if (e.getSource()==b2)
    {
      String s = jtf.getText();
      s = s+"2";
      jtf.setText(s);
    }
    else if (e.getSource()==b3)
    {
      String s = jtf.getText();
      s = s+"3";
      jtf.setText(s);
    }
    else if (e.getSource()==b4)
    {
      String s = jtf.getText();
      s = s+"4";
      jtf.setText(s);
    }
    else if (e.getSource()==b5)
    {
      String s = jtf.getText();
      s = s+"5";
      jtf.setText(s);
    }
    else if (e.getSource()==b6)
    {
      String s = jtf.getText();
      s = s+"6";
      jtf.setText(s);
    }
    else if (e.getSource()==b7)
    {
      String s = jtf.getText();
      s = s+"7";
      jtf.setText(s);
    }
    else if (e.getSource()==b8)
    {
      String s = jtf.getText();
      s = s+"8";
      jtf.setText(s);
    }
    else if (e.getSource()==b9)
    {
      String s = jtf.getText();
      s = s+"9";
      jtf.setText(s);
    }
    else if (e.getSource()==bA)
    {
      String s = jtf.getText();
      s = s+"A";
      jtf.setText(s);
    }
    else if (e.getSource()==bB)
    {
      String s = jtf.getText();
      s = s+"B";
      jtf.setText(s);
    }
    else if (e.getSource()==bC)
    {
      String s = jtf.getText();
      s = s+"C";
      jtf.setText(s);
    }
    else if (e.getSource()==bD)
    {
      String s = jtf.getText();
      s = s+"D";
      jtf.setText(s);
    }
    else if (e.getSource()==bE)
    {
      String s = jtf.getText();
      s = s+"E";
      jtf.setText(s);
    }
    else if (e.getSource()==bF)
    {
      String s = jtf.getText();
      s = s+"F";
      jtf.setText(s);
    }
    else if (e.getSource()==b0)
    {
      String s = jtf.getText();
      s = s+"0";
      jtf.setText(s);
    }
    else if (e.getSource()==bplus)
    {
      String s = jtf.getText();
      Buffer = Integer.parseInt(s, 16);
      jtf.setText("");
      choice = 0;
    }
    else if (e.getSource()==bminus)
    {
      String s = jtf.getText();
      Buffer = Integer.parseInt(s, 16);
      jtf.setText("");
      choice = 1;
    }
    else if (e.getSource()==bmulti)
    {
      String s = jtf.getText();
      Buffer = Integer.parseInt(s, 16);
      jtf.setText("");
      choice = 2;
    }
    else if (e.getSource()==bdiv)
    {
      String s = jtf.getText();
      Buffer = Integer.parseInt(s, 16);
      jtf.setText("");
      choice = 3;
    }
    else if (e.getSource()==beq)
    {
      String s = jtf.getText();
      int temp = Integer.parseInt(s, 16);
      if (choice == 0) 
      {
      Integer.parseInt(jtf.getText().toString(),16);
      plus = temp + Buffer;
      jtf.setText(Integer.toHexString(plus).toUpperCase()+"");
      }
      else if (choice == 1) 
      {
      Integer.parseInt(jtf.getText().toString(),16);
      minus = Buffer - temp;
      jtf.setText(Integer.toHexString(minus).toUpperCase()+"");
      }
      else if (choice == 2) 
    {
      Integer.parseInt(jtf.getText().toString(),16);
      multi = Buffer * temp;
      jtf.setText(Integer.toHexString(multi).toUpperCase()+"");
    }
     else if (choice == 3) 
    {
      Integer.parseInt(jtf.getText().toString(),16);
      div = Buffer / temp;
      jtf.setText(Double.toHexString(div).toUpperCase()+"");
    }
    } 
  }
}
