import java.lang.Math;
/**
 * class Main 
 *
 * @author Hayatun syauli
 * @version 0.2
 */
public class Main
{
    public static void main(String args[])
    {
       /*System.out.println(Kalkulator.info);
       
       Kalkulator calculator1 = new Kalkulator();
       Kalkulator calculator2 = new Kalkulator(3,5);
       Kalkulator calculator3 = new Kalkulator(3);
       Kalkulator calculator4 = new Kalkulator();

       System.out.println("");
       System.out.println("Nilai setelah op1 dan op2 diganti");
       
       calculator1.setOp1(10);
       calculator2.setOp1(50);
       calculator3.setOp1(60);
       System.out.println("Nilai op1 Constructor tanpa parameter: "+calculator1.getOp1());
       System.out.println("Nilai op1 Constructor dengan 2 parameter: "+calculator2.getOp1());
       System.out.println("Nilai op1 Constructor dengan 3 parameter: "+calculator3.getOp1());
       
       System.out.println("");
       calculator1.op2 = 5;
       calculator2.op2 = 20;
       calculator3.op2 = 30;
       System.out.println("Nilai op2 Constructor tanpa parameter: "+calculator1.op2);
       System.out.println("Nilai op2 Constructor dengan 2 parameter: "+calculator2.op2);
       System.out.println("Nilai op2 Constructor dengan 3 parameter: "+calculator3.op2);

       System.out.println("");
       System.out.println(Kalkulator.jumlahobject);
       
       System.out.println("");
       double hasil1 = calculator1.jumlah();
       double hasil2 = calculator1.jumlah(3.4, 5.4);
       System.out.println("Hasil penjumlahan method jumlah tanpa parameter: "+ hasil1);
       System.out.println("Hasil penjumlahan method jumlah dengan parameter: "+ hasil2);

       System.out.println("");
       double hasil3 = calculator1.kurang();
       double hasil4 = calculator1.kurang(10, 5);
       System.out.println("Hasil perkurangan method kurang tanpa parameter: "+ hasil3);
       System.out.println("Hasil perkurangan method kurang dengan parameter: "+ hasil4);
    
       System.out.println("");
       double hasil5 = calculator1.kali();
       double hasil6 = calculator1.kali(3, 5);
       System.out.println("Hasil perkalian method kali tanpa parameter: "+ hasil5);
       System.out.println("Hasil perkalian method kali dengan parameter: "+ hasil6);

       System.out.println("");
       double hasil7 = calculator1.bagi();
       double hasil8 = calculator1.bagi(10, 2);
       System.out.println("Hasil Pembagian method bagi tanpa parameter: "+ hasil7);
       System.out.println("Hasil Pembagian method bagi dengan parameter: "+ hasil8);
       *
       CalculatorProgrammer clp = new CalculatorProgrammer();
       System.out.println(clp.jumlah(4,5));
       System.out.println(clp.konversiBilangantoHex(4));
    
   
      
       CalculatorScientific cs = new CalculatorScientific();
       System.out.println("Penjumlahan dari 4 + 5 = "+ cs.jumlah(4,5));
       System.out.println("Faktorial dari 5! adalah "+ cs.menghitungFaktorial(5));
       System.out.println("Luas Bujur Sangkar dengan sisi 5 sisi adalah "+ cs.bujurSangkar(5));
       System.out.println("luas lingkarannya adalah "+ cs.luasLingkaran(3.14, 10));
       //System.out.println(CalculatorScientific.jumlahobject);
       
       CalculatorScientific cs2 = new CalculatorScientific(2,3);
       System.out.println("");
       System.out.println("Percobaan Calcul Scientific dengan parameter dari Kalkulator");
       System.out.println(cs2.op1);
       System.out.println(cs2.op2);
       
       CalculatorProgrammer cp = new CalculatorProgrammer();
       System.out.println("\n Kalkulator Programmer");
       System.out.println("Konversi 7070 ke Hexadesimal adalah = "+ cp.konversiBilanganDesimaltoHex(7070));
       System.out.println("Konversi 7070 ke Binner adalah = "+ cp.konversiBilanganDesimaltoBinner(7070));  
       
      
       CalculatorTrigonometri clr = new CalculatorTriRadian();
       CalculatorTrigonometri cld = new CalculatorTriDegree();
       

       clr.op1 = 3;
       clr.op2 = 80;
       System.out.println(clr.jumlah());
       
       cld.op1 = 3;
       cld.op2 = 5;
       System.out.println(cld.jumlah());
       
       double sudutindegree = 30;
       double sudutinrad = Math.PI / 6;
       cld.konversi(sudutindegree);
       cld.konversi(sudutinrad);
       
       System.out.println("--------SIN--------");
       System.out.println(cld.sin());
       System.out.println(clr.sin());
       
       System.out.println("--------COS--------");
       System.out.println(cld.cos());
       System.out.println(clr.cos());
       
       System.out.println("--------TAN--------");
       System.out.println(cld.tan());
       System.out.println(clr.tan());
       
       CalculatorScientific cs = new CalculatorScientific();
       System.out.println(cs.menghitungFaktorial(4));
       */
      
      Kalkulator cl = new Kalkulator();
      //SimpanOperasiCalculator  spr = new SimpanOperasiKeMemoryReverse();
      SimpanOperasiCalculator  spr = new SimpanOperasiKeMemoryForward();
      
      cl.setSimpanOperasi(spr);
      
      cl.op1 = 1;
      cl.op2 = 1;
      System.out.println("");
      System.out.println("1 + 1 = "+ cl.jumlah());
      //System.out.println("1 x 1 = "+ cl.kali());
      //System.out.println("1 - 1 = "+ cl.kurang());
      //System.out.println("1 / 1 = "+ cl.bagi());
      
      cl.op1 = 2;
      cl.op2 = 2;
      System.out.println("");
      System.out.println("2 + 2 = "+ cl.jumlah());
      //System.out.println("2 x 2 = "+ cl.kali());
      //System.out.println("2 - 2 = "+ cl.kurang());
      //System.out.println("2 / 2 = "+ cl.bagi());
      
      cl.op1 = 3;
      cl.op2 = 3;
      System.out.println("");
      System.out.println("3 + 3 = "+ cl.jumlah());
      //System.out.println("3 x 3 = "+ cl.kali());
      //System.out.println("3 - 3 = "+ cl.kurang());
      //System.out.println("3 / 3 = "+ cl.bagi());
      
      System.out.println("Data dari memori: ");
      
      System.out.println(cl.bacaOperasi());
       
       
    
    }
}