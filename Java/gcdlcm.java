import java.util.Scanner;

public class gcdlcm {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp = 0;
        int remainder = 0;
        int gcd = 0;
        int lcm = 0;
        int lcmA = a; //최소 공배수를 구하기 위해 입력값 저장
        int lcmB = b; 

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        while (a%b != 0){
            remainder = a % b;
            a = b;
            b = remainder;
        }
        gcd = b;

        if (gcd != 0){
        lcm = (lcmA * lcmB) / gcd;
        }else{
            lcm = 0;
        }

        System.out.println(gcd);
        System.out.println(lcm);
    }
}