import java.util.Scanner;

public class maxofarr {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int doublearr [][] = new int[9][9];
        
     
        for(int i = 0; i < 9; i++){
            for(int j = 0; j <9; j++){
                doublearr[i][j] = scanner.nextInt();
            }
        }
        
        int max = 0;
        int X = 0;
        int Y = 0;

        for(int i = 0; i < 9; i++){
            for(int j = 0; j <9; j++){
                if(doublearr[i][j] > max){
                    max = doublearr[i][j];
                    X = i;
                    Y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((X+1) + " " + (Y+1));

        scanner.close();
    }
}