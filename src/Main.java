import java.util.Objects;

public class Main {

    public static void main(String[] args) {
333333
    }
}


class Departement{
    private int id;
    private String nom;

    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Departement() {
    }

    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement)) return false;
        Departement that = (Departement) o;
        return id == that.id &&
                Objects.equals(nom, that.nom);
    }

}

class Employe{

    private int cin;
    private String matricule;
    private String nom;
    private String prenom;

    public Employe(int cin, String matricule, String nom, String prenom) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Employe(){

    }

    public int getCin() {
        return cin;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe)) return false;
        Employe employe = (Employe) o;
        return cin == employe.cin &&
                Objects.equals(matricule, employe.matricule) &&
                Objects.equals(nom, employe.nom) &&
                Objects.equals(prenom, employe.prenom);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "cin=" + cin +
                ", matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}