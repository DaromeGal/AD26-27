import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Ej2 {
    public static void main(String[] args) {
           JFileChooser chooser = new JFileChooser();
           chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
   //FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
   //chooser.setFileFilter(filter);
   int returnVal = chooser.showOpenDialog( null);
   if(returnVal == JFileChooser.APPROVE_OPTION) {

      File directorio = chooser.getSelectedFile();

      System.out.println("Listado del directorio "+directorio.getAbsolutePath());

      int totalLen=0;

      for(File f: directorio.listFiles()){
        System.out.println("- "+f.getName()+ " ("+f.length()+ ")"+(f.isDirectory()+ "Directorio?"));
        totalLen+= f.length();
      }
      System.out.println("Tamaño total: "+ totalLen);
   }

    }
}
