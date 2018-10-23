/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projppo;

import java.util.Comparator;

/**
 *
 * @author miquel
 */
public class Professor extends Persona {

    private String titulacio;

    public Professor(String titulacio, String Nom) {
        super(Nom);
        this.titulacio = titulacio;
    }

    public String getTitulacio() {
        return titulacio;
    }

    public void setTitulacio(String titulacio) {
        this.titulacio = titulacio;
    }

    public static Comparator<Professor> COMPARE_BY_NAME = (Professor one, Professor other) -> one.Nom.compareTo(other.Nom);


    @Override
    public String toString() {
        return "Professor{" + "titulacio=" + titulacio + ", nom: " + getNom() + '}';
    }

}
