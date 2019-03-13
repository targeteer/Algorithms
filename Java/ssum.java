import java.util.Scanner;

public class ssum {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        //각 a,b,c..등 저장하는 배열
        int num[] = new int[N];

        int arr[][] = new int[N][N];
        int sum = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j< N; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        int temp = arr[0][1] + arr[0][2] - arr[1][2];
        //j값을 3으로하면 n이 2인경우가 있어 arrays bounds exception
        num[0] = temp/2;

        for(int i = 1; i < N; i++){
            num[i] = arr[i][0] - num[0];
        }
        
        for(int i = 0; i < N; i++){
            System.out.print(num[i]+ " ");
        }
    }
}


// 준혁이의 수열 (sequencesum.cpp)
 

// 문제
// 준혁이는 양의 정수 N개로 이루어진 수열 A의 정체를 아무에게나 알려주고 싶지 않았다. 그래서 준혁이는 수열 A의 모든 두 수의 합만을 적어놓고 이를 S라고 했다. 이 때, 수열 A를 구하는 프로그램을 작성하시오.  

// 입력
// 첫째 줄에 수열의 크기 N이 주어진다. (3 ≤ N ≤ 1000)

// 다음 N개 줄에는 100,000보다 작거나 같은 양의 정수가 N개씩 주어진다. 이 숫자들은 S를 이루는 숫자이며, S(i,j) = A[i] + A[j] (i≠j), S(i,j) = 0 (i=j) 이다. S(i,j)는 i번째 줄, j번째 숫자를 의미하며, A[i]는 A의 i번째 수이다.

// 입력으로 주어지는 S에 해당하는 수열 A는 항상 유일하다.  

// 출력
// 첫째 줄에 수열 A를 출력한다.

 

// 예제 입력
// 4
// 0 3 6 7
// 3 0 5 6
// 6 5 0 9
// 7 6 9 0
// 예제 출력
// 2 1 4 5
 

// 출처
// COCI 2012/2013 Contest #6 2번  

// 힌트
// 즉 S의 2행 3열(예제에서는 5)이 의미하는 바는 A[2] + A[3] (예제에서는 1+4) 이다.