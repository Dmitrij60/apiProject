package org.example;

import java.util.Objects;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public  ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        ComplexNumber targetObj = (ComplexNumber) obj;
        return Double.compare(targetObj.re, re) == 0 && Double.compare(targetObj.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
/*@Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass() || obj.hashCode() != this.hashCode()){
            return false;
        }
        ComplexNumber number = (ComplexNumber) obj;
        if (this.hashCode() == obj.hashCode() && this.getRe() == number.getRe() && this.getIm() == number.getIm()) {
            return true;
        }else{return false;}
    }

    @Override
    public int hashCode() {
        final int antiCollision = 31;
        Double result = 1.0;
        int result2;
        result = antiCollision * result + re;
        result = antiCollision * result + im;
        System.out.println(result.getClass());
        result2 = result.intValue();

        return result2;
    }*/
}
