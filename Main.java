
/**
 * Write a description of class Main here.
 *
 * @author (Hayatun syauli )
 * @version (a version number or a date)
 */
public class Main{
    
    public static void main(String args[]){
        // menciptakan objek baru dari class Calculator
        Calculator kalkul = new Calculator();
        
        // memasukkan bilangan pada operator 1 & 2
        kalkul.op1 = 5;
        kalkul.op2 = 4;
        
        //memanggil method operator
        kalkul.tambah();
        kalkul.perkalian();
        
        //memanggil atribut hasil
        System.out.println("perjumlahan dari 5 + 4 = "+ kalkul.tambah());
        System.out.println("perjumlahan dari 5 * 4 = "+ kalkul.perkalian());    
        
    }

}
