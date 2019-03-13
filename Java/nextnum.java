import java.util.Scanner;

public class nextnum {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a1;
        int a2;
        int a3;
        int cd = 0; //공차
        int cr = 0; //공비

       while(true){
                a1 = scanner.nextInt();
                a2 = scanner.nextInt();
                a3 = scanner.nextInt(); 
            
            if(a1 == 0 && a2 == 0){
                return;
            }

            
            if((a2-a1) == (a3-a2)){
                cd = a2-a1;
                if(cd == 0){
                    continue;
                }
                System.out.println("AP " + (a3 + cd));
            }else if(((a2/a1) == (a3/a2)) && (a2%a1 ==0) && (a3%a2 == 0)){
                cr = a2/a1;
                if(cr == 0){
                    continue;
                }
                System.out.println("GP " + (a3 * cr));
            }
        

    }

}
}

// 문제
// 위키피디아에 따르면 등차수열(arithmetic sequence)은 연속하는 두 항의 차이가 모두 일정한 수열을 뜻한다. 예를 들어, 3, 5, 7, 9, 11, 13, ...은 차이가 2로 일정한 등차수열이다. 이때 두 항의 차이는 이 수열의 모든 연속하는 두 항들에 대해서 공통적으로 나타나는 차이므로, 공차라고 한다. 이 문제에서는 등차수열의 공차를 항상 0이 아닌 정수라고 제한을 둘 것이다.

// 등비수열(geometric sequence)은 각 항이 그 앞 항과. 일정한 비를 가지는 수열을 말한다. 그리고, 이 일정한 비를 공비라고 한다. 예를 들어, 2, 6, 18, 54, ...은 공비가 3인 등비수열이다. 이 문제에서는 등비수열의 공비를 항상 0이 아닌 정수라고 제한을 둘 것이다.

// 어떤 수열의 연속한 세개의 숫자가 주어졌을 때, 이 수열이 등차수열인지 등비수열인지를 구분한 후, 다음 항을 구하라  

// 입력
// 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 수열의 연속하는 세 수 a1, a2, a3이 한 줄에 주어진다. (-10,000 < a1, a2, a3 < 10,000) a1, a2, a3은 서로 다른 수이다.

// 입력의 마지막 줄에는 0이 세 개 주어진다.

 

// 출력
// 각 테스트 케이스마다 아래와 같은 형태로 출력을 해야한다.

// XX V
// XX부분은 AP 또는 GP로 주어진 수들이 등차수열을 이룰 경우 AP를, 등비수열을 이룰 경우 GP를 출력한다. V는 주어진 수들 다음에 나올 수이다. 모든 입력은 항상 등차수열이나 등비수열이다.

 

// 예제 입력
// 4 7 10
// 2 6 18
// 0 0 0
// 예제 출력
// AP 13
// GP 54
 

// 출처
// 2010 Arab Collegiate Programming Contest A번  