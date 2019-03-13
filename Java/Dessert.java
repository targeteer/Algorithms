import java.util.Scanner;

//먼저 순서대로 구현 못하면 못품
//모든 경우의 수를 구현하고
//탈출문에서 계산 할 것

//구현 + 재귀가 합쳐진 문제. 재귀/구현/계산을 적절히 나눌 것
public class Dessert {

    public static int cows[] = new int[15];
    public static String sign[] = new String[15];
    public static int ncows;
    public static int sum = 0;
    public static int count = 0;

    // this.cow, this.sign을 매번 복사해줄 필요성(원본이 훼손되면 안됨)
    void printDessert(int length) {
       
        // 배열 내 값이 바뀌지 않도록 복사하여 사용 및 출력
        String signcopy[] = new String[15];
        int cowscopy[] = new int[15];
        if (ncows == length + 1) {
            for (int i = 0; i < 15; i++) {
                cowscopy[i] = cows[i];
                signcopy[i] = sign[i];

            }
            // 부호의 갯수(length)는 소의 숫자보다 하나 적다
            // 계산시작
            // 점처리
            for (int i = 0; i < length; i++) {
                if (signcopy[i] == ".") {
                    cowscopy[i + 1] = cowscopy[i] * 10 + cowscopy[i + 1];
                    cowscopy[i] = 0;
                }
            }

            sum += 1;
            for (int m = 0; m < length;) {
                // 부호가 +
                if (signcopy[m] == "+") {
                    while (cowscopy[m + 1] == 0) {
                        m++;
                    }
                    sum += cowscopy[m + 1];
                    m++;
                }
                // 부호가 -
                else if (signcopy[m] == "-") {
                    while (cowscopy[m + 1] == 0) {
                        m++;
                    }
                    sum -= cowscopy[m + 1];
                    m++;
                }
            }
        }
        // if (this.sum == 0)

        if (ncows == length + 1) {
            if (sum == 0) {
                count++;
                // 답안 출력
                for (int i = 0; i < ncows; i++) {
                    System.out.print(cows[i] + " ");
                    if (i < ncows - 1) {
                        System.out.print(sign[i] + " ");
                    }
                }
                System.out.println();
                sum = 0;
                return;
            } else {
                sum = 0;
                return;
            }
           
        }
        // (한칸 뒤 인위적으로 돌아갈 필요없음. 재귀 자체로 돌아감)
      
        sign[length] = "+";
        printDessert(length + 1);
        sign[length] = "-";
        printDessert(length + 1);
        sign[length] = ".";
        printDessert(length + 1);  
        return;
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int ncows = scanner.nextInt();

        Dessert dessert = new Dessert();
        // 1 ~ n 까지 숫자입력
        dessert.ncows = ncows;
        for (int i = 0; i < ncows; i++) {
            dessert.cows[i] = i + 1;
        }
        dessert.printDessert(0);
        
        
    }
}

// Dessert (Dessert.cpp)
 

// 문제
// 농부 존은 소들의 저녁식사 줄 세우는 새로운 방법을 개발 했다. N(1~15)마리의 소들을 순서대로 세 워놓은 후, 각 소들 사이에 +, - , . 셋 중 1가지가 써져있는 냅킨을 배치해서 최종 결과가 0 이 되게 해야 하는 것이다. 점(.)이 써져있는 냅킨을 통해 더 큰 수를 만들 수 있게 된다. 아래와 같은 경우를 보자. (ps .이 써져있는 냅킨은 '공백'이라고 생각하면 된다.)

// 1-2.3-4.5+6.7
// 이와 같은 배치는 1-23-45+67 을 나타낸다. 결과는 0 이다. 10.11은 1011 로 해석된다.

 

// 입력
// 첫 째 줄에는 소들의 수 N이 입력된다.

 

// 출력
// 처음 20줄에 대해 가능한 20가지 답을 출력하는데, 사전 순으로 앞선 것을 출력한다. 순서는 +가 가장 앞서고 -와 . 이 순서대로 뒤따른다. 답이 20개 미만이면 가능한 답을 각 숫자와 문자 사이에 공백을 두고 출력한다. 모두 출력한다. 마지막 줄에는 가능한 답의 총 가지수를 출력한다.

 

// 예제 입력
// 7
// 예제 출력
// 1 + 2 - 3 + 4 - 5 - 6 + 7
// 1 + 2 - 3 - 4 + 5 + 6 - 7
// 1 - 2 + 3 + 4 - 5 + 6 - 7
// 1 - 2 - 3 - 4 - 5 + 6 + 7 
// 1 - 2 . 3 + 4 + 5 + 6 + 7 
// 1 - 2 . 3 - 4 . 5 + 6 . 7
// 6