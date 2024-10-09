package garde_fruits;
import java.util.*;
public class Garde_fruits {

    public static void main(String[] args) {
        // Vérifier si la quantité de fruits dans le stock est suffisante pour le lendemain

        Scanner sc = new Scanner(System.in); //scanner le chiffre tapé au clavier
        System.out.println("Veuillez saisir la quantité de pomme restante : "); //Le message affiché à l'utilisateur
        int i = sc.nextInt(); // l'entier i récupère le nombre tapé au clavier
        String str = sc.nextLine(); //affichage avec retour à la ligne


    if (i >= 100) {
        System.out.println("La quantite est suffisante");
    }
    else {
        System.out.println("La quantite est insuffisante, veuillez commander pour demain");
    }
    }
}