/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Miquel
 */
public class Circulo extends Figura{
    private int radi;

    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }
    
    @Override
    public double area() {
        return Math.PI*radi*radi;
    }

    @Override
    public double perimetre() {
        return 2*Math.PI*radi;
    }
    
    
}
