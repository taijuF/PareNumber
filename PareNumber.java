
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
       bar.add(menu);
       JMenuItem newitem1 = new JMenuItem("easy");
       JMenuItem newitem2 = new JMenuItem("normal");
       JMenuItem newitem3 = new JMenuItem("diffcult");  
       JMenuItem newitem4 = new JMenuItem("score");  
       JMenuItem newitem5 = new JMenuItem("close");
       menu.add(newitem1);
       menu.add(newitem2);
       menu.add(newitem3);
       menu.add(newitem4);
       menu.add(newitem5);
       setJMenuBar(bar);


       // newitem.addActionListener(new ActionListener(){
         /*  pubilc void actionPerformed(ActionEvent ev){
              controller.newGame();
          }*/
      //});
   }

}
