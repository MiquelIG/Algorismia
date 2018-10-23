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
public class Alumne extends Persona{
    
    private int any;
    private Boolean beca;

    public Alumne(int any, Boolean beca, String Nom) {
        super(Nom);
        this.any = any;
        this.beca = beca;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public Boolean getBeca() {
        return beca;
    }

    public void setBeca(Boolean beca) {
        this.beca = beca;
    }

    @Override
    public String toString() {
        return "Alumne{" + "any=" + any + ", beca=" + beca + '}';
    }
    
    
    
}
