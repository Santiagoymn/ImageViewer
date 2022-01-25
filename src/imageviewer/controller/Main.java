package imageviewer.controller;

import imageviewer.model.Image;
import imageviewer.persistance.FileImageLoader;
import java.io.File;


public class Main {
    
    public static void main(String[] args) {
        File file = new File("/Users/santiagoadrianyanezmartin/Desktop/Fotos ejemplo"); 
        FileImageLoader imageLoader = new FileImageLoader(file); 
        try{
            Image image = imageLoader.load();
            MainFrame mainFrame = new MainFrame(imageLoader); 
            mainFrame.getImageDisplay().show(image);
        }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Carpeta sin imágenes del filtro establecido: " + exc);
        }
        
    }
    
}
