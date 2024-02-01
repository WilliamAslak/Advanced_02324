package week1;

public interface iComplex{
    String toString();
    double abs();
    double phase();
    Complex plus(Complex b);
    Complex minus(Complex b);
    Complex times(Complex b);
    Complex scale(double alpha);
    Complex conjugate();
    Complex reciprocal();
    double re();
    double im();
    Complex divides(Complex b);
    Complex exp();
    Complex sin();
    Complex tan();
    Complex cos();
    boolean equals(Object x);
}
