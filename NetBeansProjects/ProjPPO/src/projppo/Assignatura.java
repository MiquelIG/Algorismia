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
public class Assignatura implements Comparable<Assignatura>{
    private int any;
    private String nom;
    private Professor p;
    private Alumne[] a;

    public Assignatura(int any, String nom, Professor p, Alumne[] a) {
        this.any = any;
        this.nom = nom;
        this.p = p;
        this.a = new Alumne[20];
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Professor getP() {
        return p;
    }

    public void setP(Professor p) {
        this.p = p;
    }

    public Alumne[] getA() {
        return a;
    }

    public void setA(Alumne[] a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Assignatura{" + "any=" + any + ", nom=" + nom + ", p=" + p + ", a=" + a + '}';
    }

    @Override
    public int compareTo(Assignatura o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
