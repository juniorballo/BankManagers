public class Main {
    public static void main(String[] args) {

        // 1. Création d'une instance pour chacune des 3 classes enfants
        CheckingAccount compte1 = new CheckingAccount();
        SavingsAccount compte2 = new SavingsAccount();
        COD compte3 = new COD();

        // 2. Définir les attributs avec les méthodes 'set' (Écriture)
        compte1.setAccount("CC-1010");
        compte1.setBalance(150000);

        compte2.setAccount("CE-2020");
        compte2.setBalance(350500);

        compte3.setAccount("COD-3030");
        compte3.setBalance(1200000);

        // 3. Lire et afficher les attributs avec les méthodes 'get' (Lecture)
        System.out.println("--- Checking Account (Compte Courant) ---");
        System.out.println("Numéro : " + compte1.getAccount());
        System.out.println("Solde  : " + compte1.getBalance());
        System.out.println(); // Ligne vide pour aérer l'affichage

        System.out.println("--- Savings Account (Compte d'Épargne) ---");
        System.out.println("Numéro : " + compte2.getAccount());
        System.out.println("Solde  : " + compte2.getBalance());
        System.out.println();

        System.out.println("--- COD (Certificat de Dépôt) ---");
        System.out.println("Numéro : " + compte3.getAccount());
        System.out.println("Solde  : " + compte3.getBalance());
    }
}