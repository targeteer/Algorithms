import java.util.Scanner;

public class colorpaper {
 
    public static void main(String[] args) {

        //문제점 : 입력값의 x,y좌표를 조심할 것!!

        Scanner scanner = new Scanner(System.in);
        
        //배열 생성
        int board[][] = new int[1000][1000];

        for(int i = 0; i < 300; i++){
            for(int j = 0; j < 300; j++){
                board[i][j] = 0;
            }
        }

        //직사각형 갯수, 시작 꼭짓점, 너비 높이 값
        int N = scanner.nextInt();
        int a;
        int b;
        int width;
        int height;
        int count;

        for(int i = 1; i <= N; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            width = scanner.nextInt();
            height = scanner.nextInt();

            for(int j = b; j < b + height; j++){
                for(int k = a; k < a + width; k++){
                        board[j][k] = i;   
                }
            }
        }

        for(int n = 1; n <= N; n++){
            count = 0;
            for(int l = 0; l < 101; l++){
                for(int m = 0; m < 101; m++){
                    if(board[l][m] == n){
                         count++;
                    }
                }
            }
            System.out.println(count);
    }

    }

}

