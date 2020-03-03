package pClasesApoyo;
import java.util.*;
import pClasesApoyo.*;
public class dam108t2e404 {
    static Scanner teclado;
    public static void main(String[] args) {
        // la clase Dado no es publica entonces no se puede acceder desde fuera del paquete
        // la hacemos publica para acceder a ella o bien cambiamos de paqute el ejercicio
        
        Dado_v3 dado = new Dado_v3();
        
        DadoFalso_v3 dadoFalso = new DadoFalso_v3();
        
        int contarN = 0;
        int contar1 = 0 ;
        int result;
        for (int i = 0; i < 100; i++) {
            result = dadoFalso.lanzar(3);
            if (result == 1 )contar1++;
            else if(result == 3)contarN++;
            System.out.println(result);
        }
        
        System.out.println("numero de veces que salio el 1 en 100 tiradas: "+contar1);
        System.out.println("numero de veces que salio el 3 en 100 tiradas: "+contarN);
    
    }
}
