import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;


public class Ej1 {
    
    public static void main(String[] args) {
        String ruta = "src/Prueba.txt";
        File f = new File(ruta);
        SimpleDateFormat formateador = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy",
                Locale.of("es", "ES"));

        if (f.exists()) {
            System.out.println("Ruta absoluta: " + f.getAbsolutePath());
            System.out.println("Nombre: " + f.getName());
            System.out.println("Tamaño: " + f.length() + " bytes");
            System.out.println("Modificado por última vez: " +formateador.format(new Date(f.lastModified())));
            System.out.println("Es directorio: " + (f.isDirectory() ? "Directorio" : "Archivo"));
        } else {
            System.out.println("El archivo no existe. Creandolo...");
            try {
                f.createNewFile();
            } catch (IOException e) {
                System.out.println("Error creando nuevo archivo: " + e.getMessage());
            }
        }

    }
    
}