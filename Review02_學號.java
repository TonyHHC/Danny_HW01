/* Review02_學號.java */

import java.util.Arrays;

public class HelloWorld{

     public static void main(String []args){
         
        System.out.println("** Review02_學號.java **");
        
        int[] list1 = {1, 5, 16, 61, 111};
        int[] list2 = {6, 5, 4, 2};
        
        // 列印 list1
        System.out.println("");
        System.out.print("list 1 : ");
        for(int element : list1)
            System.out.print(element + " ");
            
        // 列印 list2
        System.out.println("");
        System.out.print("list 2 : ");
        for(int element : list2)
            System.out.print(element + " ");
        
        // 列印 merge
        System.out.println("");
        System.out.print("merge  : ");
        for(int element : merge(list1, list2)) {
            System.out.print(element + " ");
        }
        
     }
     
     public static int[] merge(int[] list1, int[] list2){
         
         // 取得新陣列長度
         int iNewArrayLength = list1.length + list2.length;
         // 建立新陣列
         int [] aryNewArray = new int[iNewArrayLength];
         
         int iPos = 0;
         
         // 複製第一個陣列 list1
         for(int element : list1) {
             aryNewArray[iPos++] = element;
         }
         
         // 複製第一個陣列 list2
         for(int element : list2) {
             aryNewArray[iPos++] = element;
         }
         
         // 排序
         Arrays.sort(aryNewArray);
         
         return aryNewArray;
     }
}