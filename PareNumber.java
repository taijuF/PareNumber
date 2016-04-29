
import java.awt.event.*;
import javax.swing.*;

public class PareNumber extends JFrame{
    private PareNumberController controller;
    private PareNumberModel Model;
    private PareNumberPanel Panel;
    
    public static void main(String[] args){
       new PareNumber();
   }

   public PareNumber(){
       int x = 7;
       int y = 7;
       this.getContentPane().setLayout(null);
       this.setSize(x * 50 + 50, y * 50 + 100);
       this.setResizable(false);
       Model = new PareNumberModel(x,y);
       Panel = new PareNumeberModel(x,y,Model);
       controller = new PareNumberController(Panel,Model);
       Panel.setController(controller);
       Panel.setBounds(25.25,x*50,y*50);
       this.getContentPane().add(Panel);

       this.makeMenuBer();
       this.setDefaultCloseOperetion(JFrame.EXIT_ON_CLOSE);
       this.setVisible(ture);
   }

   public void makeMenuBar(){
       JMenuBar bar = new JMenuBar();
       JMenu menu = new JMenu("ゲーム");
       JMenuItem newitem = new JMenuItem("ゲームを始める");
      // newitem.addActionListener(new ActionListener(){
         /*  pubilc void actionPerformed(ActionEvent ev){
              controller.newGame();
          }*/
      //});
   }

}
