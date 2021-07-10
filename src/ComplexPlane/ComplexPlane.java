/*  Set of complex numbers C.
    Complex numbers re + im*i, -2.5 < re < 2.5 and -2.5 < im < 2.5 
    Module |z| = (re^2 + im^2)^{1/2} 

    plane define in polar coordinates, maybe translated to cartesian after */

package ComplexPlane;
    
public class ComplexPlane {
    /* plane defined by two points */
    float real1;
    float imaginary1;

    float real2;
    float imaginary2;
    
    /* bound radius 2, not cartisians */
    ComplexPlane() {
        real1 = -2.1;
        imaginary1 = 2.1;

        real2 = 2.1;
        imaginary2 = -2.1;
    }
    
    ComplexPlane(float x1, float y1, float x2, float y2) {
        real1 = -2.1;
        imaginary1 = 2.1;

        real2 = 2.1;
        imaginary2 = -2.1;
    }

}
