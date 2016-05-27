//model
import java.util.*;

public class PareNumberModel{
    
    int MaxNumber = 0; //大きさ管理
    int PanelNumber[][];//パネルの数字管理
    int a,b,c,d;
    int count=0;//スコア管理
    
    public PareNumberModel(){
        MaxNumber = 5;//難易度に関わる部分
        PanelNumber = new int[MaxNumber][MaxNumber];//配列宣言
    }
    
    public int getScore(){
        return count;
    }
    
    public int[][] getNumber(){//数字を入れた配列を返す(初期設定)
        for(int i = 0;i < MaxNumber;i++){
            for(int j = 0;j < MaxNumber;j++){
                Random rnd = new Random();
                int n = rnd.nextInt(MaxNumber)+1;
                PanelNumber[i][j] = n;
            }
        }
        return PanelNumber;
    }
    
    public int[][] numberClear(int x1,int y1,int x2,int y2){ //a,c = X  b,d = Y　0のある配列
        a = x1;
        b = y1;
        c = x2;
        d = y2;
        if(a!=c){
            if(PanelNumber[a][b] == PanelNumber[c][d]){ //選ばれた二つの数字が同じならば
                int CheckNumber; //チェックナンバーを用意
                for(int i = b;i >= 0;i--){ //aの上のチェック
                    CheckNumber = PanelNumber[a][i];
                
                    for(int j=i-1;j >= 0;j--){ //チェックする位置の移動
                        if(CheckNumber != PanelNumber[a][j]){ //違う数字が出たらループから抜ける
                            break;
                        }
                        PanelNumber[a][j+1] = 0;
                        PanelNumber[a][j] = 0;
                    }
                }
            
                for(int i = b;i >= 0;i--){ //cの上のチェック
                    CheckNumber = PanelNumber[c][i];
                
                    for(int j=i-1;j >= 0;j--){
                        if(CheckNumber != PanelNumber[c][j]){
                            break;
                        }
                        PanelNumber[c][j+1] = 0;
                        PanelNumber[c][j] = 0;
                    }
                }
                PanelNumber[a][b] = 0;
                PanelNumber[c][d] = 0;
            
                numberFall(); //消去するところまでが一連の動作
            }
        }
        //一番外側
        return PanelNumber;
    }
    
    
    
    private void numberFall(){ //０のない配列
        for(int i = b;i >= 0;i--){ //aの上のチェック
            int j = 0;
            int checkupNumber = 0;
            if(PanelNumber[a][i] == 0){
                for(j = i-1;j > 0;j--){ //チェックする位置の移動
                    
                    if(PanelNumber[a][j] != 0){ //0以外が出たらループから抜ける
                        checkupNumber = 1;
                        break;
                    }
                    
                }
                if(checkupNumber == 1){
                    PanelNumber[a][i] = PanelNumber[a][j];
                    PanelNumber[a][j] = 0;
                }else{
                    for(;i >= 0;i--){
                        Random rnd = new Random();
                        int n = rnd.nextInt(MaxNumber+1);
                        PanelNumber[a][i] = n;
                        count++;
                    }
                    break;
                }
            }
        }
        
        for(int i = b;i >= 0;i--){ //aの上のチェック
            int checkupNumber = 0;
            int j;
            if(PanelNumber[c][i] == 0){
                for(j = i-1;j > 0;j--){ //チェックする位置の移動
                    
                    if(PanelNumber[c][j] != 0){ //違う数字が出たらループから抜ける
                        checkupNumber = 1;
                        break; //うちループから抜ける
                        
                    }
                    
                }
                if(checkupNumber == 1){
                    PanelNumber[c][i] = PanelNumber[c][j];
                    PanelNumber[c][j] = 0;
                }else{
                    for(;i >= 0;i--){
                        Random rnd = new Random();
                        int n = rnd.nextInt(MaxNumber+1);
                        PanelNumber[c][i] = n;
                        count++;
                    }
                    break; //外側ループから抜ける
                }
            }
        }
        
        //空いてる部分にランダムに数字を入れる
        //空いている場所の判定
        //空いている場所を確認してその上の部分から数字を取る
        //その後
        
        //デバッグの方法がわかるまで一時的な措置
        //結局は不明
        Random rnd = new Random();
        int n = rnd.nextInt(MaxNumber+1);
        PanelNumber[a][0] = n;
        n = rnd.nextInt(MaxNumber+1);
        PanelNumber[c][0] = n;
    
    }
}
