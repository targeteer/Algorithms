import java.util.Scanner;
public class fsum {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int ad = scanner.nextInt();
        int b = scanner.nextInt();
        int bd = scanner.nextInt();

        int gcd;
        int lcm;
        int r;

        int AD = ad;
        int BD = bd;
        
        if(bd > ad){
            int tmp = bd;
            bd = ad;
            ad = tmp;
            AD = ad;
            BD = bd;
            tmp = a;
            a = b;
            b = tmp;
        }
      
        while(true){

            r = ad % bd;

            if(r == 0){
                gcd = bd;
                break;
            }
            ad = bd;
            bd = r;
        }
       
        lcm = AD * BD / gcd;

        int simplea;
        int simpleb;
           
        simplea = (lcm/AD) * a;
        simpleb = (lcm/BD) * b;
       
        int nom = simplea + simpleb;
        int denom = lcm;

        a = nom;
        b = denom;
    
        while(true){
            r = a % b; 
                if(r == 0){
                gcd = b;
                a = nom;
                b = denom;
                break;
            }
            a = b;
            b = r;
        
        }
      
        System.out.println(a/gcd + " " + b/gcd);
        return;

    }
}


// 분수합 (fractionsum.cpp)
 

// 문제
// 분자 분모가 모두 자연수인 두 분수의 합 또한 분자 분모가 자연수인 분수로 표현할 수 있다.

// 두 분수가 주어졌을 때, 그 합을 기약분수의 형태로 구하는 프로그램을 작성하시오.

// 기약분수란 더 이상 약분되지 않는 분수를 의미한다.  

// 입력
// 첫째 줄과 둘째 줄에, 각 분수의 분자와 분모를 뜻하는 두 개의 자연수가 순서대로 주어진다. 입력되는 네 자연수는 모두 30,000 이하이다.

 

// 출력
// 첫째 줄에 구하고자 하는 기약분수의 분자와 분모를 뜻하는 두 개의 자연수를 공백으로 구분하여 순서대로 출력한다.

 

// 예제 입력
// 2 7
// 3 5
// 예제 출력
// 31 35
 