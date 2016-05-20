////////panel

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PareNumberPanel extends JPanel implements MouseListener{
    //int width=600;
    //int hight=600;
    PareNumberPanel(){
	super();
	setBackground(Color.WHITE);;
	addMouseListener(this);
    }
  public void mouseClicked(MouseEvent e){
	setBackground(Color.red);;
}

  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}
  public void mousePressed(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}
    
    
}


