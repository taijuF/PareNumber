import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PareNumberStartFrame extends JFrame implements MouseListener{

    PareNumberStartFrame(){
	super();
	JPanel p = new JPanel();
	this.setSize(600,600);
	this.setLayout(null);
	p.setSize(200,200);
	p.setLocation(300,300);
	p.setBackground(Color.WHITE);
	this.add(p);
	addMouseListener(this);
	this.setVisible(true);
    }


    public void mouseClicked(MouseEvent e){
	this.setVisible(false);

    }
  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}
  public void mousePressed(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}
    
    
}


