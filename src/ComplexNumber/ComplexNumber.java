/*  addition
    substraction, 
    multiplication, 
    division
    conjugate, 
    inverse, 
    absolute value -magnitude-, 

    polar representation,
    modulus
    Argument -Phase-,

    natural logarithm
    cosine
    power

    cartisian coordinates
    polar cordinates
    
    what is it?
    java.math.BigDecimal 

    check out sin, cos, tangent and arcotanget in library

    all arithmetic methods static */

package  Mandelbrot.ComplexNumber;

import java.lang.Math; /* sqrt, random */

public class ComplexNumber {
    /* Cartisian Coordinates */
    private float real;
    private float imaginary;

    /* Polar Coordinates */
    private float modulus;
    private float phase;
    
    /* Constructors */
   
    /* Constractor for Cartisian Coordinates */
    ComplexNumber(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    /* Constructor for Polar Coordinates */
    ComplexNumber(float real, float imaginary, string coordinates) {
        if (coordinates == "polar") {
            cartisianCoordinates(real, imaginary);
        }
        else {
            polarCoordiantes(real, imaginary);
        }
    }

    /* Modifiers */
    
    /* Addition */

    /*  Pre: two complex numbers
        Post: addition of two complex numbers */
    void addition(float real, float imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    
    void addition(ComplexNumber x) {
        real += x.real;
        imaginary += x.imaginary;
    }

    /*  Pre:    
        Post:   */
    void substraction(float real, float imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    
    void substraction(ComplexNumber x) {
        real -= x.real;
        imaginary -= x.imaginary;
    }
   
   /* Multiplication */

    /*  Pre: two complex numbers
        Post: multiplication of two complex numbers */
    void multiplication(float real, float imaginary) {
        this.real = (this.real * real) - (this.imaginary * imaginary);
        this.imaginary = (this.real * imaginary) + (this.imaginary * real);
    }
    
    void multiplication(ComplexNumber x) {
        real = (real * x.real) - (imaginary * x.imaginary);
        imaginary = (real * x.imaginary) + (imaginary * x.real);
    }

    /* Division */

    void divivision(ComplexNumber x) {
        real = ((real * x.real) + (imaginary * x.imaginary)) / ((x.real * x.real)
            + (x.imaginary * x.imaginary));
        imaginary = ((imaginary * x.real) - (real * x.imaginary)) / ((x.real * x.real)
            + (x.imaginary * x.imaginary));
    }
    
    /* Reciprocal (Inverse 1/z) */
    
    void reciprocal() {
        real = real / ((real * real) + (imaginary * imaginary));
        imaginary = -1*(imaginary / ((real * real) + (imaginary * imaginary)));
    }
    

    /* Absolute Value -modulus */

    ComplexNumber void absoluteValue(float x, float y) {
        /* sqrt() double arguments only in .lang.Math */
        return (float)sqrt((double)(x*x + y*y));
    }
    
    ComplexNumber void absoluteValue(ComplexNumber x) {
        /* sqrt() double arguments only in .lang.Math */
        return (float)sqrt((double)(x*x + y*y));
    }

    /* Cartisian Coordinates */
    void cartisianCoordinates(float modulus, float phase) {
        real = modulus*cos(phase);
        imaginary = modulus*sin(phase);
    }

    /* Polar Coordinates */
    private void polarCoordinates() {
        modulus = absoluteValude(real, imaginary);
        phase = 1/tangent(imaginary/real);
    }

    /* Output */
    public void print() {
        System.out.println(real + " + i" + imaginary);
    }
}
