public class ChemiseImpl implements IChemise {
    @Override
    public Chemise saisie() {
        // Création d'une chemise avec des données prédéfinies
        Chemise chemise = new Chemise(1, "Chemise en coton", "Moderne");
        return chemise;
    }

    @Override
    public void affichage(Chemise c) {
        System.out.println("ID : " + c.getId());
        System.out.println("Libellé : " + c.getLib());
        System.out.println("Couture : " + c.getCouture());
    }
}
