import java.util.*;
import java.util.Map;

/*
 Given an array which may contain duplicates, print all elements and their frequencies.

Examples: 

Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
Output : 10 3
         20 4
         5  1

Input : arr[] = {10, 20, 20}
Output : 10 1
         20 2 
 */

public class Q12 {
    //function to count frequencies of array items
    static void countFreq(int arr[], int n)
    {
      HashMap<Integer,Integer> freq = new HashMap<>();
   
      // Traverse through array elements and
      // count frequencies
      for (int i = 0; i < n; i++) {
        if(freq.containsKey(arr[i])){
          freq.put(arr[i], freq.get(arr[i])+1);
        }
        else{
          freq.put(arr[i], 1);
        }
      }
   
      // Traverse through map and print frequencies
      for (Map.Entry<Integer,Integer> x : freq.entrySet())
        System.out.print(x.getKey()+ " " +  x.getValue() +"\n");
    }
    public static void main(String[] args) {
        int arr[] = {10,20,20,10,10,20,5,20};
        int n = arr.length;

        countFreq(arr, n);
    }
}
