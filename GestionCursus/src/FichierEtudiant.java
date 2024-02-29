import java.io.*;

public class FichierEtudiant {

    private ObjectOutputStream ofW;
    private ObjectInputStream ofR;
    private  String nomDuFichier = "Cursus.dat";
    private char mode;

    public boolean ouvrirFlux(String s) throws IOException{
        try {
            mode = (s.toUpperCase()).charAt(0);
            if (mode == 'L' || mode == 'R') {
                ofR = new ObjectInputStream(new FileInputStream("Cursus.dat"));
            } else if (mode == 'W' || mode == 'E') {
                ofW = new ObjectOutputStream(new FileOutputStream("Cursus.dat"));
            }
            return true;
        }
        catch (IOException e){
            return false;
        }
    }
    public void ecrire(GestionCursus tmp) throws IOException {
        if(tmp != null) ofW.writeObject(tmp);

    }
    public Cursus lire () throws IOException, ClassNotFoundException{
        try{
            Cursus tmp = (Cursus) ofR.readObject();
            return tmp;
        }catch(IOException e){
           System.out.println("Erreur");
        }catch (ClassNotFoundException e){
            System.out.println("La class n'a pas été trouvé.");
        }
        return null;
    }

    public void fermer() throws IOException{
        if (mode == 'L' || mode == 'R') ofR.close();
        else if (mode =='W' || mode == 'E') ofW.close();
    }
}
