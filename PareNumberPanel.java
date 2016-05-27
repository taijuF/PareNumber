////////panel

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PareNumberPanel extends JPanel implements MouseListener{

    PareNumberController control;
    int x,y;
    int number;

    PareNumberPanel(PareNumberController c,int x,int y,int number){
	super();
	control=c;
	addMouseListener(this);
	this.x=x;
	this.y=y;
	this.number = number;
    }

   public void setNumber(int number,int x,int y){
	this.number = number;
	this.x = x;
	this.y = y; 
	this.repaint();
    }


    public void mouseClicked(MouseEvent e){
	setBackground(Color.red);
	control.didClick(x,y);
    }
   public void paintComponent(Graphics g){
       setBackground(Color.WHITE);
       g.drawString(Integer.toString(number),45,45);
    }

  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}
  public void mousePressed(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}    
    
}


