import java.util.Scanner;
 
public class tetris {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
 
        int C = scanner.nextInt(); 
        int R = scanner.nextInt(); 
 
        int board [][] = new int[R][C];
 
        for(int i = 0; i < R; i++) {
 
            for(int j = 0; j < C; j++) {
 
                board[i][j] = scanner.nextInt();
            }
        }
 
        int X = 0; 
        int Y = 0; 
        int max = 0;
 
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
 
                if(i == R-1 && board[R-1][j] == 0) {
 
                    if(i-3 >= 0) {
 
                        if(board[i-1][j] == 0 && board[i-2][j] == 0
                                && board[i-3][j] ==0) {
                            board[i][j] = 1;
                            board[i-1][j] = 1;
                            board[i-2][j] = 1;
                            board[i-3][j] = 1;
 
                            Y = R-1;
 
                            int isFilled = 0;
                            int lineBreakable = 0;
 
                            for(int k = Y; k >= 0; k--) {
                                isFilled = 0;
                                for(int l = 0; l < C; l++) {
                                    if(board[k][l] == 1) {
                                        isFilled++;
                                    }
 
                                }
                                if(isFilled == C)
                                    lineBreakable++;
                            }
                            if(max < lineBreakable) {
                                max = lineBreakable;
                                X = j+1;
                            }
 
                            board[i][j] = 0;
                            board[i-1][j] = 0;
                            board[i-2][j] = 0;
                            board[i-3][j] = 0;
                        }
                    }
                }
 
                else if(i<R-1) {
                    if(board[i+1][j] == 1 && board[i][j] == 0)
 
                        if(i-3 >= 0) {
 
                            if(board[i-1][j] == 0 && board[i-2][j] == 0
                                    && board[i-3][j] ==0) {
                                board[i][j] = 1;
                                board[i-1][j] = 1;
                                board[i-2][j] = 1;
                                board[i-3][j] = 1;
 
 
                                Y = R-1;
 
                                int isFilled = 0;
                                int lineBreakable = 0;
 
                                for(int k = Y; k >= 0; k--) {
                                    isFilled = 0;
 
                                    for(int l = 0; l < C; l++) {
                                        if(board[k][l] == 1) {
                                            isFilled++;
                                        }
 
                                    }
                                    if(isFilled == C)
                                        lineBreakable++;
 
                                }
                                if(max < lineBreakable) {
                                    max = lineBreakable;
                                    X = j+1;
                                }
                                board[i][j] = 0;
                                board[i-1][j] = 0;
                                board[i-2][j] = 0;
                                board[i-3][j] = 0;
                            }
                        }
                }
            }
        }
 
        if(max > 0) {
            System.out.print(X + " ");
            System.out.print(max);
        }else {
            System.out.print(0 + " ");
            System.out.print(0);
        }
    }
}