import java.util.Scanner;

public class seat {
 
    public static void main(String[] args) {
        /*
        주의할점
        1. 범위추가 문제
        2. 90도 전환
        3. if문  return 을 이용하여 추가후 return 아니면 return 후 추가 구별!
        */
     

        Scanner scanner = new Scanner(System.in);

        int C = scanner.nextInt();
        int R = scanner.nextInt();
        int K = scanner.nextInt();

       
        int seatLocation [][] = new int [C][R];
        int seatCounter = 1;
        int x = 0;
        int y = 0;

        int A = C;
        int B = R;


        while(C*R >= seatCounter) {
            for(int i = 0; i < R; i++){
                
                if(seatCounter == K){
                    System.out.println((y+1) + " " + (x+1));
                    return;
                }
                seatLocation[y][x] = seatCounter++;
                x++;
            }
            x--;
            y++;

            for(int i = 0; i < C - 1; i++){

                if(seatCounter == K){
                    System.out.println((y+1) + " " + (x+1));
                    return;
                }
                seatLocation[y][x] = seatCounter++;
                y++;
            }
            y--;
            x--;

            for(int i = 0; i < R - 1; i++){
                
                if(seatCounter == K){
                    System.out.println((y+1) + " " + (x+1));
                    return;
                }
                seatLocation[y][x] = seatCounter++;
                x--;
            }
            x++;
            y--;

            for(int i = 0; i < C - 2; i++){
                if(seatCounter == K){
                    System.out.println((y+1) + " " + (x+1));
                    return;
                }
                seatLocation[y][x] = seatCounter++;
                y--;
            }
            y++;
            x++;
            R--;
            C--;
           
        }
       
      
        

    }
}
