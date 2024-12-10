public abstract class Personne implements IPersonne {
    private String nom;
    private String prenom;


    public Personne() {}

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Méthode d'implémentation de saisie() (à redéfinir dans les classes filles)
    @Override
    public void saisie() {
        // Méthode générique pour la classe abstraite
    }

    @Override
    public void affiche() {
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
    }
}