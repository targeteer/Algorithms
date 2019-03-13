import java.util.Scanner;

public class inequal {

    static int arr[] = new int[11];
    static int numbers[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    static String compare[] = new String[9];
    static int N;
    static int countGreater;
    static int countLess;
    // min, max가 0이면 출력, 1이면 return;
    static int max = 0;
    static int min = 0;
    static boolean isInequal = true;

    static void allNum(int length, int num) {

        if (length < N) {
            System.out.println(length);

            // 최솟값 구하기
            isInequal = true;
            if (length == 0) {

                if (compare[length].equals(">")) {
                    arr[length] = num;
                    // numbers[N] = -1;
                    allNum(length + 1, 0);
                } else if (compare[length].equals("<")) {
                    arr[length] = num;
                    // numbers[length] = -1;
                    allNum(length + 1, 0);
                }

                if(num < 10){
                    if(isInequal == false){
                // numbers[N] = arr[length];
                allNum(length, num + 1);
                    }
                }
                return;
            } else {
                arr[length] = num;
                System.out.println("length:" + length);
                if (compare[length].equals(">")) {
                    if (arr[length] > arr[length-1]) {
                        // numbers[length] = -1;
                        allNum(length + 1, 0);
                    }
                    if(num < 10){
                    // numbers[num] = arr[length];
                    allNum(length, num + 1);
                    }
                    isInequal = false;
                    return;
                } else if (compare[length].equals("<")) {
                    if (arr[length] < arr[length-1]) {
                        // numbers[length] = -1;
                        allNum(length + 1, 0);
                    }
                    if(num < 10){
                    // numbers[num] = arr[length];
                    allNum(length, num + 1);
                    }
                    isInequal = false;
                    return;
                }
            }
           

        } else if(length==N) {
            String result = "";
            for (int i = 0; i <= N; i++) {
                result += Integer.toString(arr[i]);
            }
            System.out.println(result);
            return;
        }

    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        scanner.nextLine();
        String str = scanner.nextLine();
        compare = str.split(" ");

        allNum(0, 0);

    }
}