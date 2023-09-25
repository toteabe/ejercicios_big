package org.iesvdm;

import java.math.BigInteger;

public class Factorial {

    private long n;
    private BigInteger factorial;

    public long getN() {
        return n;
    }

    public void setN(long n) {
        this.n = n;
    }

    public BigInteger getFactorial() {
        return factorial;
    }

    public void setFactorial(BigInteger factorial) {
        this.factorial = factorial;
    }

    public Factorial(long n) {
        if ( n >= 0)
            this.n = n;
        else
            throw new RuntimeException("Valor " + n + " no permitido.");
    }

    public BigInteger calcula() {

        this.factorial = BigInteger.ONE;
        for(long i = 1; i <= this.n; i++) {
            this.factorial = BigInteger.valueOf(i).multiply(this.factorial);
        }
        return this.factorial;
    }

}
