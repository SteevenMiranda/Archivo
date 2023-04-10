package archivo;

import java.io.File;

public class PruebaFile {

    public void analizarRuta(String ruta) {
        //Crea un objeto File con base a la entrada del usuario
        File nombre = new File(ruta);

        /*
        Metodo nombre.exists(), Si existe el nombre muestra información sobre el
        muestra información sobre el archivo o directorio
         */
        if (nombre.exists()) {
            System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s",
                    nombre.getName(), " existe",
                    (nombre.isFile() ? "es un archivo" : "no es un archivo"),
                    (nombre.isDirectory() ? "es un directorio" : "no es un directorio"),
                    (nombre.isAbsolute() ? "es una ruta" : "no es una ruta"),
                    "Ultima modificación: ", nombre.lastModified(),
                    "Tamanio: ", nombre.length(),
                    "Ruta: ", nombre.getPath(),
                    "Ruta absoluta: ", nombre.getAbsolutePath(),
                    "Padre: ", nombre.getParent());

            if (nombre.isDirectory()) { // muestra el listado del directorio
                String directorio[] = nombre.list();
                System.out.println("\n\nContenido del directorio:\n ");
                for (String nombreDirectorio : directorio) {
                    System.out.printf("%s\n", nombreDirectorio);
                }

            } else {
                System.out.printf(" %s %s", ruta, "no existe");
            }
        }
    }
}
