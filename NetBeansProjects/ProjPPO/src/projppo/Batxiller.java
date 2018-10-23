/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projppo;

/**
 *
 * @author miquel
 */
public class Batxiller extends Assignatura{
    private TipusBatx tb;

    public Batxiller(TipusBatx tb, int any, String nom, Professor p, Alumne[] a) {
        super(any, nom, p, a);
        this.tb = tb;
    }

    public TipusBatx getTb() {
        return tb;
    }

    public void setTb(TipusBatx tb) {
        this.tb = tb;
    }
    
    
}
