public class Main {
    public static void main(String[] args) {
        IProduit produitService = new ProduitImpl();
        Produit produit = produitService.saisie();
        produitService.affichage(produit);
    }

}