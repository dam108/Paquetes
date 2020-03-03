package pClasesApoyo.pMates;

import java.util.ArrayList;

class CalculadoraPro extends Calculadora {
    
    CalculadoraPro(){

    }
    
    /*
    public String sumarHEX(){
        // no se puede hacer super.sumar por que el metodo sumar de la clase
        // padre es privado
        // no hay Override por que el metodo sumar de la clase padre es privado 
        // y aparte diferente
        int res = super.sumar();
        String Hex = Integer.toHexString(res);
        return Hex;
    }
    */
    
    @Override
    public int menor(){
        // si se puede hacer Override por que el metodo menor de la clase padre
        // esta protected y deja el acceso a desde los subpaquetes
        int res = super.menor();
        if (res < 0) return 0;
        else return res;
    }

}
