import java.lang.Math;

/**
 * Write a description of class CalculatorTriDegree here.
 *
 * @author Hayatun Syauli
 * @version (a version number or a date)
 */
public class CalculatorTriDegree extends CalculatorTrigonometri{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class CalculatorTriDegree
     */
    public CalculatorTriDegree()
    {
       
    }

    /**
     * Konversi
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void konversi(double sudut){
        super.sudut = Math.toRadians(sudut);
    }
}
