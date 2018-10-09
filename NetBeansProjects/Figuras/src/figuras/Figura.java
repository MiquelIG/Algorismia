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
public abstract class Figura implements Comparable<Figura>{
    private int posX;
    private int posY;
    
    public int getPosX() {
        return posX;
    }
    
    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public int compareTo(Figura o) {
        return (int) (this.area()-o.area());
    }

    public abstract double area();
    
    public abstract double perimetre();
    
}
