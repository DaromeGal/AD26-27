import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Ej3 {
    public static void main(String[] args) {
        int opcion= opcionMenu();
        while (opcion >=1 && opcion <=4){
            switch (opcion) {
                case 1:
                    crearDirectorio();
                    break;
                case 2:
                    //listarDIrectorio();
                    break;
                case 3:
                    //eliminarDirectorio();   
                    break;
                case 4:
                    //moverORenombrar();
                    break;
            
                default:
                    break;
            }
            opcion= opcionMenu();
        } 
    }
    private static int opcionMenu(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Gestor de archivos y directorios");
        System.out.println("1. Crear un directorio");
        System.out.println("2. Listar un directorio");
        System.out.println("3. Eliminar un archivo o directorio");
        System.out.println("4. Mover o renombrar archivos y directorios");
        System.out.println("Opcion");
        int opcion= sc.nextInt();
        return opcion;
    }
    private static void crearDirectorio(){
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int resultado = fc.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
             File directorio = fc.getSelectedFile();
             String nombre = JOptionPane.showInputDialog("Introduce nuevo directorio");
        
        if (nombre != null && !nombre.isEmpty()) {

            File nuevoDirectorio = new File(directorio, nombre);

            if (nuevoDirectorio.mkdir()) {
                System.out.println("Directorio creado correctamente.");
            } else {
                System.out.println("No se ha podido crear el directorio.");
            }
        }
    }
    

}
}
