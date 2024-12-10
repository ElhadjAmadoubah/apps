public class Etudiant extends Personne {
    private String matricule;
    private double moyenne;


    public Etudiant() {}

    public Etudiant(String nom, String prenom, double moyenne) {
        super(nom, prenom);
        this.moyenne = moyenne;
        this.matricule = generateMatricule();
    }


    public String getMatricule() {
        return matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }


    public String generateMatricule() {
        return "ET" + System.currentTimeMillis();
    }


    @Override
    public void saisie() {
        setNom("Diallo");
        setPrenom("Amina");
        this.moyenne = 15.5;
        this.matricule = generateMatricule();
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Matricule: " + matricule);
        System.out.println("Moyenne: " + moyenne);
    }
}
