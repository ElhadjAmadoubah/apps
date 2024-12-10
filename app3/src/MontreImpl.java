public class MontreImpl implements IMontre {
    @Override
    public Montre saisie() {
        // Création d'une montre avec des données prédéfinies
        Montre montre = new Montre(2, "Montre Rolex", "Luxe");
        return montre;
    }

    @Override
    public void affichage(Montre m) {
        System.out.println("ID : " + m.getId());
        System.out.println("Libellé : " + m.getLib());
        System.out.println("Nature : " + m.getNature());
    }
}
