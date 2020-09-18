/* Review02_學號.java */

import java.util.Arrays;

public class HW1{

     public static void main(String []args){
         
        System.out.println("** Review03_學號.java **");
        
        /*
        int[][] d = {
            {4, 0, 8},
            {8, 3, 0},
            {1, 0, 1}
        };*/
        
        // 檢查參數
        if(args.length != 1){
            System.out.println("Error!! 請輸入學號");
            return;
        }
        
        String strSchoolID = args[0];
        if(strSchoolID.length() != 9){
            System.out.println("Error!! 學號長度必須為 9 位數");
            return;
        }

        // 將學號轉為 3X3 陣列
        int[][] d = new int[3][3];
        int iRow = 0, iCol = 0;
        for(int i=0 ; i<strSchoolID.length(); i++){
            char ch = strSchoolID.charAt(i);
            if(Character.isDigit(ch)){
                d[iRow][iCol] = Character.getNumericValue(ch);
                iCol++;
                if(iCol >= 3){
                    iRow++;
                    iCol = 0;
                }
            }
            else{
                System.out.println("Error!! 學號必須全部是數字");
                return;
            }
        }
        
        
        
        
        
        // 找最大值索引
        int[] c = largestIndex(d);
        
        // 列印 d
        System.out.println("");
        System.out.print("d = ");
        for(int[] element_row : d){
            System.out.print("\r\n\t");
            for(int element_col : element_row)
                System.out.print(element_col + " ");
        };
        
        // 列印索引
        System.out.println("\r\n最大值元素的最大索引 : 第 " + c[0] + " 列, 第 " + c[1] + " 欄" );
        
     }
     
     public static int[] largestIndex(int[][] arr){
         
        // 建立新陣列
        int [] aryLargest = {0, 0};
         
        // 開始尋找
        int iMax = -1;

        for(int iRow=0; iRow<arr.length; iRow++){
            for(int iCol=0; iCol<arr[iRow].length; iCol++){
                if(arr[iRow][iCol]>=iMax){
                    iMax = arr[iRow][iCol];
                    aryLargest[0] = iRow;
                    aryLargest[1] = iCol;
                }
            }
        }
        
        return aryLargest;
     }
}