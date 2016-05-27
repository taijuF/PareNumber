import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;

class PareNumberStartFrame extends JFrame{

    PareNumber pareNumber ;

    PareNumberStartFrame(PareNumber pareNumber){
	super();
	this.pareNumber = pareNumber;
	this.setSize(600,600);
	this.setLayout(null);
	PareNumberStartPanel SPanel= new PareNumberStartPanel(pareNumber,this);
	SPanel.setSize(200,100);
	SPanel.setLocation(200,200); 
	this.add(SPanel);
	this.setVisible(true);
    }
}




