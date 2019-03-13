import java.util.Scanner;

public class inout2 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int numFlip = scanner.nextInt();
        int doublearr[][] = new int[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j<10 ; j++){
            doublearr[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        for(int j = 0; j < numFlip; j++){
            //가로로
            for(int k = 0; k < 10; k++){
                if(doublearr[j][k] == 1){
                    doublearr[j][k] = 0;
                }
                else if(doublearr[j][k] == 0){
                    doublearr[j][k] = 1;
                }
            }

            //세로로

            for(int l = 0; l < 10; l++){
                if(j == l){
                    continue;
                }
                else if(doublearr[l][j] == 0){
                    doublearr[l][j] = 1;
                }
                else if(doublearr[l][j] == 1){
                    doublearr[l][j] = 0;
                }
            }


        }
        
        for(int m = 0; m < 10; m++){
            for(int n = 0; n < 10; n++){
                System.out.print(doublearr[m][n]+ " ");
            }
            System.out.println();
        }
        


    }
}