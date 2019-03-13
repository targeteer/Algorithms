import java.util.Scanner;
 
public class q1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int date = scanner.nextInt();
        
        int carNum1 = scanner.nextInt();
        int carNum2 = scanner.nextInt();
        int carNum3 = scanner.nextInt();
        int carNum4 = scanner.nextInt();
        int carNum5 = scanner.nextInt();
        int arr [] = {carNum1, carNum2, carNum3, carNum4, carNum5};
        
        int count = 0;
        
        for(int i = 0; i < 5; i++)
        if(date == arr[i])
        {
            count++;
        }
        
        System.out.println(count);
    }
}