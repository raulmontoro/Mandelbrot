/*  addition, substraction, multiplication, division
    conjugate, inverse, absolute value -magnitude-, Argument -Phase-,
    polar representation,

    natural logarithm
    cosine
    power
    
    what is it?
    java.math.BigDecimal */

package  ComplexNumbers;

public class ComplexNumber {

    private float real;
    private float imaginary;
    
    /* Constructors */

    public ComplexNumber(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /* Modifiers */
    
    /* Addition */

    /*  Pre: two complex numbers
        Post: addition of two complex numbers */
    void addition(float real, float imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    
    /*  Pre: two complex numbers
        Post: addition of two complex numbers */
    void addition(ComplexNumber x) {
        real += x.real;
        imaginary += x.imaginary;
    }
   
   /* Multiplication */

    /*  Pre: two complex numbers
        Post: multiplication of two complex numbers */
    void mult(float real, float imaginary) {
        this.real = (this.real * real) - (this.imaginary * imaginary);
        this.imaginary = (this.real * imaginary) + (this.imaginary * real);
    }
    
    /*  Pre: two complex numbers
        Post: multiplication of two complex numbers */
    void mult(ComplexNumber x) {
        real = (real * x.real) - (imaginary * x.imaginary);
        imaginary = (real * x.imaginary) + (imaginary * x.real);
    }

    /* Reciprocal (Inverse 1/z) */
    
    void reciprocal() {
        real = real / ((real * real) + (imaginary * imaginary));
        imaginary = -1*(imaginary / ((real * real) + (imaginary * imaginary)));
    }
    
    /* Division */

    void div(ComplexNumber x) {
        real = ((real * x.real) + (imaginary * x.imaginary)) / ((x.real * x.real)
            + (x.imaginary * x.imaginary));
        imaginary = ((imaginary * x.real) - (real * x.imaginary)) / ((x.real * x.real)
            + (x.imaginary * x.imaginary));
    }

    /* Output */
    public void print() {
        System.out.println(real + " + i" + imaginary);
    }
}
