/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Random;

/**
 *
 * @author Miquel
 */
public class Figuras {

    private static int totalFiguras = 100001;
    private static int valormax = 101;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura array [] = new Figura [totalFiguras];
        Random rand = new Random();
        Random valores = new Random();
        
        //llenar array de 10k figuras
        for(int i = 0; i < totalFiguras; i++){
            int figura = rand.nextInt(4);
            
            switch (figura){
                case 0: // Apartado Circulo
                    Circulo f = new Circulo();
                    f.setRadi(valores.nextInt(valormax));
                    array [i] = f;
                    break;
                case 1: // Apartado Triangulo
                    Triangulo a = new Triangulo();
                    a.setAltura(valores.nextInt(valormax));
                    a.setBase(a.getAltura());
                    array [i] = a;
                    break;
                case 2: // Apartado Rectangulo
                    Rectangulo b = new Rectangulo();
                    b.setAltura(valores.nextInt(valormax));
                    b.setBase(valores.nextInt(valormax));
                    array [i] = b;
                    break;
                case 3: // Apartado Romboide
                    Romboide c = new Romboide();
                    c.setAltura(valores.nextInt(valormax));
                    c.setBase(valores.nextInt(valormax));
                    array [i] = c;
            }
            
        }
        
        //Suma total de áreas y perímetros
        int areaTotal = 0, perimTotal = 0;
        for(int i = 0; i < totalFiguras; i++){
            areaTotal += array[i].area();
            perimTotal += array[i].perimetre();
        }
        System.out.println("El área total de todas las figuras es de: "+areaTotal+" y el perímetro total es: "+perimTotal);
        
        //Suma por separado de cada figura (áreas y perímetros)
        int areaTotCirc=0, perimTotCirc=0, areaTotTrian=0, perimTotTrian=0, areaTotRect=0, perimTotRect=0, areaTotRomb=0, perimTotRomb=0;
        double menorCirc=100, mayorCirc=0, menorTrian=10000, mayorTrian=0, menorRect=10000, mayorRect=0, menorRomb=10000, mayorRomb=0; 
        
        for(int i = 0; i < totalFiguras; i++){

            //System.out.println(array[i].getClass());
            switch(array[i].getClass().toString()){
                case "class figuras.Circulo":
                    areaTotCirc += array[i].area();
                    perimTotCirc += array[i].perimetre();
                    
                    if(menorCirc > array[i].area()){
                        menorCirc = array[i].area();
                    }
                    if(mayorCirc < array[i].area()){
                        mayorCirc = array[i].area();
                    }
                    break;
                case "class figuras.Triangulo":
                    areaTotTrian += array[i].area();
                    perimTotTrian += array[i].perimetre();
                    
                    if(menorTrian > array[i].area()){
                        menorTrian = array[i].area();
                    }
                    if(mayorTrian < array[i].area()){
                        mayorTrian = array[i].area();
                    }
                    break;
                case "class figuras.Rectangulo":
                    areaTotRect += array[i].area();
                    perimTotRect += array[i].perimetre();
                    
                    if(menorRect > array[i].area()){
                        menorRect = array[i].area();
                    }
                    if(mayorRect < array[i].area()){
                        mayorRect = array[i].area();
                    }
                    break; 
                case "class figuras.Romboide":
                    areaTotRomb += array[i].area();
                    perimTotRomb += array[i].perimetre(); 
                    
                    if(menorRomb > array[i].area()){
                        menorRomb = array[i].area();
                    }
                    if(mayorRomb < array[i].area()){
                        mayorRomb = array[i].area();
                    }
            }
        }
        System.out.println("El área total de todos los circulos es de: "+areaTotCirc+" y el perímetro total es de: "+perimTotCirc);
        System.out.println("El área total de todos los triangulos es de: "+areaTotTrian+" y el perímetro total es de: "+perimTotTrian);
        System.out.println("El área total de todos los rectangulos es de: "+areaTotRect+" y el perímetro total es de: "+perimTotRect);
        System.out.println("El área total de todos los romboides es de: "+areaTotRomb+" y el perímetro total es de: "+perimTotRomb);
        
        System.out.println("El área mas pequeña de un circulo es: "+menorCirc+" y la mas grande es: "+mayorCirc);
        System.out.println("El área mas pequeña de un triangulo es: "+menorTrian+" y la mas grande es: "+mayorTrian);
        System.out.println("El área mas pequeña de un rectangulo es: "+menorRect+" y la mas grande es: "+mayorRect);
        System.out.println("El área mas pequeña de un romboide es: "+menorRomb+" y la mas grande es: "+mayorRomb);
    }
    
}
