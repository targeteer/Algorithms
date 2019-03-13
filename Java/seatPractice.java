import java.util.Scanner;

public class seatPractice {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int C = scanner.nextInt();
        int R = scanner.nextInt();
        int K = scanner.nextInt();

        //꺾은 횟수
        int lineCounter = 0;

        //나눠준 표 
        int seatCounter = 1;
         
        //현재 세고있는 줄의 정보(0,1,2,3)
        int lineLocation = 0;

        //현재 세고있는 줄의 좌석 갯수를 세기 위한 조정값
        int seatOccupied = (lineLocation+1)/2;

        //공연장 위치 초기화 
        int seatLocation [][] = new int [R][C];

        //대기번호가 좌석 수 보다 작을 경우
        while(C*R >= K && C*R >= seatCounter){
        //상단 ->
        if(lineLocation == 0){
            if(seatOccupied < R/2){
            for(int i = 0 + seatOccupied; i < C - seatOccupied; i++){
                seatLocation[seatOccupied][i] = seatCounter;
                seatCounter++;
                }
            }
            
        }
        lineCounter++;  
        lineLocation = lineCounter % 4;
        seatOccupied = (lineCounter+1)/4;

        //우측 하강
        if(lineLocation == 1){
            if(C - seatOccupied > C/2){
            for(int i = 0 + seatOccupied; i < R - seatOccupied + 1 ; i++){
                seatLocation[i][C-seatOccupied] = seatCounter;
                seatCounter++;
                }
            }
        }
        lineCounter++;  
        lineLocation = lineCounter % 4;
        seatOccupied = (lineCounter+1)/2;


        //하단 <-
        if(lineLocation == 2){
            if(R - seatOccupied > R/2){
            for(int i = C - 1 - seatOccupied; i >= -1 + seatOccupied; i--){
                seatLocation[R - seatOccupied][i] = seatCounter;
                seatCounter++;
                }
            }
        }
        lineCounter++;  
        lineLocation = lineCounter % 4;
        seatOccupied = (lineCounter+1)/2;


        //좌측 상승
        if(lineLocation == 3){
            if(seatOccupied < R/2){
            for(int i = R - seatOccupied; i >= -1 + seatOccupied; i--){
                    seatLocation[i][seatOccupied] = seatCounter;
                    seatCounter++;
                }  
            }
        }
        lineCounter++;  
        lineLocation = lineCounter % 4;
        seatOccupied = (lineCounter+1)/2;

        break;
    }  

    for(int a = 0; a < R; a++){
        for(int b = 0; b < C; b++){
            System.out.print(seatLocation[a][b] + " ");
        }
        System.out.println();
    }

//     if(K==seatCounter){
//        int X = 0;
//        int Y = 0;
//          for(int i = 0; i < R; i++){
//             for(int j = 0; j < C; j++){
//                 if(K == seatLocation[i][j]){
//                     X = i;
//                     Y = j;
                   
//                 }
//                 }
//             }
//         System.out.print(Y + " " + X);
//         }else{
//         System.out.print(0);
    
// }

    
    
    scanner.close();
        

        
    }
}