/*  Set of complex numbers C.
    Complex numbers re + im*i, -2.5 < re < 2.5 and -2.5 < im < 2.5 
    Module |z| = (re^2 + im^2)^{1/2} 

    plane define in polar coordinates, maybe translated to cartesian after */

package Mandelbrot.ComplexPlane;

import Mandelbrot.ComplexNumber.ComplexNumber;
    
public class ComplexPlane {
    /* plane defined by two points */
    ComplexNumber A;
    ComplexNumber B;

    /* bound radius 2, not cartisians */
    ComplexPlane() {
        A = ComplexNumber(-2.1, 2.1);
        B = ComplexNumber(2.1, -2.1);
    }
    
    ComplexPlane(ComplexNumber a, ComplexNumber b) {
        A = a;
        B = b;
    }
}
