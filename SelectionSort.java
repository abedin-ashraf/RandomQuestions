import java.util.Arrays;

public class SelectionSort {
    public static void ArraySelectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
          // Find the minimum in the list[i..list.length-1]
          double currentMin = list[i];
          int currentMinIndex = i;
          for (int j = i + 1; j < list.length; j++) {
            if (currentMin > list[j]) {
              currentMin = list[j];
              currentMinIndex = j;
            }
          }
          // Swap list[i] with list[currentMinIndex] if necessary;
          if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
          }
        }
      }

    public static void main(String[] args){
        double[] number = {6,0,4,4, 1,9,2,9,3,4,3,5};
        ArraySelectionSort(number);
        System.out.println(Arrays.toString(number));
    }
}
