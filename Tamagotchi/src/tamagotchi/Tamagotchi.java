/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagotchi;

import java.util.Random;

/**
 *
 * @author Moni
 */
public class Tamagotchi {
    
    //Atributos
    //estadisticas
    private int energia;
    private int salud;
    private int animo;
    //información
    public String nombre;
    Random gustar = new Random();       //definiendo el obj gustar en random cada vez que se inicia el objt
                                        //no lo hago para cada vez que se usa el metodo por complejidad innecesaria
    //max y min de estadisticas
    public int maxStat = 100;
    public int minStat = 0;
    //Constructores
    public Tamagotchi(){}

    public Tamagotchi(int energia, int salud, int animo, String nombre){
        this.energia = energia;
        this.salud = salud;
        this.animo = animo;
        this.nombre = nombre;
    }

    //getters and setters

    public int getEnergia(){
        return energia;
    }
    
    public void setEnergia(int energia){
        //regla de negocio
        if (energia >=0 && energia <=100){
            this.energia = energia;
        }
        else {
            System.out.println("Ya tengo la energía al max");
        }
    }

    public int getSalud(){
        return salud;
    }

    public void setSalud(int salud){
        //regla de negocio
        if (salud >=0 && salud <=100){
            this.salud = salud;
        }
        else {
            System.out.println( "Ya tengo la salud al max");
        }
    }

    public int getAnimo(){
        return animo;
    }

    public void setAnimo(int animo){
        //regla de negocio
        if (animo >=0 && animo <=100){
            this.animo = animo;
        }
        else {
            System.out.println("Ya tengo el animo al max");
        }
    }

    //metodos
    //metodo comun para establer el uso de max y min stats
    
    public void modifica(int var, int cantidad){
        if (var+ cantidad<= maxStat) {
                var += cantidad;
        }else{
                var = maxStat;    
        }
        
    }
    
    //metodos a usar
    public void comer(){
        modifica(salud,30);
        
    }
    
    public void bañar(){    
        if(gustar.nextBoolean()){           //si (gustar = true)
            if ((salud+10)<maxStat) {
                salud += 10;
            } else{
                salud = maxStat;    
            }
            
        }
        else{
            if ((salud+10)<maxStat) {
                salud += 10;
            } else{
                salud = maxStat;
                animo -= 10;    
            }
        }

        
    }
    
    public void jugar(){
        if (salud >= 40 ) {
            animo += 5;
            energia -= 5;
            
        } else {
            System.out.println("No quiero jugar");
        }
    }
    
    public void apapacho(){    
        animo += 10;
    }
    
    public void mimir(){
        animo += 30;
        energia += 30;
    }
}
