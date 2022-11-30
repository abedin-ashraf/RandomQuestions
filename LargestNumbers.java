import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(23343.434);
        list.add(new BigInteger("34787533253423532523"));
        list.add(new BigDecimal("3.98028694386948692898"));

        System.out.println("The largest number is "+getLargestNumber(list));

    }

    public static Number getLargestNumber(ArrayList<Number> list){
        if(list == null || list.size()==0)
            return null;

        Number number = list.get(0);
        for(int i=1; i<list.size(); i++){
            if(number.doubleValue() < list.get(i).doubleValue())
                number = list.get(i);
        }
        return number;
    }
}
