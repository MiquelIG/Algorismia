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
public class FP extends Assignatura {

    private TipusFP tfp;

    public FP(TipusFP tfp, int any, String nom, Professor p, Alumne[] a) {
        super(any, nom, p, a);
        this.tfp = tfp;
    }

    public TipusFP getTfp() {
        return tfp;
    }

    public void setTfp(TipusFP tfp) {
        this.tfp = tfp;
    }

}
