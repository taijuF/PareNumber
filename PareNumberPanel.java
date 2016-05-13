//panel

import java. awt.*;

class MyFrame extends Frame{
    public MyFrame(String name){
	setLocation(200, 100);
	setSize(600, 600);
	setBackground(Color.WHITE);
    }
    
    public void paint(Graphics g){
	g.drawString("数字ペア消しゲーム", 230, 50);
	g.drawString("Start!", 270, 200);
    } 
}

public class PareNumberPanel{
    public static void main(String[] args){
	MyFrame myFrame = new MyFrame("PareNumber");
	myFrame.setVisible(true);
    }
}

