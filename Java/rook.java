import java.util.Scanner;

public class rook {
 
    public static void main(String[] args) {

        //여기서 주의할 점은 중심이 되는 게 룩이 아닌 킹
        //코딩하기 전 문제가 과연 효율적인가를 고민해 볼 것. 대부분 조금이라도 복잡하면 다른 방법이 있을 것.
        //이 문제는 킹이 사방면으로 움직이는 방식으로 고민
        //상하좌우 움직이는 방향에 따라 탈출 조건이 다르므로 유의
        //아니면 행렬 스캔 방향을 탈출 조건이 같도록(시작점이 킹에서 부터 시작하도록!) 하면 쉽게 풀 수 있음
        
        Scanner scanner = new Scanner(System.in);
        int chessBoard[][] = new int[8][8];
        int attackable = 0;

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                chessBoard[i][j] = scanner.nextInt();
            }
        }

        //내 킹의 위치
        int X = 0;
        int Y = 0;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(chessBoard[i][j] == 1){
                    X = j;
                    Y = i;
                }
            }
        }

        //킹과 우측 가로 사이
        for(int i = X+1; i < 8; i++){
            if(chessBoard[Y][i] == 2){
                attackable = 1;
                System.out.println(attackable);
                return;
            }
            else if(chessBoard[Y][i] == 3){
                attackable = 0;
                break;
            }
            else{
                attackable = 0;
            }
        }
        
        //킹과 좌측 가로 사이
        for(int i = 0; i < X; i++){
            if(chessBoard[Y][i] == 2){
                attackable = 1;
            }
            else if(chessBoard[Y][i] == 3){
                attackable = 0;
            }
            else{
                attackable = 0;
            }
           
        }
        if(attackable == 1){
            System.out.println(attackable);
            return;
        }
     
        //킹의 상단 세로 사이 
        for(int i = 0;  i < Y; i++){
            if(chessBoard[i][X] == 2){
                attackable = 1;    
            }
            else if(chessBoard[i][X] == 3){
                attackable = 0;
            }
            else{
                attackable = 0;
            } 
        }

        if(attackable == 1){
            System.out.println(attackable);
            return;
        }

        //킹의 하단 세로 사이 
        for(int i = Y+1;  i < 8; i++){
            if(chessBoard[i][X] == 2){
                attackable = 1;
                System.out.println(attackable);
                return;
            }
            else if(chessBoard[i][X] == 3){
                attackable = 0;
                break;
            }
            else{
                attackable = 0;
            }
        }
        
        System.out.println(attackable);
    }

}