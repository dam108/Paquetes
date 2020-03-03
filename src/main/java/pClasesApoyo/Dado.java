package pClasesApoyo;

public class Dado {
    
    Dado(){}
    
    
    public static int lanzar(){
        int result = (int) (Math.random()* 6) + 1;
        return result;
    }
}