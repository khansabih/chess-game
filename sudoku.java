import java.io.*;
import java.util.*;
import java.java.lang.Math;
class sudoku{
    static int checkRow(String b[][],int rowToCheck){
        int valid=0;
        int list[]=new int[9];
        int validList={1,2,3,4,5,6,7,8};
        for(int i=0;i<9;i++){
            list[i]=Integer.parseInt(b[rowToCheck][i]);
        }
        Arrays.sort(list);
        return valid;
    }
    static void initializeSudokuBoard(String b[][]){
        Random rand = new Random();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int num = rand.nextInt(10);
                //Check row
                //Check column
                //Check grid
            }
        }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board[][]=new String[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j]=i+""+j;
            }
        }
        System.out.println("This is your playground : ");
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
        
        // int stop=0;
        // while(stop!=1){

        // }
    }
}