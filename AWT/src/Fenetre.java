import java.awt.*;
public class Fenetre {
    public final static  int vh = 300;
    public final static int vw = 300;

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setTitle("Un Triangle");
        frame.setSize(vh,vw);
        frame.add(new Dessin());
        frame.setBackground(Color.gray);
        frame.setVisible(true);

    }
}
