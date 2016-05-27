
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class PareNumber extends JFrame{
    /*  
  private PareNumberController controller;
    private PareNumberModel Model;
    private PareNumberPanel Panel;
    */

    public static void main(String args[]){
 
	PareNumber app = new PareNumber();
	app.startWindow();
	app.gameWindow();
}

    public void startWindow(){
	PareNumberStartFrame Sframe = new PareNumberStartFrame(this);
    }
    
    public void gameWindow(){
	PareNumber frame = new PareNumber();
	this.setSize(600,600);
	this.setLayout(null);
       for(int i=0;i<5;i++){
	   for(int j=0;j<5;j++){	   
	       PareNumberPanel p = new PareNumberPanel();
	       p.setSize(90,90);
	       p.setLocation(100*i+50,100*j+70);
	       this.add(p);
	   }
       }
    }
       
   public void makeMenuBar(){
       JMenuBar bar = new JMenuBar();
       JMenu menu = new JMenu("ゲーム");
       bar.add(menu);
       JMenuItem easyitem = new JMenuItem("easy");
       /*
	 easy.addActionListener(new ActionListener(){
	 pubilc void actionPerformed(ActionEvent ev){
	 controller.easy();
	 }
	 });
       */
       menu.add(easyitem);
       JMenuItem normalitem = new JMenuItem("normal");
       /*
	 normal.addActionListener(new ActionListener(){
	 pubilc void actionPerformed(ActionEvent ev){
	 controller.normal();
	 }
	 });
       */
       menu.add(normalitem);
       JMenuItem diffcultitem = new JMenuItem("diffcult");  
       /*
	 easy.addActionListener(new ActionListener(){
	 pubilc void actionPerformed(ActionEvent ev){
	 controller.difcult();
	 }
	 });
       */     
       menu.add(diffcultitem);
       JMenuItem scoreitem = new JMenuItem("score");  
       /*
	 easy.addActionListener(new ActionListener(){
	 pubilc void actionPerformed(ActionEvent ev){
	 controller.score();
	 }
	 });
       */
       menu.add(scoreitem);
       JMenuItem quititem = new JMenuItem("Quit");
       /*
       easy.addActionListener(new ActionListener(){
       pubilc void actionPerformed(ActionEvent ev){
       System.exit(0);
       }
       });
       */
       menu.add(quititem);
       bar.add(menu);
       this.setJMenuBar(bar);

   }
}
