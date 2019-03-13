import java.util.Scanner;

// 모든 경우의 수 출력
public class goodseq {

    static int N;
    static int integers[] = { 1, 2, 3 };
    static int digit[] = new int[10000];
    static boolean flag = false;
    static int count = 0;
    static int min = 0;

    static void combination(int length, int num) {

        // 비교하려는 자리 갯수(a) 및 검사식은 무조건 돌아가야함(N==length가 아니더라도)
        // 
        for (int a = 1; a <= (length / 2); a++) {

            count = 0;
            for (int c = (length - 1); c > (length - 1) - a; c--) {
                // 앞쪽비교하려는 수
                if (c - a >= 0) {
                    if (digit[c] == digit[c - a]) {
                        count++;
                    }
                }
            }
            if (count == a) {
                return;
            }
        }

        // 출력은 조건을 만족한 경우만
        if (min == 0 && length == N) {
            for (int i = 0; i < N; i++) {
                System.out.print(digit[i]);
            }
            System.out.println();
            min++;
            return;
        }

        // 7자리경우 리턴이 7번을 해야 함수가 완전히 끝난다.
        if (length < N) {
            digit[length] = 1;
            combination(length + 1, num + 1);
            // 이 조건은 최소값을 찾고 출력 후에도 combination()은 계속 돌기때문에 완전한 exit을 위해 넣어줌
            // 
            if (min != 0) {
                return;
            }
        }

        digit[length] = 2;
        combination(length + 1, num);

        if (min != 0) {
            return;
        }

        digit[length] = 3;
        combination(length + 1, num);
        if (min != 0) {
            return;
        }

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        combination(0, 1);

    }

    // for (int i = 1; i <= N; i++) {
    // System.out.print(digit[i]);
    // }

}

// 문제
// 숫자 1, 2, 3으로만 이루어지는 수열이 있다. 임의의 길이의 인접한 두 개의 부분 수열이 동일한 것 이 있으면, 그 수열을 나쁜
// 
// 
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

// 다음은 나쁜 수열의 예이다.

// 33

// 32121323

// 123123213

// 다음은 좋은 수열의 예이다.

// 2

// 32

// 32123

// 1232123

// 길이가 N인 좋은 수열들을 N자리의 정수로 보아 그중 가장 작은 수를 나타내는 수열을 구하는 프로그램 을 작성하라. 예를 들면,
// 
// 
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
// 1213121과 2123212는 모두 좋은 수열이지만 그 중에서 작은 수를 나타내는 수 열 1213121이다.
// 
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

// 입력
//
// 입력은 숫자 N하나로 이루어진다. N은 1 이상 80 이하이다.

// 출력
// 첫 번째 줄에 1, 2, 3으로만 이루어져 있는 길이가 N인 좋은 수열들 중에서 가장 작은 수를 나타내 는 수열만 출력한다. 수열을 이루
// 
// 
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
// 1, 2, 3들 사이에는 빈칸을 두지 않는다.

// 예제 입력
//
//
//
// 예제 출력
// 1213121
//
//
//

//
//
//

//
//
//

//
//
//

//
//
