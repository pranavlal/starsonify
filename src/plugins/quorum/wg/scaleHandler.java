/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugins.quorum.wg;

/**
 *
 * @author user
 */
public class scaleHandler {
public java.lang.Object me_ = null;    
    public double GetScale(double d1, double d2, double r1, double r2, double nsl )
{
Rescale r;
        r = new Rescale(d1,d2,r1,r2);
        return r.rescale(nsl);
}
public static void main(String[] args) { 

}

}
