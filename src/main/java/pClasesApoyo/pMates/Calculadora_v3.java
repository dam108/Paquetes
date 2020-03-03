package pClasesApoyo.pMates;

import java.util.ArrayList;

public class Calculadora_v3 {
    public ArrayList<Integer> enteros;
    
    public Calculadora_v3(ArrayList arr){
        this.enteros = arr;
    
    }
    
    
    /*private*/public int sumar(){
        int res = 0;
        
        for( int x:  enteros){
            res += x;
        }
        
        return res;
    }
   
    /*protected*/public int menor(){
        int res = 100000000;
        for (int x: enteros) {
            if(x < res) res = x;
        }
             
        return res;
    }

    public int media(){
        int res;
        int cantidad = enteros.size();
        res = this.sumar() / cantidad;
               
        return res;
    }
}
