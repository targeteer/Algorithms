import java.util.Scanner;

public class Danji {

    // 001
    // 011
    // 인 케이스 조심
    // 입력시 공백이 없어 문자열로 받은 후 정수로 출력
    public static int board[][] = new int[30][30];
    public static int n;
    public static int count = 0;
    public static int countDanji = 0;
    public static int countarr[] = new int[30];

    // 상하좌우 모두 검사
    // 기저조건은 main에서, 단지 검색은 재귀함수로
    // main과 재귀함수의 역할을 잘 분리할 것!
    public static void inspect(int col, int row) {
        if (board[col][row] == 1) {
            board[col][row] = 0;
            count++;
            if (row != n - 1) {
                inspect(col, row + 1);
            }
            if (col != n - 1) {
                inspect(col + 1, row);
            }
            if (row != 0) {
                inspect(col, row - 1);
            }
            if (col != 0) {
                inspect(col - 1, row);
            }

        }
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        String[] str = new String[n];

        // enter
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            str[i] = scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                Character ch = str[i].charAt(j);
                Integer num = Integer.parseInt(ch.toString());
                board[i][j] = num;
            }
        }

        // 검사는 재귀로, 나머지 외적함수는 for문에서 해결
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inspect(i, j);
                if (count > 0) {
                    countarr[countDanji] = count;
                    countDanji++;
                }
                count = 0;
            }
        }

        // 출력
        System.out.println(countDanji);

        // 오름차순 정리 및 출력(기본적인 반복문 두번)
        for (int i = 0; i < countDanji-1; i++) {
            for(int j = 0; j < countDanji-1; j++)
            if (countarr[j] > countarr[j + 1]) {
                int tmp = 0;
                tmp = countarr[j];
                countarr[j] = countarr[j+1];
                countarr[j+1] = tmp;
            } 
        }

        for (int i = 0; i < countDanji; i++) {
            System.out.println(countarr[i]);
        }

    }
}

// 단지번호 붙이기 (danji.cpp)

// 문제
// <그림 1>과 같이 정사각형 모양의 지도가 있다. 1은 집이 있는 곳을, 0은 집이 없는 곳을 나타낸다. 철수는 이 지도를 가지고 
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
// 결된 집들의 모임인 단지를 정의하고, 단지에 번호를 붙이려 한다. 여기서 연결되었다는 것은 어떤 집이 좌우, 혹은 아래위로
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
// 다른 집이 있는 경우를 말한다. 대각선상에 집이 있는 경우는 연결된 것이 아니다. <그림 2>는 <그림 1>을 단지별로 번호를 
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
// 인
//
// 것이다. 지도를 입력하여 단지수를 출력하고, 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.
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

// tetrismapex

// 입력
// 첫 번째 줄에는 지도의 크기 N(정사각형이므로 가로와 세로의 크기는 같으며 5≤N≤25)이 입력되고, 그 다음 N줄에는 각각 N
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
// 의 자료(0혹은 1)가 입력된다. (숫자와 숫자사이에는 공백이 없다.)
// 
//
//
//
//
//
//
//

// 출력
// 첫 번째 줄에는 총 단지수를 출력하시오. 그리고 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력하시오.
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

// 예제 입력
// 7
// 0110100
// 0110101
// 1110101
// 0000111
// 0100000
// 0111110
// 0111000
// 예제 출력
// 3
// 7
// 8
// 9
