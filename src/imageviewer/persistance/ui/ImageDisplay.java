package imageviewer.persistance.ui;

import imageviewer.model.Image;


public interface ImageDisplay {
    Image current();
    void show(Image image);
    
}
