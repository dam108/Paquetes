package pClasesApoyo;

class DadoFalso {
    DadoFalso(){}
    
    int lanzar(int n){
        //preguntar si esto es simular el doble de posibilidades de que salga n
        int result = (int) (Math.random()* 6) + 1;
        if(result !=n ) result = (int) (Math.random()* 6) + 1;
        return result;
        
        /*
        * int result = (int) (Math.random()*9)+1;
        * if (result > 0 && result < 7) return result;
        * else if(result > 6 && result < 9) return n;
        * else return (int) (Math.random()*6)+1;
        *
        *
        */
    }
}