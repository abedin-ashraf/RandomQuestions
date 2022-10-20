public class LinearSearch {
    public static int linearSearch(int[] list, int key){
        for(int i=0; i<list.length; i++){
            if(key==list[i])
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] List = {1,4,4,2,5,-3,6,2};
        int i = linearSearch(List, -4);
        if(i!=-1)
            System.out.println("We have the key in the array");
        else
            System.out.println("We don't have the key in the array");
    }
}
