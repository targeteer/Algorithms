import java.util.Scanner;

public class Division{

    int a[] = new int[100];
    int n;
    int length = 0;
    int count = 0;
    void printDivision(int sum){
    //재귀함수에서 number++와 같이 영구적으로 증가시키는 건 매우 위험!
    //재귀함수의 parameter가 탈출구에 쓰이는게 좋음(계속 함수는 변하기 때문에)
        if(sum == this.n){
            //갈수록 작은숫자를 걸러내기 위한 장치(더효율적인 방법은 밑에)
            for(int j = 0; j <= length; j++){
                if(a[j] < a[j+1]){
                    return;
                }
            }
            for(int i = 0; i <= length; i++){
                System.out.print(a[i]);
                if(i<length-1){
                    System.out.print("+");
                }else{
                    System.out.println();
                    count++;
                    return;
                }
            } 
        }else if(sum > this.n){
            return;
        }
        for(int i = this.n-1; i > 0;){
            // 뒤의 숫자가 큰 경우 위에서 반복문으로 걸러내는 것보다 여기서 걸러내는게 좋고(효율성,
            // length == 0인경우와 a[length-1] < i경우 크게 묶어서 짜면됨
            a[length] = i;
            length++;
           // sum += i;
           // sum이 증가한 만큼 감소해야 f(5) -> f(4)로 넘어감. 증가한만큼 줄여줘야 코드가 무한 증가하지 않음.
            printDivision(sum+i);
            length--;
            i--;
        }
    }



    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Division division = new Division();
        division.n = n;

        division.printDivision(0);
        System.out.println(division.count);

    }
}


// 문제
// 임의의 자연수는 그보다 작은 자연수들의 합으로 표현될 수 있다. 예를 들어 4의 경우,

// 4 = 3+1
//   = 2+2 
//   = 2+1+1 
//   = 1+1+1+1
// 위와 같은 방법으로 표현 될 수 있다. 이 때 , 숫자의 구성이 같으면서 그 순서만이 다른 경우는 같은 경우로 생각하는데, 예를 들어 다음 세 가지 경우는 모두 같은 경우이다.

// 2 + 1 + 1, 1 + 2 + 1 , 1 + 1 + 2
// 자연수 n을 입력 받아 이를 n보다 작은 자연수들의 합으로 나타내는 방법을 모두 출력하는 프로그램을 재귀 호출을 사용하여 작성하시오.

 

// 입력
// 첫 줄에 2 이상 20 이하의 자연수 n이 주어진다.

 

// 출력
// 첫째 줄부터 모든 방법을 한 줄에 하나씩 출력한다. 하나의 식 안에는 큰 숫자가 앞으로 오도록 하 고, 전체적으로는 앞의 숫자가 큰 식이 먼저 출력되도록 한다. 숫자와 더하기 사이에는 공백이 없다. 그리고 마지막 줄에는 나누어진 자연수의 개수를 출력한다.

 

// 예제 입력
// 5
// 예제 출력
// 4+1
// 3+2
// 3+1+1
// 2+2+1
// 2+1+1+1
// 1+1+1+1+1
// 6
