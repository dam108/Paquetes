package pClasesApoyo;

public class Dado_v3 {
    
    Dado_v3(){}
    
    
    public static int lanzar(){
        int result = (int) (Math.random()* 6) + 1;
        return result;
    }
}