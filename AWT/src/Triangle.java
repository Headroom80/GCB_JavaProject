import java.awt.*;

public class Triangle {
    private int centreX = Fenetre.vh/2;
    private  int centreY = Fenetre.vw/2;
    private int [] xpoints = {centreX, centreX+10,centreX -10};
    private int [] ypoints={centreY-10,centreY+10,centreY+10};
    int npoints = 3;
    public Triangle(Graphics graphics){
        graphics.fillPolygon(xpoints,ypoints,npoints);
    }
}
