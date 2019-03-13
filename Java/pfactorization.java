import java.util.Scanner;

public class pfactorization {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 2; n > 1;){
            if(n % i == 0){
                System.out.println(i);
                n /= i;
            }
            else{
                i++;
            }
        }
        
    }
}