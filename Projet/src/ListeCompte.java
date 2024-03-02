
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;


public class ListeCompte implements Serializable {

    HashMap<String,Compte>  cpteList;

    public ListeCompte(){
        cpteList = new HashMap<>();
    }
    public void AjouterUnCompte(String str){
        Compte instanceCpte = new Compte("");
        if(str.equalsIgnoreCase("A"))
            instanceCpte = new Compte();
            else if (str.equalsIgnoreCase("E")) instanceCpte = new Compte("Epargne");
        String key = instanceCpte.quelNumerodeCompte();
        if(cpteList.get(key) == null) cpteList.put(key,instanceCpte);
            else
                System.out.println("compte déjà existant , creation impossible");
    }
    public void rechercherUnCompte(String numerolu){
        String cle = numerolu;
        Compte instanceCpte = (Compte) cpteList.get(cle);
        if (instanceCpte != null)		instanceCpte.AfficherCpte();
        else System.out.println("Le systeme ne connait pas le compte "+numerolu);
    }
public void supprimeUnCompte(String str) {
    String cle = str;
    Compte c = (Compte) cpteList.get(cle);
    if (c != null)  {
        cpteList.remove(cle);
        System.out.println(str + " a ete supprime ");
    }
    else System.out.println(str + " est inconnu ! ");
}
    public void afficheLesComptes() 	{
        if(cpteList.size() != 0)	{
            Collection<Compte> colCompte = cpteList.values();
            for (Compte c: colCompte )  c.AfficherCpte();
        }
        else System.out.println("Aucun compte n'a ete cree, dans cette liste");
    }
    public void ajouteUneLigne(String str) {
        String key = str;
        Compte instanceCpte = (Compte) cpteList.get(key);
        if (instanceCpte != null)		instanceCpte.creerLigne();
        else System.out.println("Le systeme ne connait pas le compte "+str);
    }

}
