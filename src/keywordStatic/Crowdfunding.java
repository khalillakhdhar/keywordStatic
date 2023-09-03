package keywordStatic;

import java.util.Scanner;

public class Crowdfunding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nom de l'intervenant (ou tapez 'q' pour quitter) : ");
            String intervenant = scanner.nextLine();

            if (intervenant.equals("q")) {
                break;
            }

            System.out.print("Somme : ");
            double somme = scanner.nextDouble();
            scanner.nextLine();  // Nettoyer la ligne en cours

            Intervention intervention = new Intervention(intervenant, somme);
            Intervenants.interventions.add(intervention);
        }

        System.out.println("Somme totale collectée : " + Intervention.getSommeTotale());
        System.out.println("liste des intervenants");
        Intervenants.showList();
        
    }
}
