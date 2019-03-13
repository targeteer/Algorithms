import java.util.Scanner;
//항상 문제의 input parameter가 그대로 함수에 쓰이는 건 아님!
//주로 재귀함수는 트리형식으로 그릴 수 있음!
//백트래킹 알고리즘

public class Tobin {

    int arr[] = new int [100];
    int n;
    int k;
    void printTobin(int length, int count) {
        // 함수의 정의 : k갯수만큼 1을 가지는 n자릿수 이진법 출력
        
        // 출력 길이가 n이고 1의 갯수가 k면 retun
        if(length >= this.n){
            if(count == this.k){
                for(int i = 0; i < n; i++){
                    System.out.print(arr[i]);
                }   
                System.out.println();   
            }     
            return;
        }
        if(count < this.k){
            //1의 갯수가 적을경우
            arr[length]=1;
            printTobin(length+1, count+1);
        }
        
        arr[length] = 0;
        printTobin(length+1, count);
    }
     
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
    
        Tobin tobin = new Tobin();
        tobin.n = n;
        tobin.k = k;
        tobin.printTobin(0, 0);
    }
}
     

    

    

// 문제
// 두 정수 n, k를 입력받아 k개의 1을 가진 n자리 이진 패턴을 출력하는 프로그램을 작성하세요.

 

// 입력
// 두 정수 n,k가 입력으로 주어진다. ( 0< n <= 30, 0 <= k < 8 , n>=k )

 

// 출력
// 결과를 내림차순으로 출력한다.

 

// 예제 입력
// 2 1
// 예제 출력
// 10
// 01
 

// 예제 입력
// 2 0
// 예제 출력
// 00
 

// 예제 입력
// 4 2
// 예제 출력
// 1100
// 1010
// 1001
// 0110
// 0101
// 0011