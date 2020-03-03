package pClasesApoyo.pMates;

import java.util.ArrayList;

public class CalculadoraPro_v3 extends Calculadora_v3 {
    
    public CalculadoraPro_v3(ArrayList arr){
        super(arr);
    }
    
    public String sumarHEX(){
        int res = super.sumar();
        String Hex = Integer.toHexString(res);
        return Hex;
    }
    
    @Override
    public int menor(){
        int res = super.menor();
        if (res < 0) return 0;
        else return res;
    }

}
