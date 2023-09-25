package org.iesvdm;

import java.math.BigDecimal;

public class InteresCompuesto {

    private BigDecimal p;
    private BigDecimal r;
    private int n;
    private BigDecimal c;

    public InteresCompuesto(BigDecimal p, BigDecimal r, int n) {
        this.p = p;
        this.r = r;
        this.n = n;
    }

    public BigDecimal getP() {
        return p;
    }

    public void setP(BigDecimal p) {
        this.p = p;
    }

    public BigDecimal getR() {
        return r;
    }

    public void setR(BigDecimal r) {
        this.r = r;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public BigDecimal getC() {
        return c;
    }

    public void setC(BigDecimal c) {
        this.c = c;
    }

    public BigDecimal calculaMontoFinal() {
        this.c = BigDecimal.ONE.add(r).pow(n).multiply(p);
        return this.c;
    }



}
