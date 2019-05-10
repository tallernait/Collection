import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete {
    private Employe e;
    private Departement d;

    Map<String,Employe> mapE = new HashMap<String, Employe>();
    Map<String,Departement> mapD = new HashMap<String, Departement>();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        //mapE.put(e.getCin(),e);
    }

    @Override
    public void supprimerEmploye(Employe e) {

    }

    @Override
    public void afficherLesEmployesLeursDepartements() {

    }

    @Override
    public void afficherLesEmployes() {

    }

    @Override
    public void afficherLesDepartements() {

    }

    @Override
    public void afficherDepartement(Employe e) {

    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return false;
    }
}
