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
    Random gustar = new Random();       
    //max y min de estadisticas
    public int maxStat = 100;
    public int minStat = 0;
    //Constructores
    public Tamagotchi(){}

    public Tamagotchi(int energia, int salud, int animo){
        setEnergia(energia);
        setSalud(salud);
        setAnimo(animo);
    }

    //getters and setters

    public int getEnergia(){
        return energia;
    }
    
    public void setEnergia(int energia){
        this.energia = energia;
    }

    public int getSalud(){
        return salud;
    }

    public void setSalud(int salud){
        this.salud = salud;
    }

    public int getAnimo(){
        return animo;
    }

    public void setAnimo(int animo){
        this.animo = animo;
    }

    //metodos
    
    //metodos a usar
    public void comer(){
        if ((salud+30)<maxStat) {
                salud += 30;
        } else{
                salud = maxStat;    
        }
        if ((animo+30)<maxStat) {
                animo += 30;
        } else{
                animo = maxStat;    
        }
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
            if ((animo+5)<maxStat) {
                animo += 5;
            } else{
                animo = maxStat;   
            }
            if ((energia-5)>minStat) {
                energia -= 5;
            } else{
                energia = minStat;   
            }
            
        } else {
            System.out.println("No quiero jugar");
        }
    }
    
    public void mimar(){    
        if ((animo+10)<maxStat) {
                animo += 10;
        } else{
                animo = maxStat;    
        }
    }
    
    public void dormir(){
        if ((animo+20)<maxStat) {
                animo += 20;
        } else{
                animo = maxStat;    
        }
        if ((energia+20)<maxStat) {
                energia += 20;
        } else{
                energia = maxStat;    
        }
    }
}
