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
                    listarDirectorio();
                    break;
                case 3:
                    eliminarDirectorio();   
                    break;
                case 4:
                    moverORenombrar();
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
    private static void listarDirectorio() {

        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

    int resultado = fc.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File directorio = fc.getSelectedFile();
            File[] archivos = directorio.listFiles();
                for (File archivo : archivos) {
                 System.out.println(archivo.getName());
                }
        }
    }
    private static void eliminarDirectorio(){
    JFileChooser fc = new JFileChooser();
    int resultado = fc.showOpenDialog(null);
    if (resultado == JFileChooser.APPROVE_OPTION) {
        File archivo = fc.getSelectedFile();
            if (archivo.delete()) {
             System.out.println("Eliminado correctamente.");
            }    else {
            System.out.println("No se ha podido eliminar.");
                } 
    }
    }
    private static void eliminarRecursivo(){
        if(elemento
    }
   
    private static void moverORenombrar() {

    JFileChooser fc = new JFileChooser();

    int resultado = fc.showOpenDialog(null);

    if (resultado == JFileChooser.APPROVE_OPTION) {

        File archivo = fc.getSelectedFile();

        System.out.println("1. Renombrar");
        System.out.println("2. Mover");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion == 1) {

            System.out.println("Introduce el nuevo nombre:");
            String nombre = sc.nextLine();

            File nuevoArchivo = new File(
                    archivo.getParent(),
                    nombre
            );

            if (archivo.renameTo(nuevoArchivo)) {
                System.out.println("Renombrado correctamente.");
            } else {
                System.out.println("No se ha podido renombrar.");
            }

        } else if (opcion == 2) {

            JFileChooser destino = new JFileChooser();
            destino.setFileSelectionMode(
                    JFileChooser.DIRECTORIES_ONLY);

            int resultadoDestino = destino.showOpenDialog(null);

            if (resultadoDestino == JFileChooser.APPROVE_OPTION) {

                File carpetaDestino = destino.getSelectedFile();

                File nuevoArchivo = new File(
                        carpetaDestino,
                        archivo.getName()
                );

                if (archivo.renameTo(nuevoArchivo)) {
                    System.out.println("Movido correctamente.");
                } else {
                    System.out.println("No se ha podido mover.");
                }
            }
        }
    }
        }

    
}

    



