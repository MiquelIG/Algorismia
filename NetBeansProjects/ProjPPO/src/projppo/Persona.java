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
public class Persona implements Comparable<Persona> {

    String Nom;

    public Persona(String Nom) {
        this.Nom = Nom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    
    

    @Override
    public int compareTo(Persona o) {
        return 0;
    }
    

}
