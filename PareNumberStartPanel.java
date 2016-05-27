import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PareNumberStartPanel extends JPanel implements MouseListener{

    PareNumber pareNumber;
    PareNumberStartFrame pareNumberStartFrame;
  
    PareNumberStartPanel(PareNumber pareNumber,PareNumberStartFrame pareNumberStartFrame){
	super();
	this.pareNumber = pareNumber;
	this.pareNumberStartFrame = pareNumberStartFrame;
	this.setBackground(Color.WHITE);
	JLabel Label= new JLabel("START");
	this.add(Label); 
	addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e){
	pareNumberStartFrame.setVisible(false);
	pareNumber.setVisible(true);
    }

  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}
  public void mousePressed(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}    
    
}


