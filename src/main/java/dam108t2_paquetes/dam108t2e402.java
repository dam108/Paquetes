package dam108t2_paquetes;
import java.util.*;
import pClasesApoyo.pMates.*;
public class dam108t2e402 {
    static Scanner teclado;
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        
        numeros.add(15);
        numeros.add(10);
        numeros.add(1);
        numeros.add(17);
        numeros.add(22);
        numeros.add(63);
        numeros.add(4);
        numeros.add(89);
        numeros.add(12);
        numeros.add(32);
        numeros.add(2);
        numeros.add(97);
        
        Calculadora_v3 calc = new Calculadora_v3(numeros);
        // da error al instanciar la calculadora por que la subclase no tiene 
        // el constructor en publico, se lo ponemos publico y ya se consigue instanciar
        
        int llamadaMedia = calc.media();
        // cuando queremos llamar a los metodos de la clase Calculadora no se nos 
        // permite llamar mas que al metodo media por que es el unico que esta en publico.
        // si ponemos los demas metodos en publico ya podemos llamar a los demas.
        
        int llamadaMenor = calc.menor();
        int llamadaSumar = calc.sumar();
        
        
    }
}
