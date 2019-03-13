import java.util.Scanner;
 
public class baseballgame {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 
 
        int N = scanner.nextInt();
        int conditions[][] = new int [N][3]; 
        int answercount = 0;
 
        for(int i=0; i<N; i++) {
            for(int j=0; j<3; j++) {
                conditions[i][j] = scanner.nextInt();
            }
        }
 
        for(int k = 123; k <= 987; k++)
        {
            
            int count = 0;
 
            int x = k/100;
            int y = (k-100*x)/10;
            int z = k-(100*x + 10*y);
            
            if(x == y || y==z || x==z)
                continue;
            else if(y==0 || z==0)
                continue;
            else
 
            for(int l=0; l < N; l++) {
                int a = conditions[l][0]/100;
                int b = (conditions[l][0]-100*a)/10;
                int c = conditions[l][0] - (a*100 + 10*b);
 
                int strikes = 0;
                int balls = 0;
 
                if(x == a) {
                    strikes++;
                }
                else if(x == b || x == c) {
                    balls++;
                }
 
                if(y == b) {
                    strikes++;
                }
                else if(y == a || y == c) {
                    balls++;
                }
 
                if(z == c) {
                    strikes++;
                }
                else if(z == a || z == b){
                    balls++;
                }
 
                if(strikes == conditions[l][1] && balls == conditions[l][2]) {
                    count++;
                }
                if(count == N) {
                    answercount++;
                }
            }
 
        }
        System.out.println(answercount);

        scanner.close();
    }
 
}