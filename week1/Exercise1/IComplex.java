package week1.Exercise1;

public interface IComplex {
    double re();
    double im();
    double abs();
    Complex plus(Complex b);
    Complex minus(Complex b);
    Complex times(Complex b);
    Complex divides(Complex b);
    Complex scale(double alpha);
    Complex reciprocal();
    Complex conjugate();
    Complex exp();
    Complex sin();
    Complex cos();
    Complex tan();
    boolean equals(Object x);
    int hashCode();
}
