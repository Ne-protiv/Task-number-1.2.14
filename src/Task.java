import java.math.BigInteger;

public class Task {
    public static void main(String[] args) {
        long MaxLong = (long) -0x1p63;
        BigInteger maxLongSqr = maxLongSqr(BigInteger.valueOf(MaxLong));
        System.out.println(maxLongSqr);
    }

    public static BigInteger maxLongSqr(BigInteger MaxLong) {
        return MaxLong.multiply(MaxLong);
    }
}
