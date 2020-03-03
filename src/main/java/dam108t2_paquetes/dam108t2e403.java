package dam108t2_paquetes;
import java.util.*;
import pClasesApoyo.pMates.*;
public class dam108t2e403 {
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
        
        CalculadoraPro_v3 calc = new CalculadoraPro_v3(numeros);
        // da error al instanciar la calculadora por que la subclase no tiene 
        // el constructor en publico,y la clase esta en default se lo ponemos
        //publico todo y ya se consigue instanciar
        
        String llamadaMetodo1 = calc.sumarHEX();
        int llamadadaMetodo2 = calc.menor();
        int llamadaMetodo3 = calc.sumar();
        int llamadaMetodo4 = calc.media();
        
        System.out.printf("Hex: %s, Menor: %d, Sumar: %d, Media: %d", llamadaMetodo1,llamadadaMetodo2, llamadaMetodo3, llamadaMetodo4);
    }
}
