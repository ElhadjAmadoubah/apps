import java.util.Scanner;

public class Employe extends Personne {
    private String fonction;
    private int salaire;

    // Constructeurs
    public Employe() {}

    public Employe(String nom, String prenom, String fonction, int salaire) {
        super(nom, prenom);
        this.fonction = fonction;
        this.salaire = salaire;
    }

    // Getters et Setters
    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    // Implémentation de saisie() avec Scanner
    @Override
    public void saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom de l'employé : ");
        setNom(scanner.nextLine());

        System.out.print("Entrez le prénom de l'employé : ");
        setPrenom(scanner.nextLine());

        System.out.print("Entrez la fonction de l'employé : ");
        this.fonction = scanner.nextLine();

        System.out.print("Entrez le salaire de l'employé : ");
        this.salaire = scanner.nextInt();

        // scanner.close(); (ne fermez pas ici si vous comptez utiliser le Scanner ailleurs)
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Fonction: " + fonction);
        System.out.println("Salaire: " + salaire);
    }
}
