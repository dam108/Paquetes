package pClasesApoyo;

public class Dado_v4 {
    
    Dado_v4(){}
    
    
    public static int lanzar(){
        int result = (int) (Math.random()* 6) + 1;
        return result;
    }
}