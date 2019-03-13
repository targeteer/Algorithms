import java.util.Scanner;

public class classpresident {
 
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int classList[][] = new int[n][5];
        int isSame[] = new int[n];
        int curClass = 0;
        int max = 1;
        int count;
        int who = 0;

        //같은 반이었는지 여부 확인
        for(int i = 0; i < n; i++){
            isSame[i] = 0;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 5; j++){
                classList[i][j] = scanner.nextInt();
            }
        }

        //현재 i번 학생
        for(int i = 0; i < n; i++){
            //다시 0으로 초기화
            for(int m = 0; m < n; m++){
                isSame[m] = 0;
            }

            //i번 학생의 1~j학년 반 입력 후 같은반이었는지 확인
            for(int j = 0; j < 5; j++){
                curClass = classList[i][j];
                for(int k = 0; k < n; k++){
                    if(curClass == classList[k][j]){
                        isSame[k] = 1;
                    }
                }
            }

            count = 0;
            for(int o = 0; o < n; o++){
                
                if(isSame[o] == 1){
                   count++;
                }
            }
    
            if(max < count){
                max = count;
                who = i;
            }
    
        }
        System.out.println(who+1);
    }
}
