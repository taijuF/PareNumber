////////panel

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PareNumberPanel extends JPanel implements MouseListener{

    PareNumberController control;
    int x,y;
    
    PareNumberPanel(PareNumberController c,int x,int y){
	super();
	control=c;
	setBackground(Color.WHITE);
	addMouseListener(this);
	this.x=x;
	this.y=y;
    }
    public void mouseClicked(MouseEvent e){

	setBackground(Color.red);
	control.didClick(x,y);
	
    }

  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}
  public void mousePressed(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}    
    
}


