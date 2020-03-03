package pClasesApoyo.pMates;

import java.util.ArrayList;

public class Calculadora {
    public ArrayList<Integer> enteros;
    
    Calculadora(){
        
        enteros = new ArrayList();
        enteros.add(15);
        enteros.add(10);
        enteros.add(1);
        enteros.add(17);
        enteros.add(22);
        enteros.add(63);
        enteros.add(4);
        enteros.add(89);
        enteros.add(12);
        enteros.add(32);
        enteros.add(2);
        enteros.add(97);
        
    
    }
    
    
    private int sumar(){
        int res = 0;
        
        for( int x:  enteros){
            res += x;
        }
        
        return res;
    }
   
    protected int menor(){
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
