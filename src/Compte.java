public class Compte {
    // Les deux attributs demandés
    private String account;
    private double balance;

    // Constructeur par défaut (vide)
    public Compte() {
    }

    //  LIRE le numéro de compte
    public String getAccount() {
        return this.account;
    }

    //  MODIFIER le numéro de compte
    public void setAccount(String account) {
        this.account = account;
    }

    //  LIRE le solde
    public double getBalance() {
        return this.balance;
    }

    // MODIFIER le solde
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
