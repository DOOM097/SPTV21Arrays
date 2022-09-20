
package sptv21arrays;

import static java.lang.Double.sum;
import java.util.Random;

public class SPTV21Arrays {

    
    public static void main(String[] args) {
        System.out.println("-----Массив-----");
        int[] arr1 = new int[10];
        Random random = new Random();
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = random.nextInt(10);
        }
        
        
        
        int min = 10;
        int max = 0;
        int sum = 0;
        System.out.print("[");
        for (int i = 0; i<arr1.length;i++){
            if(arr1[i]<min){
                min = arr1[i];
            }
            if(arr1[i]>max){
                max = arr1[i];
            }
            System.out.printf("%2d",arr1[i]);
            sum += arr1[i];
        }
        System.out.print(" ]");
        System.out.println("");
        System.out.println("Сумма всех чисел в массиве = "+sum);
        System.out.println("Минимальное число в массиве = "+min);
        System.out.println("Максимальное число в массиве = "+max);
        
        System.out.println("------Двумерный массив[][]------");
        
        int min2 = 10;
        int max2 = 0;
        int sum2 = 0;
                
        
        int arr2[][] = new int[10][10];
        for(int i = 0;i<arr2.length ;i++){
            for(int j=0;j<arr2[i].length; j++){
                arr2[i][j]=random.nextInt(10);   
            }
        }
        for(int i = 0;i<arr2.length;i++){
            int lSum = 0;
            for(int j=0;j<arr2[i].length; j++){
                System.out.printf("%4d",arr2[i][j]);
                sum2 += arr2[i][j];
                lSum += arr2[i][j];
                if (min2 > arr2[i][j]) min2 = arr2[i][j];
                if (max2 < arr2[i][j]) max2 = arr2[i][j];
           }
            System.out.println(" |Сумма линии = "+lSum);
        }
        System.out.println("max ="+max2);
        System.out.println("min ="+min2);
        System.out.println("sum ="+sum2);
        
          
    }
    
}
















