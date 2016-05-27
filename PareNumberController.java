//controller
import java.awt.*;
import javax.swing.*;

public class PareNumberController{
    PareNumber pareNumber;
    PareNumberModel model;
    int keep_x=-1;
    int keep_y=-1;
    public PareNumberController(PareNumber n, PareNumberModel m){
	pareNumber = n;
	model = m;
	//panel.repaint();

    }




    
    public void didClick(int x, int y){
	
	//処理
	System.out.println(x+" "+y);
	if(keep_x==-1){
	    keep_x=x;
	    keep_y=y;
	}
	else{	
         int [][]newxy = model.numberClear(keep_x,keep_y,x,y);
	 for(int i = 0; i < 5; i++){
	     for(int j = 0;j < 5; j++ ){
		 pareNumber.panels[i][j].setNumber(newxy[x][y],i,j);
	     }
	 }	  
	 keep_x=-1;
	 keep_y=-1;
	}
    }
    


    
    public void didType(int x, int y){
	//文字判定とか
	//clickの処理
    }

}

