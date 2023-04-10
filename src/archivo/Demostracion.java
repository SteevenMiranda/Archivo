package archivo;

import java.util.Scanner;

public class Demostracion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        PruebaFile aplicacion = new PruebaFile();
        System.out.println("Escriba el nombre del archivo o directorio: ");
        aplicacion.analizarRuta(entrada.nextLine());
    }

}
