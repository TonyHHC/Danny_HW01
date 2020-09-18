/* Review01_學號.java */

import java.util.Arrays;
import java.util.Scanner;

public class HW1{

     public static void main(String []args){
         
        System.out.println("** Review01_學號.java **");
        
        /*
        int[]d = {4, 0, 8, 8, 3, 0, 1, 0, 1}
        };*/

        // 輸入學號        
        System.out.print("請輸入學號 : ");
        Scanner scanner = new Scanner(System. in);
        String strInput = scanner.nextLine();
        System.out.println(strInput);

        // 檢查參數
        String strSchoolID = strInput;
        if(strSchoolID.length() != 9){
            System.out.println("Error!! 學號長度必須為 9 位數");
            return;
        }

        // 將學號轉為 1X9 陣列
        int[]d = new int[9];
        for(int i=0 ; i<strSchoolID.length(); i++){
            char ch = strSchoolID.charAt(i);
            if(Character.isDigit(ch)){
                d[i] = Character.getNumericValue(ch);
            }
            else{
                System.out.println("Error!! 學號必須全部是數字");
                return;
            }
        }

        // 找最大值索引
        int[] r = largestList(d);
        
        // 列印 d
        System.out.println("");
        System.out.print("d = ");
        for(int element : d){
            System.out.print(element);
        };
        
        // 列印索引
        System.out.println("\r\n最大值個數 : " + r.length + ", 最大索引 : " + r[r.length-1] );
        
     }
     
     public static int[] largestList(int[] arr){
         
        // 開始尋找
        int iMax = -1;
        int iMaxCount = 0;

        for(int i=0; i<arr.length; i++){    
            if(arr[i]==iMax)
                iMaxCount++;
            
            if(arr[i]>iMax){
                iMaxCount = 1;
                iMax = arr[i];
            }
        }
        
        // 建立新陣列
        int [] r = new int[iMaxCount];
        
        // 設定值
        int rIndex = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == iMax)
                r[rIndex++] = i;
        }

        return r;
     }
}