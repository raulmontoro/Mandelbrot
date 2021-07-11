package Mandelbrot.Convergence;

import Mandelbrot.ComplexNumber.ComplexNumber;

/* 
    ẓ_{n+1} = z_{n}^2 + c, z_{0} = c
    |Z_{n}| <= 2, all n,
    converges

    f(z) = z^{2} + c, all c ∈ M
    f_{c}(0), f_{c}(f_{c}(0)), f_{c}(f_{c}(f_{c}(0)))
    bounded in absolute value 

recursive function implementation,
base case  number of invariant significant figures */

public class Convergence {
    bool func(ComplexNumber z, ComplexNumber c) {
        float aux = absoluteValue(z);
        boolean converg;
        
        /* Base Case */
        if (aux > 2) {
            converg = false;
        }
        else {
            z.multiplication(z);
            z.addition(c);
            bool coverg_aux = func(z, c);
        }
    }

    return converg;
}
