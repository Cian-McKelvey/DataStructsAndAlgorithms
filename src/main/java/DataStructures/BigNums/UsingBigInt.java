package DataStructures.BigNums;

import java.math.BigInteger;

public class UsingBigInt {

    public static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i=1; i<=n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return  result;
    }

    public static void main(String[] args) {
        int x = 50;
        BigInteger bigInt = calculateFactorial(x);
        System.out.println(bigInt);
    }
}
