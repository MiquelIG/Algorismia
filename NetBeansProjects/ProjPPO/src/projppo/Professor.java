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

}
