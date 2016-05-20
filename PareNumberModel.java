//model
import java.util.*;

public class PareNumberModel{
    
    int MaxNumber = 0; //大きさ管理
    int PanelNumber[][];//パネルの数字管理
    int a,b,c,d;
    
    public PareNumberModel(){
        
    }
    
    public void selectDifficulty(){
        //this.viewの難易度選択画面のメソッド
    }
    
    public int easy(){ //マスの数を送り返す(仮)
        MaxNumber = 4;
        PanelNumber = new int[MaxNumber][MaxNumber];
        return 4;
    }
    
    public int nomal(){//マスの数を送り返す
        MaxNumber = 6;
        PanelNumber = new int[MaxNumber][MaxNumber];
        return 6;
    }
    
    public int hard(){//マスの数を送り返す
        MaxNumber = 8;
        PanelNumber = new int[MaxNumber][MaxNumber];
        return 8;//メソッド呼び出し？
    }
    
    public void getNumber(){//数字を入れた配列を返す(初期設定)
        for(int i = 0;i <= MaxNumber;i++){
            for(int j = 0;j <= MaxNumber;j++){
                Random rnd = new Random();
                int n = rnd.nextInt(MaxNumber)+1;
                PanelNumber[i][j] = n;
            }
        }//配列を返す手段募集中
    }
    
    public void numberClear(int a1,int b1,int c1,int d1){ //a,c = X  b,d = Y　0のある配列
        a = a1;
        b = b1;
        c = c1;
        d = d1;
        if(PanelNumber[a][b] == PanelNumber[c][d]){ //選ばれた二つの数字が同じならば
            int CheckNember; //チェックナンバーを用意
            for(int i = b;i >= 0;i--){ //aの上のチェック
                CheckNember = PanelNumber[a][i];
                
                for(int j=i-1;j >= 0;j--){ //チェックする位置の移動
                    if(CheckNember != PanelNumber[a][j]){ //違う数字が出たらループから抜ける
                        break;
                    }
                    PanelNumber[a][j+1] = 0;
                    PanelNumber[a][j] = 0;
                }
            }
            
            for(int i = b;i >= 0;i--){ //cの上のチェック
                CheckNember = PanelNumber[c][i];
                
                for(int j=i-1;j >= 0;j--){
                    if(CheckNember != PanelNumber[c][j]){
                        break;
                    }
                    PanelNumber[c][j+1] = 0;
                    PanelNumber[c][j] = 0;
                }
            }
            PanelNumber[a][b] = 0;
            PanelNumber[c][d] = 0;
        }
        //配列を返す手段
    }
    
    
    
    public void numberFall(){ //０のない配列
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
                        
                    }
                    break; //外側ループから抜ける
                }
            }
        }
        //配列を返す手段募集
        
        //空いてる部分にランダムに数字を入れる
        //空いている場所の判定
        //空いている場所を確認してその上の部分から数字を取る
        //その後
    }
    
}






