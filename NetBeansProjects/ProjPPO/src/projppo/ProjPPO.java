/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projppo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author miquel
 */
public class ProjPPO {

    /**
     * 1000 profes 100000 alumnes 100 assign (amb 1 profe i 15/20 alumnes)
     */
    public void creadorRndm() {

        Random rn = new Random();
        Alumne al;
        Professor pr;
        Assignatura as;
        Alumne[] alumnes = new Alumne[100000];
        Alumne[] alAssig;
        Professor[] professors = new Professor[1000];
        Assignatura[] assignatures = new Assignatura[100];
        ArrayList<Integer> auxAlu = new ArrayList<>();
        ArrayList<Integer> auxPro = new ArrayList<>();
        int[] aux = new int[25000];
        ArrayList<Integer> aux1 = new ArrayList<>();
        String[] noms = {"Aarón", "Aharón", "Abel", "Abelardo", "Abigail", "Abraham", "Absalón", "Adalberto", "Adán", "Adelardo", "Alf", "Adolfo",
            "Adonis", "Adrián", "Adriano", "Agamenón", "Agapito", "Agar", "Agustín", "Aitor", "Alan", "Anastasia"};

        for (int i = 0; i < alumnes.length; i++) {
            al = new Alumne(rn.nextInt(50) + 1980, rn.nextBoolean(), noms[rn.nextInt(22)]);
            alumnes[i] = al;
        }
        for (int i = 0; i < professors.length; i++) {
            pr = new Professor("titulacio" + i, noms[rn.nextInt(22)]);
            professors[i] = pr;

        }
        int p;
        boolean x;
        for (int i = 0; i < 100; i++) {
            alAssig = new Alumne[20];
            x = true;
            int cont;
            for (int j = 0; j < rn.nextInt(5) + 15; j++) {
                cont = rn.nextInt(100000);
                while (auxAlu.contains(cont)) {
                    cont = rn.nextInt(100000);
                }
                auxAlu.add(cont);
                alAssig[j] = alumnes[cont];
            }
            cont = rn.nextInt(1000);
            while (auxPro.contains(cont)) {                
                cont = rn.nextInt(1000);
            }
            auxPro.add(cont);
            System.out.println(cont);
            as=new Assignatura(rn.nextInt(20)+2000, "assig"+i, professors[cont], alAssig);
            assignatures[i]=as;
        }
        for (Assignatura assignature : assignatures) {
            System.out.println(assignature.toString());
            
        }

    }

    public static void main(String[] args) {
        ProjPPO p = new ProjPPO();
        p.creadorRndm();
    }

}
