import javax.swing.*;
import java.awt.BorderLayout;

public class PareNumberPanel extends JFrame{

  public static void main(String[] args){
      PareNumberPanel frame = new PareNumberPanel();
      //    SubPanel sp = new SubPanel();

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(10, 10, 600, 600);
      frame.setTitle("数字ペア消しゲーム");
      frame.setVisible(true);
  }

  PareNumberPanel(){
    JPanel p = new JPanel();
    p.setLayout(null);
    //   this.add(sp);
    //   sp.setVisible(false);

    JButton button1 = new JButton("Start!");
    button1.setBounds(200, 200, 200, 100);

    JButton button2 = new JButton("ランキング");
    button2.setBounds(200, 300, 200, 100);

    p.add(button1);
    p.add(button2);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}

