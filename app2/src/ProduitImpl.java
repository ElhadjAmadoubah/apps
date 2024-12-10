import java.util.Scanner;

public class ProduitImpl implements IProduit {
    @Override
    public Produit saisie() {
        Scanner scanner = new Scanner(System.in);

        Produit produit = new Produit();

        System.out.print("Entrez la référence : ");
        produit.setRef(scanner.nextLine());

        System.out.print("Entrez le libellé : ");
        produit.setLibelle(scanner.nextLine());

        System.out.print("Entrez la quantité : ");
        produit.setQuantite(scanner.nextDouble());

        System.out.print("Entrez le prix : ");
        produit.setPrix(scanner.nextInt());

        return produit;
    }

    @Override
    public void affichage(Produit produit) {
        System.out.println("Référence : " + produit.getRef());
        System.out.println("Libellé : " + produit.getLibelle());
        System.out.println("Quantité : " + produit.getQuantite());
        System.out.println("Prix : " + produit.getPrix());
    }
}
