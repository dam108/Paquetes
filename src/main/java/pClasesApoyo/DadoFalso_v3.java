package pClasesApoyo;

class DadoFalso_v3 {
    DadoFalso_v3(){}
    
    int lanzar(int n){
        int result = (int) (Math.random()*9)+1;
        if (result > 0 && result < 7) return result;
        else if(result > 6 && result < 9) return n;
        else return (int) (Math.random()*6)+1;      
        
    }
}