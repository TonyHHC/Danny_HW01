/* Review02_學號.java */

import java.util.Arrays;

public class HW1{

     public static void main(String []args){
         
        System.out.println("** Review04_學號.java **");
        
        /*
        int[][] a = {
            {1, 2, 1},
            {0, 1, 2}
        };
        int[][] b = {
            {1, 2},
            {0, 1},
            {1, 0}
        };*/
        
        int [][]a = new int[2][3];
        int [][]b = new int[3][2];
        
        // 初始化
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                a[i][j] = (int)(Math.random()*(2-0+1))+0;
            }
        }
        
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[i].length; j++){
                b[i][j] = (int)(Math.random()*(2-0+1))+0;
            }
        }
        
        // 相乘
        int[][] c = multiply(a, b);
        
        // 列印 a
        System.out.println("");
        System.out.print("a = ");
        for(int[] element_row : a){
            System.out.print("\r\n\t");
            for(int element_col : element_row)
                System.out.print(element_col + " ");
        };
        
        // 列印 b
        System.out.println("");
        System.out.print("b = ");
        for(int[] element_row : b){
            System.out.print("\r\n\t");
            for(int element_col : element_row)
                System.out.print(element_col + " ");
        };
            
        // 列印 multiply
        System.out.println("");
        System.out.print("multiply = ");
        for(int[] element_row : c){
            System.out.print("\r\n\t");
            for(int element_col : element_row)
                System.out.print(element_col + " ");
        };
        
     }
     
     public static int[][] multiply(int[][] a, int[][] b){
         
        // 取得新陣列長度
        int iNewArrayRowLength = a.length;
        int iNewArrayColLength = b[0].length;
        // 建立新陣列
        int [][] aryNewArray = new int[iNewArrayRowLength][iNewArrayColLength];
         
        // 開始相乘
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    aryNewArray[i][j] = aryNewArray[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        return aryNewArray;
     }
}
