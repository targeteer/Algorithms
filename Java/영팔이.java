import java.util.Scanner;
public class 영팔이 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
 
        int N = scanner.nextInt();
        int M = scanner.nextInt();
 
        int eightnine[][] = new int[N][M];
 
 
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
 
                eightnine[i][j] = scanner.nextInt();
 
            }
        }
 
        for(int i = 0; i < N; i++) {
            for(int j = M - 1 ; j >= 0 ; j--) {
 
                System.out.print(eightnine[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}