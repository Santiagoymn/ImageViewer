package imageviewer.controller;

import imageviewer.persistance.ImageLoader;
import imageviewer.persistance.ui.ImageDisplay;
import imageviewer.persistance.ui.SwingImageDisplay;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class MainFrame extends JFrame {
    
    private SwingImageDisplay imageDisplay; //utilizamos la interfaz porque podemos utilizar cualquier clase que implemente la interfaz de manera transparente si tener que saber que hace cada implementación
    private final ImageLoader imageLoader;
    
    public MainFrame(ImageLoader imageLoader){
        this.imageLoader = imageLoader;
        this.setTitle("Image Viewer");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        this.setSize(800,600);
        this.setLocationRelativeTo(null); 
        this.getContentPane().add(imageDisplay()); 
        this.getContentPane().add(toolBar(),BorderLayout.SOUTH); 
        this.setVisible(true);
    }

    private JPanel toolBar() { 
        JPanel panel = new JPanel(); 
        panel.add(prevButton()); 
        panel.add(nextButton()); 
        return panel;
    }
    
    private JButton prevButton() {
        JButton button = new JButton("<"); 
        button.addActionListener(prevImage()); 
        return button;
    }
    
    private ActionListener prevImage() { 
        return e -> imageDisplay.show(imageLoader.prev()); 
    }
    
    private JButton nextButton() {
        JButton button = new JButton(">"); 
        button.addActionListener(nextImage()); 
        return button;
    }
    
    private ActionListener nextImage() { 
        return e -> imageDisplay.show(imageLoader.next()); 
    }
    
    private JPanel imageDisplay() {
        SwingImageDisplay sid = new SwingImageDisplay(); 
        this.imageDisplay = sid;
        return sid;
    }
    
    public ImageDisplay getImageDisplay() { 
        return imageDisplay;
    }
    
}
