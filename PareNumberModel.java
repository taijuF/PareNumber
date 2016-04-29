//model
import java.util.*;

public class PareNumberModel{
    
    int MaxNumber = 0; //難易度管理
    int PanelNumber[][];//パネルの数時管理

    public PareNumberModel(){
        
    }
    
    public int easy(){ //マスの数を送り返す(仮)
        MaxNumber = 4;
        return 4;
    }
    
    public int nomal(){
        MaxNumber = 6;
        return 6;
    }
    
    public int hard(){
        MaxNumber = 8;
        return 8;
    }
    
    public void getNumber(){//数字を入れた配列を返す(初期設定)
        for(int i=0;i < MaxNumber;i++){
            for(int j=0;j < MaxNumber;j++){
                Random rnd = new Random();
                int n = rnd.nextInt(MaxNumber+1);
                PanelNumber[i][j] = n;
            }
        }//配列を返す手段募集中
    }
    
    public void numberClear(){
        
        //入力を受けてその左右のマスのチェックと数字の消去
        //消すことができたならnumberFallへ
    }
    
    private void numberFall(){
        //空いてる部分にランダムに数字を入れる
        //空いている場所の判定
        
    }

}
