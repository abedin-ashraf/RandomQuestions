import java.util.Arrays;

public class ArrayDefaultBinarySearch {
    public static void main(String[] args){
        int[] list = {2,4,5,10,11,45,50,59,60,66,69,70,79};
        System.out.println("Index is "+ Arrays.binarySearch(list,11));
    }
}
