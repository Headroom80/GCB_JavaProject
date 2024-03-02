import java.awt.*;

public class Dessin extends Canvas {

    public Dessin(){
        setBackground(Color.white);
        setForeground(Color.green);
        setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
    }
    public void paint(Graphics graphic){
        new Triangle(graphic);
    }
}
