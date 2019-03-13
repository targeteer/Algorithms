import java.util.Scanner;

public class prosjek {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int arr[] = new int[N];
        int sum;
        int prevsum;
        int cur;

        for(int i = 0; i < N; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i = N-1; i> 0; i--){
            
            sum = arr[i] * (i+1);
            prevsum = arr[i-1] * (i);
            cur = sum - prevsum;
            arr[i] = cur;
            

        }

        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
        
        

    }
}


// 문제
// 홍준이는 심심해서 수열을 가지고 놀고 있다. 먼저, 정수 수열 A를 쓴다. 그리고 그 아래에 정수 수열 A의 해당 항까지의 평균값을 그 항으로 하는 정수 수열 B를 쓴다.

// 예를 들어, 수열 A가 1, 3, 2, 6, 8이라면, 수열 B는 1/1, (1+3)/2, (1+3+2)/3, (1+3+2+6)/4, (1+3+2+6+8)/5, 즉, 1, 2, 2, 3, 4가 된다.

// 수열 B가 주어질 때, 홍준이의 규칙에 따른 수열 A는 뭘까?

 

// 입력
// 첫째 줄에는 수열 B의 길이만큼 정수 N(1 ≤ N ≤ 100)이 주어지고, 둘째 줄에는 수열 B를 이루는 N개의 정수가 주어진다. 각 정수는 1,000,000,000 이하의 자연수이다.

// 입력은 A 수열을 이루는 수들이 모두 1,000,000,000 이하의 자연수가 되도록 주어진다.  

// 출력
// 첫째 줄에 A 수열을 이루는 N개의 정수를 출력한다.  

// 예제 입력
// 1
// 2
// 예제 출력
// 2
 

// 예제 입력
// 4
// 3 2 3 5
// 예제 출력
// 3 1 5 11
 

// 예제 입력
// 5
// 1 2 2 3 4
// 예제 출력
// 1 3 2 6 8
 

// 출처
// COCI 2014/2015 Contest #1 1번  