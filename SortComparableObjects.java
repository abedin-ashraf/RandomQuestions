import java.math.BigInteger;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah","Boston", "Atlanta", "Tampa"};
        java.util.Arrays.sort(cities);

        for(String city : cities)
            System.out.print(city+" ");
        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("232323232323232323232"), new BigInteger("6767676767676767676"), new BigInteger("909090909090909090")};
        java.util.Arrays.sort(hugeNumbers);

        for(BigInteger number: hugeNumbers)
            System.out.print(number+" ");

    }
}
