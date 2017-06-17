/*
Code taken from the stack overflow threat at
https://stackoverflow.com/questions/5294955/how-to-scale-down-a-range-of-numbers-with-a-known-min-and-max-value
*/

package plugins.quorum.wg;

/**
 *
 * @author user
 */
public class Rescale {//start of class

    private final double range0,range1,domain0,domain1;

    public Rescale(double domain0, double domain1, double range0, double range1) {
        this.range0 = range0;
        this.range1 = range1;
        this.domain0 = domain0;
        this.domain1 = domain1;
    }

    private double interpolate(double x) {
        return range0 * (1 - x) + range1 * x;
    }

    private double uninterpolate(double x) {
        double b = (domain1 - domain0) != 0 ? domain1 - domain0 : 1 / domain1;
        return (x - domain0) / b;
    }

    public double rescale(double x) {
        return interpolate(uninterpolate(x));
    }
    
}//end of class
