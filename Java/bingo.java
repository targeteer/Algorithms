import java.util.Scanner;
 
public class bingo {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bingoBoard[][] = new int [5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                bingoBoard[i][j] = scanner.nextInt();
            }
        }

        int numBingo = 0;
        int numCall = 0;
        int numFilledBox = 0;
    
        //사회자가 번호를 25번 부름
    
        for(int call = 1; call <= 25; call++){
        int number = scanner.nextInt();
        int curX = 0;
        int curY = 0;
        numCall = call;
      
        //부른 번호 빙고판에 체크
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++) {
                if(bingoBoard[i][j] == number){
                    bingoBoard[i][j] = 0;
                    curX = j;
                    curY = i;
                }
            }
        }
        
        //그 번호 상하좌우 양대각선으로 0이 다섯개라면 count++
        numFilledBox = 0;
            //좌우
        for(int k = 0; k < 5; k++){
            
            if(bingoBoard[curY][k] == 0){
                numFilledBox++;
            }
            if(numFilledBox == 5){
                numBingo++;
                numFilledBox = 0;
            }
        }
      
        numFilledBox = 0;
            //상하
        for(int l = 0; l < 5; l++){
            if(bingoBoard[l][curX] == 0){
                numFilledBox++;
            }
            if(numFilledBox == 5){
                numBingo++;
                numFilledBox = 0;
            }
        }
      
        numFilledBox = 0;
            //우하향 대각선
        for(int m = 0; m < 5; m++){
            if(curX == curY){
                if(bingoBoard[m][m] == 0){
                    numFilledBox++;
                }
            }
            if(numFilledBox == 5){
                numBingo++;
                numFilledBox = 0;
            }
        }
    
        numFilledBox = 0;
            //우상향 대각선
        for(int n = 0; n < 5; n++){
            if(curX + curY == 4){
                if(bingoBoard[n][4-n] == 0){
                    numFilledBox++;
                }
            }
            if(numFilledBox == 5){
                numBingo++;
                numFilledBox = 0;
            }
        }
    

        //탈출 문(3개 이상일 경우)
        if(numBingo >= 3){
           break;
        }
        }
        
    
        System.out.println(numCall);
    scanner.close();
}

}