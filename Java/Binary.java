import java.util.Scanner;

public class Binary {

    // * 재귀함수 디자인을 위한 3가지 절차
    // 1) 함수의 역할을 말로 정확하게 정의한다.
    // 2) 기저조건(Base condition) = 제일 단순한 경우에서 제대로 동작함을 보인다.
    // getFactorial 경우 인자가 0일 때
    // 3) 함수가 (작은 input에 대하여) 제대로 동작한다고 가정하고 함수를 완성한다.
    void printBinary(int x){
        //N을 이진수로 변환하여 "출력"하는 함수
        //Base Condition
        if(x == 0){
            System.out.print("0");
        }
        else if(x == 1){
            System.out.print("1");
        }
        else{
            printBinary(x/2);
            System.out.print(x%2);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        Binary binary = new Binary(); 
        binary.printBinary(a);
          
    }
}