
/**
 * Write a description of class SimpanOperasiKeMemoryForward here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpanOperasiKeMemoryForward implements SimpanOperasiCalculator{
    // instance variables - replace the example below with your own
    private String[] dataMemori = new String[10];
    private int pointer = 0;
    private String tampilMemori;

    /**
     * Constructor for objects of class SimpanOperasiKeMemoryForward
     */
    public SimpanOperasiKeMemoryForward()
    {
       
    }

    /**
     * simpanOperasi
     *
     * @param  String data
     * @return    data
     */
    public void simpanOperasi(String data){
        this.dataMemori[pointer] = data;
        this.pointer = this.pointer + 1;
        if (this.pointer > 9) this.pointer = 0;
    }
     /**
     * bacaOperasi
     *
     * @param  void
     * @return StringArray
     */
    public String bacaOperasi(){
        dataMemoriKeTampil();
        return this.tampilMemori;
       
    }
    
     /**
     * dataMemoriKeTampil
     *
     * @param  void
     * @return void
     */
    public void dataMemoriKeTampil(){
        this.tampilMemori = "";
        for(int i = this.pointer - 1; i >=0; i--){
            this.tampilMemori = this.tampilMemori + " " + this.dataMemori[i] + "\n" ;
        }
    
    
    }
}
