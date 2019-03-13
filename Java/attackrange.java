import java.util.Scanner;

public class attackrange {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int arr[][] = new int[N][N];
        int Y = scanner.nextInt()-1; //4
        int X = scanner.nextInt()-1; //5
        int range = scanner.nextInt();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                
                    arr[i][j] = 0;
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
               if(Math.abs(X-j) + Math.abs(Y-i) <= range){
                    arr[i][j] = Math.abs(X-j) + Math.abs(Y-i) ; 
               }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i == Y && j == X){
                    System.out.print("x ");
                }else{
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
      
      
        
    }

}
// input
// 5
// 2 3 1 7 3
// 4 1 9 6 8
// 5 5 2 4 4
// 6 5 2 6 7
// 8 4 2 2 2
