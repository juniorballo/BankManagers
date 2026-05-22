public class Main {
    public static void main(String[] args) {

        // 1. Création d'une instance pour chacune des 3 classes enfants
        CompteCourant compte1 = new CompteCourant();
        CompteEpargne compte2 = new CompteEpargne();
        CompteProfessionnel compte3 = new CompteProfessionnel();

        // 2. Définir les attributs avec les méthodes 'set' (Écriture)
        compte1.setAccount("CC-1010");
        compte1.setBalance(1500.00);

        compte2.setAccount("CE-2020");
        compte2.setBalance(3500.50);

        compte3.setAccount("CP-3030");
        compte3.setBalance(12000.00);

        // 3. Lire et afficher les attributs avec les méthodes 'get' (Lecture)
        System.out.println("--- Compte Courant ---");
        System.out.println("Numéro : " + compte1.getAccount());
        System.out.println("Solde  : " + compte1.getBalance());
        System.out.println(); // Ligne vide pour aérer l'affichage

        System.out.println("--- Compte Épargne ---");
        System.out.println("Numéro : " + compte2.getAccount());
        System.out.println("Solde  : " + compte2.getBalance());
        System.out.println();

        System.out.println("--- Compte Professionnel ---");
        System.out.println("Numéro : " + compte3.getAccount());
        System.out.println("Solde  : " + compte3.getBalance());
    }
}