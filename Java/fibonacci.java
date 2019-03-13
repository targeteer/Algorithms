import java.util.Scanner;

public class fibonacci {

    //질문 i=1일때 일단 강제로 1 출력하게 했는데 b가 정상 출력이 안됨..
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = 0, b = 0, c = 0;

        for(int i = 0; i <= n; i++){

            if(i >= 2){
                c = a + b;
                a = b;
                b = c;
            }else if(i == 1){
                b = 1;
            }else{
                a = 0;
            }

            if(n==0){
                System.out.println(a);
                return;
            }else if(n==1){
                System.out.println(1);
                return;
            }
        }

        System.out.println(c);

      

    }

}

// 문제
// 피보나치 수열은 수학에서 아주 유명한 수열이다. 피보나치 수열을 이루는 수들을 피보나치 수라고 한다.

// 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

// 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.

// n이 0 ~ 15일때 까지 피보나치 수를 써보면 다음과 같다.

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610

// n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

 

// 입력
// 첫째 줄에 n이 주어진다. n은 45보다 작거나 같은 자연수이다.

 

// 출력
// 첫째 줄에 n번째 피보나치 수를 출력한다.  

// 예제 입력
// 10
// 예제 출력
// 55
