import java.util.Scanner;

public class Mountain {

    // * 재귀함수 디자인을 위한 3가지 절차
    // 1) 함수의 역할을 말로 정확하게 정의한다.
    // 2) 기저조건(Base condition) = 제일 단순한 경우에서 제대로 동작함을 보인다.
    // getFactorial 경우 인자가 0일 때˜
    // 3) 함수가 (작은 input에 대하여) 제대로 동작한다고 가정하고 함수를 완성한다.
    void printMountain(int x){
        //입력받은 숫자를 중심으로 대칭이 되는 봉우리 만들기
        
        //Base Condition은 x == 1, "1" 출력하기
        if(x == 1){
            System.out.print(x);
            return;
        }else{
            printMountain(x-1);
            System.out.print(x);
            printMountain(x-1); 
            return;
        }
    }


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Mountain Mountain = new Mountain();

        Mountain.printMountain(n);
    }
}