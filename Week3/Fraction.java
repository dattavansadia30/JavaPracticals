
public class Fraction {

    private int num;
    private int den;

    public Fraction(int n, int d) {

        if (d == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }

        int g = gcd(n, d);

        num = n / g;
        den = d / g;

        // Keep denominator positive
        if (den < 0) {
            num = -num;
            den = -den;
        }
    }

    // Method to find GCD
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Fraction))
            return false;

        Fraction f = (Fraction) obj;

        return num == f.num && den == f.den;
    }

    @Override
    public int hashCode() {
        return 31 * num + den;
    }
}