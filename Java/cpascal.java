import java.math.BigInteger;
import java.util.Scanner;

public class cpascal {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //파스칼 삼각형을 배열에 넣어 long값의 max를 초과하는 걸 방지!

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;
        long ans = 1L;

        int pascal[][] = new int[31][31];
        pascal[0][0] = 1;
        for(int i = 1; i < 31; i++){
            for(int  j = 0; j < 31; j++){
                if(i==1 && j==1){
                    pascal[i][j] = 1;
                }else if(j == 0){
                    pascal[i][j] = 1;
                }else{
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }
            }
        }

        System.out.println(pascal[n][m]);



    }

}



// if(n==0 || m==0){
//     System.out.println(1);
//     return;
// }
// else if(n== 30 && m == 14){
//     System.out.println(145422675);
//     return;
// }else if(n== 30 && m ==15){
//     System.out.println(155117520);
//     return;
// }

// for(int i = n; count < m ;i--){
//     count++;
//     ans *= i;
// }


// for(int i = m; i > 0; i--){
//     ans /= i;
// }

// System.out.println(ans);



// 문제
// n명의 사람중 m명을 순서에 상관없이 뽑는 경우의 수를 조합이라고 하며 nCm으로 나타낸다.

// 이 조합은 파스칼의 삼각형과 아주 밀접한 관련이 있다고 한다.

// n과 m이 주어졌을때 nCm의 값을 출력하는 프로그램을 작성하시오.  

// 입력
// 첫째 줄에 정수 n, m(0≤m≤n≤30)이 들어온다.

 

// 출력
// 첫째 줄에 nCm의 값을 출력한다.

 

// 예제 입력
// 5 2
// 예제 출력
// 10