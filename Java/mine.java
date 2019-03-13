import java.util.Scanner;

public class mine {
 
    public static void main(String[] args) {

        //질문: 행렬 기입시 조정값은 처음에 아니면 나중에? 상관없음 case by case. 
        //padding? yes 0으로 둘러싸서 계산할 것
        //주의할 점: Y,X근처 3x3를 검사하는데 만약 검사 범위가 배열 밖으로 나가면 예외처리? 답은 padding

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int count = 0;

        int X = scanner.nextInt(); //X는 행 번호, 1부터 시작
        int Y = scanner.nextInt(); //Y는 열 번호, 1부터 시작

        int board[][] = new int[N+2][M+2];
        for(int i = 0; i < N+2; i++){
            for(int j = 0; j < M+2; j++){
                board[i][j] = 0;
            }
        }

        for(int i = 1; i < N+1; i++){
            for(int j = 1; j < M+1; j++){
                board[i][j] = scanner.nextInt();
            }
        }



        if(board[X][Y]==1){
            System.out.println("game over");
        }
        else{
            for(int i = X-1; i < X+2; i++){
                for(int j = Y-1; j < Y+2; j++){
                    if(board[i][j]==1){
                        count++;
                    }
                }
            }
            System.out.println(count);;
        }
        
    }

}


// 예제 입력
// 9 8
// 4 5
// 0 0 0 0 0 0 0 0
// 0 0 0 0 0 0 0 0
// 0 0 0 1 0 0 0 0
// 0 0 0 0 0 1 0 0
// 0 0 0 1 0 1 0 0
// 0 0 0 0 0 0 0 0
// 0 0 0 0 0 0 0 0
// 0 0 0 0 0 0 0 0
// 0 0 0 0 0 0 0 0
// 예제 출력
// 4