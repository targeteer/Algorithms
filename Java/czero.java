import java.util.Scanner;
 
public class czero {
 
    public static void main(String[] args) {
        //숫자가 매우 커지기 때문에 0을 만드는 것이 무엇인지 고민해볼 것
        //초기화 조심
        //2,5 갯수 계산 유의

        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = n-m;

        int ntwocount = 0;
        int nfivecount = 0;
        int mtwocount = 0;
        int mfivecount = 0;
        int ltwocount = 0;
        int lfivecount = 0;
     
        for(int i = n; i > 0; i--){
            int z = i;
            while(z % 2 == 0){
                z /= 2;
                ntwocount++;
            }
            while(z % 5 ==0){
                z /= 5;
                nfivecount++;
            }
         
        }
       

        for(int i = m; i>0; i--){
            int z = i;
            while(z % 2 == 0){
                z /= 2;
                mtwocount++;
            }while (z % 5 ==0){
                z /= 5;
                mfivecount++;
            }

        }

       

        for(int i = l; i>0; i--){
            int z = i;
            while(z % 2 == 0){
                z /= 2;
                ltwocount++;
            }while(z % 5 ==0){
                z /= 5;
                lfivecount++;
            }
           
        }
        
        int twocount = ntwocount - (mtwocount + ltwocount);
        int fivecount = nfivecount - (mfivecount + lfivecount);
        //2끼리, 5끼리 계산할 것
 
        int ans = Math.min(twocount, fivecount);

        if(ans > 0){
            System.out.println(ans);
        }else{
            System.out.println(0);
        }
     
    }
}
 
 
// 조합 0의 개수 (combinationzero.cpp)
 
 
// 문제
// n명의 사람중 m명을 순서에 상관없이 뽑는 경우의 수를 조합이라고 하며 nCm으로 나타낸다.
 
// nCm은 수식으로 n!/m!(n-m)! 으로 구할 수 있다. (5! = 12345)
 
// n과 m이 주어졌을때 nCm의 끝자리 0의 개수를 출력하는 프로그램을 작성하시오.  
 
// 입력
// 첫째 줄에 정수 n, m(0≤m≤n≤1,000,000)이 들어온다.
 
 
 
// 출력
// 첫째 줄에 0의 개수를 출력한다.
 
 
 
// 예제 입력
// 25 12
// 예제 출력
// 2


// 조합 0의 개수 (combinationzero.cpp)
 

// 문제
// n명의 사람중 m명을 순서에 상관없이 뽑는 경우의 수를 조합이라고 하며 nCm으로 나타낸다.

// nCm은 수식으로 n!/m!(n-m)! 으로 구할 수 있다. (5! = 12345)

// n과 m이 주어졌을때 nCm의 끝자리 0의 개수를 출력하는 프로그램을 작성하시오.  

// 입력
// 첫째 줄에 정수 n, m(0≤m≤n≤1,000,000)이 들어온다.

 

// 출력
// 첫째 줄에 0의 개수를 출력한다.

 

// 예제 입력
// 25 12
// 예제 출력
// 2

    // if(n==0 || m==0){
    //     System.out.println(1);
    //     return;
    // }

    // int a = 1;
    // for(int i = n; i>0; i--){
    //     a *= i;
    // }
    // System.out.println(a);
    // while(true){
    //     if(a % 2 == 0){
    //         a /= 2;
    //         atwocount++;
    //     }else if(a % 5 == 0){
    //         a /= 5;
    //         afivecount++;
    //     }else{
    //         break;
    //     }
    // }

    // int atencount;
    // if(atwocount >= afivecount){
    //     atencount = afivecount;
    // }else{
    //     atencount = atwocount;
    // }


    // int b = 1;
    // for(int i = m; i>0; i--){
    //     b *= i;
    // }
    // System.out.println(b);

    // while(true){
    //     if(b % 2 == 0){
    //         b /= 2;
    //         btwocount++;
    //     }else if(b % 5 == 0){
    //         b /= 5;
    //         bfivecount++;
    //     }else{
    //         break;
    //     }
    // }

    // int btencount;
    // if(btwocount >= bfivecount){
    //     btencount = bfivecount;
    // }else{
    //     btencount = btwocount;
    // }

    // int c = 1;
    // for(int i = l; i>0; i--){
    //     c *= i;
    // }
    // System.out.println(c);

    // while(true){
    //     if(c % 2 == 0){
    //         c /= 2;
    //         ctwocount++;
    //     }else if(c % 5 == 0){
    //         c /= 5;
    //         cfivecount++;
    //     }else{
    //         break;
    //     }
    // }

    // int ctencount;
    // if(ctwocount >= cfivecount){
    //     ctencount = cfivecount;
    // }else{
    //     ctencount = ctwocount;
    // }

    // int ans = atencount - (btencount + ctencount);

    // if(ans > 0){
    //     System.out.println(ans);
    // }else{
    //     System.out.println(0);
    // }
