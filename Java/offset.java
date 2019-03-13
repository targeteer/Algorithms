import java.util.Random;
import java.util.Scanner;
 
public class offset {
 
    public static void main(String[] args) {
        
 
        Scanner scanner = new Scanner(System.in);
        int doublearr[][] = new int[7][7];
        
        
 
        for(int i = 0; i<7; i++) {
            for(int j = 0; j<7; j++) {
                doublearr[i][j] = 10;
            }
        }
 
        for(int i = 1; i<6; i++) {
            for(int j = 1; j<6; j++) {
                doublearr[i][j] = scanner.nextInt();
            }
        }
 
    
            for(int i = 1; i<6; i++) {
                for(int j = 1; j<6; j++) {
                    if(doublearr[i][j] < doublearr[i+1][j] && 
                            doublearr[i][j] < doublearr[i][j+1] &&
                            doublearr[i][j] < doublearr[i][j-1] &&
                            doublearr[i][j] < doublearr[i-1][j]) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print(doublearr[i][j] + " ");
                    }
 
                }
                System.out.println();
 
 
            }

            scanner.close();
    }
}