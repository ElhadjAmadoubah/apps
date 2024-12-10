public class Main {
    public static void main(String[] args) {
        System.out.println("=== Saisie des informations d'un employé ===");
        Employe employe = new Employe();
        employe.saisie();
        System.out.println("\n=== Informations de l'employé ===");
        employe.affiche();
    }
}
