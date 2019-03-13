import java.util.Scanner;

public class Tree {

    public static char alphabets [] = new char [26];
    public static int num;

    // // public static void rootNode(int tag){
    //     if(tag<num){
    //     System.out.println(alphabets[tag]);
       
    //     leftNode(tag + 1);
    //     rightNode(tag + 2);
    //     return;
    //     }    
    // } 

    // public static void leftNode(int tag){
    //     if(tag<num){
    //     System.out.println(alphabets[tag]);
    //     leftNode(tag + 1);
    //     rightNode(tag + 2);
    //     return;
    //     }
    // }

    // public static void rightNode(int tag){
    //     if(tag<num){
    //     System.out.println(alphabets[tag]);
    //     leftNode(tag + 1);
    //     rightNode(tag + 2);
    //     return;
    //     }
    // }
    
    // class treeNode(int tag){


       
    // }
    


    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();
        int tag = 0;

        int j = 0;
        for (char i = 'a' ; i <= 'z' ; i++) {
            alphabets[j] = i;
            j++;
        }

        
        public class Node{
            int tag;
            char data = alphabets[tag];
            Node nodeLeft = NULL;
            Node nodeRight = NULL;

        }

        


        
    }
}