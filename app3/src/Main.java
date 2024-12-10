public class Main {
    public static void main(String[] args) {
        System.out.println("=== Saisie et affichage d'une chemise ===");
        IChemise chemiseService = new ChemiseImpl();
        Chemise chemise = chemiseService.saisie();
        chemiseService.affichage(chemise);

        System.out.println("\n=== Saisie et affichage d'une montre ===");
        IMontre montreService = new MontreImpl();
        Montre montre = montreService.saisie();
        montreService.affichage(montre);
    }
}
