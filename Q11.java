/*
Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x. 

Examples: 

    Input: arr[] = {0, -1, 2, -3, 1}, x= -2
    Output: Yes
    Explanation:  If we calculate the sum of the output,1 + (-3) = -2

    Input: arr[] = {1, -2, 1, 0, 5}, x = 0
    Output: No
 */
public class Q11 {
    //Function to find a pair in the given array
    //whose sum is equal to z
    static boolean findPair(int a[], int n, int z){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                //check if the sum of the pai
                // (a[i],a[j]) is equal to z
                if(i!=j && a[i]+a[j]==z)
                    return true;
            
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //Given input
        int a[] = {1,-2,1,0,5};
        int z = -1;
        int n = a.length;

        //Function Call
        if(findPair(a, n, z))
            System.out.println("True");
        else
            System.out.println("False");


    }
}
