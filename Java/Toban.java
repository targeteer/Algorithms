import java.util.Scanner;

public class Toban {

    static int arr[] = new int[100];
    int N;
    int K;

    void inspect(int digits, int num) {

        if (digits == N) {
            if(num == K){
                for(int i = 0; i < N; i++){
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
            return;
        }

        if(num < K){
            arr[digits] = 1;
            inspect(digits+1, num+1);
          
        }
            arr[digits] = 0;
            inspect(digits+1, num);
          
        

    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Toban toban = new Toban();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        toban.N = n;
        toban.K = k;

        toban.inspect(0, 0);

    }
}