
/**
 * Write a description of class CalculatorTrigonometri here.
 *
 * @author Hayatun Syauli
 * @version 
 */
public abstract class CalculatorTrigonometri extends Kalkulator{
    
    protected double sudut;
    
    public abstract void konversi(double sudut);
    
    public double sin(){
        return Math.sin(this.sudut);
    }
    
    public double cos(){
        return Math.cos(this.sudut);
    }

    public double tan(){
        return Math.tan(this.sudut);
    }
    
    
}

