package dam108t2_paquetes;
import java.util.*;
// importamos los paquetes de manera statica para poder invocar los metodos
// staticos sin tener que instanciar las clases
import static java.lang.Math.*;
import static pClasesApoyo.Dado_v4.*;

public class dam108t2e405 {
    static Scanner teclado;
    public static void main(String[] args) {
        
        int result = lanzar();
        
        double area = result * result * PI;
        
        System.out.println("Tiramos un dado y sale el numero: "+result);
        System.out.println("Area del circulo utilizando "+result+" como radio es: "+area);
    }
}
