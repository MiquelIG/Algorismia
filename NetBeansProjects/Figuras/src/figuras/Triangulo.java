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
public class Triangulo extends Figura{
    private int base, altura;

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
            
    
    @Override
    public double area() {
        return (base*altura)/2;
    }

    @Override
    public double perimetre() { //Los triangulos son todos equilateros
        return 3*base;
    }
    
}
