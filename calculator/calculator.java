package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
// import java.lang.NullPointerException;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class calculator implements ActionListener {
   JFrame jf;
   JLabel displayLabel;
   JButton button7, button8;
   JButton buttonDivition;
   JButton button0;
   JButton buttonSub;
   JButton buttonDot;
   JButton buttonEqual;
   JButton buttonMulti;
   JButton buttonPlus;
   JButton button9, buttonClear;
   JButton button4;
   JButton button5;
   JButton button6;
   JButton button1;
   JButton button3;
   JButton button2;

   float times = 0, oldValueN = 0, oldValueMD = 1;
   String oldValue, it = "";
   boolean click = false;

   public calculator() {

      jf = new JFrame("Calculator");
      jf.setLayout(null);
      jf.getContentPane().setBackground(Color.black);
      jf.setSize(600, 600);
      jf.setLocation(500, 100);

      displayLabel = new JLabel();
      displayLabel.setFont(new Font("", Font.BOLD, 20));
      displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
      displayLabel.setBounds(30, 50, 540, 40);
      displayLabel.setOpaque(true);
      jf.add(displayLabel);

      button7 = new JButton("7");
      button7.setBackground(Color.gray);
      button7.addActionListener(this);
      button7.setFont(new Font("Arial", Font.BOLD, 25));
      button7.setBounds(30, 130, 80, 80);
      jf.add(button7);

      button8 = new JButton("8");
      button8.setBackground(Color.gray);
      button8.addActionListener(this);
      button8.setFont(new Font("Arial", Font.BOLD, 25));
      button8.setBounds(130, 130, 80, 80);
      jf.add(button8);

      button9 = new JButton("9");
      button9.setBackground(Color.gray);
      button9.addActionListener(this);

      button9.setFont(new Font("Arial", Font.BOLD, 25));
      button9.setBounds(230, 130, 80, 80);
      jf.add(button9);

      button4 = new JButton("4");
      button4.setBackground(Color.gray);
      button4.addActionListener(this);

      button4.setFont(new Font("Arial", Font.BOLD, 25));
      button4.setBounds(30, 230, 80, 80);
      jf.add(button4);

      button5 = new JButton("5");
      button5.setBackground(Color.gray);
      button5.addActionListener(this);

      button5.setFont(new Font("Arial", Font.BOLD, 25));
      button5.setBounds(130, 230, 80, 80);
      jf.add(button5);

      button6 = new JButton("6");
      button6.setBackground(Color.gray);
      button6.addActionListener(this);

      button6.setFont(new Font("Arial", Font.BOLD, 25));
      button6.setBounds(230, 230, 80, 80);
      jf.add(button6);

      button1 = new JButton("1");
      button1.setBackground(Color.gray);
      button1.addActionListener(this);

      button1.setFont(new Font("Arial", Font.BOLD, 25));
      button1.setBounds(30, 330, 80, 80);
      jf.add(button1);

      button2 = new JButton("2");
      button2.setBackground(Color.gray);
      button2.addActionListener(this);

      button2.setFont(new Font("Arial", Font.BOLD, 25));
      button2.setBounds(130, 330, 80, 80);
      jf.add(button2);

      button3 = new JButton("3");
      button3.setBackground(Color.gray);
      button3.addActionListener(this);

      button3.setFont(new Font("Arial", Font.BOLD, 25));
      button3.setBounds(230, 330, 80, 80);
      jf.add(button3);

      button0 = new JButton("0");
      button0.setBackground(Color.gray);
      button0.addActionListener(this);

      button0.setFont(new Font("Arial", Font.BOLD, 25));
      button0.setBounds(30, 430, 80, 80);
      jf.add(button0);

      buttonDot = new JButton(".");
      buttonDot.setBackground(Color.gray);
      buttonDot.addActionListener(this);

      buttonDot.setFont(new Font("Arial", Font.BOLD, 25));
      buttonDot.setBounds(130, 430, 80, 80);
      jf.add(buttonDot);

      buttonEqual = new JButton("=");
      buttonEqual.setBackground(Color.gray);
      buttonEqual.addActionListener(this);
      buttonEqual.setFont(new Font("Arial", Font.BOLD, 25));
      buttonEqual.setBounds(230, 430, 80, 80);
      jf.add(buttonEqual);

      buttonPlus = new JButton("+");
      buttonPlus.setBackground(Color.gray);
      buttonPlus.addActionListener(this);
      buttonPlus.setFont(new Font("Arial", Font.BOLD, 25));
      buttonPlus.setBounds(330, 230, 80, 80);
      jf.add(buttonPlus);

      buttonMulti = new JButton("x");
      buttonMulti.setBackground(Color.gray);
      buttonMulti.addActionListener(this);
      buttonMulti.setFont(new Font("Arial", Font.BOLD, 25));
      buttonMulti.setBounds(330, 130, 80, 80);
      jf.add(buttonMulti);

      buttonSub = new JButton("-");
      buttonSub.setBackground(Color.gray);
      buttonSub.addActionListener(this);
      buttonSub.setFont(new Font("Arial", Font.BOLD, 25));
      buttonSub.setBounds(330, 330, 80, 80);
      jf.add(buttonSub);

      buttonDivition = new JButton("/");
      buttonDivition.setBackground(Color.gray);
      buttonDivition.addActionListener(this);
      buttonDivition.setFont(new Font("Arial", Font.BOLD, 25));
      buttonDivition.setBounds(330, 430, 80, 80);
      jf.add(buttonDivition);

      buttonClear = new JButton("CLR");
      buttonClear.setBackground(Color.gray);
      buttonClear.addActionListener(this);
      buttonClear.setFont(new Font("Arial", Font.BOLD, 25));
      buttonClear.setBounds(430, 430, 80, 80);
      jf.add(buttonClear);

      jf.setVisible(true);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }

   public static void main(String a[]) {
      new calculator();
   }

   @Override
   public void actionPerformed(ActionEvent e) {

      if (e.getSource() == button7) {
         if (click) {
            displayLabel.setText("7");
            click = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "7"); // displayLabel - you can give any name to it
         }
      }

      else if (e.getSource() == button8) {
         if (click) {
            displayLabel.setText("8");
            click = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "8");
         }
      }

      else if (e.getSource() == button9) {
         if (click) {
            displayLabel.setText("9");
            click = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "9");
         }
      }

      else if (e.getSource() == button4) {
         if (click) {
            displayLabel.setText("4");
            click = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "4");
         }
      }

      else if (e.getSource() == button5) {
         if (click) {
            displayLabel.setText("5");
            click = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "5");
         }
      }

      else if (e.getSource() == button6) {
         if (click) {
            displayLabel.setText("6");
            click = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "6");
         }
      }

      else if (e.getSource() == button1) {
         if (click) {
            displayLabel.setText("1");
            click = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "1");
         }
      }

      else if (e.getSource() == button2) {
         if (click) {
            displayLabel.setText("2");
            click = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "2");
         }
      }

      else if (e.getSource() == button3) {
         if (click) {
            displayLabel.setText("3");
            click = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "3");
         }
      }

      else if (e.getSource() == button0) {
         if (click) {
            displayLabel.setText("0");
            click = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "0");
         }
      }

      else if (e.getSource() == buttonDot) {
         if (click) {
            displayLabel.setText(".");
            click = false;
         } else {
            displayLabel.setText(displayLabel.getText() + ".");
         }
      }

      else if (e.getSource() == buttonClear) {
         displayLabel.setText("");
         oldValueN = 0;
      }

      else if (e.getSource() == buttonMulti) {

         click = true;
         oldValue = displayLabel.getText(); // 20
         it = "*";

         times = times + 1;
         float oldValuef = Float.parseFloat(oldValue);
         oldValueMD = oldValueMD * oldValuef;// 20*
         // if(times>=2)
         // {

         float result = oldValueMD;
         displayLabel.setText(result + "");

         // }

      }

      else if (e.getSource() == buttonSub) {
         click = true;
         oldValue = displayLabel.getText();
         it = "-";
         times = times + 1;
         float oldValuef = Float.parseFloat(oldValue);
         oldValueN = oldValuef - oldValueN;
         if (times >= 2) {

            float result = oldValueN;
            displayLabel.setText(result + "");

         }
      }

      else if (e.getSource() == buttonDivition) {

         click = true;
         oldValue = displayLabel.getText();
         it = "/";
         times = times + 1;
         float oldValuef = Float.parseFloat(oldValue);
         if (times == 1) {
            oldValueMD = oldValuef;
         } else {
            oldValueMD = oldValuef / oldValueMD;
         }
         if (times >= 2) {

            float result = oldValueMD;
            displayLabel.setText(result + "");

         }
      }

      else if (e.getSource() == buttonPlus) {
         click = true;
         oldValue = displayLabel.getText();
         it = "+";
         times = times + 1;
         float oldValuef = Float.parseFloat(oldValue);
         oldValueN = oldValueN + oldValuef;
         if (times > 2) {

            float result = oldValueN;
            displayLabel.setText(result + "");

         }

      }

      else if (e.getSource() == buttonEqual) {

         String newValue = displayLabel.getText();
         // float oldValuef = Float.parseFloat(oldValue);
         float newValuef = Float.parseFloat(newValue);

         if (it == "+")

         {
            float result = oldValueN + newValuef;
            displayLabel.setText(result + "");
            oldValueN = 0;
         } else if (it == "*") {
            float result = oldValueMD * newValuef;
            displayLabel.setText(result + "");
            oldValueMD = 1;
         } else if (it == "/") {
            float result = oldValueMD / newValuef;
            displayLabel.setText(result + "");
            oldValueMD = 1;
         } else if (it == "-") {
            float result = oldValueN - newValuef;
            displayLabel.setText(result + "");
            oldValueN = 0;

         }
      }

   }
}
