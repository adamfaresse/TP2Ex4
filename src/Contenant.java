public abstract class Contenant {
    private Ouverture ouverture;
    private int contenance;
    private int reste;
    static private Transferabilite transferabilite = new TransferableSiOuvert();

    int getContenance() { return contenance; }
    public int getReste() { return reste; }
    public void setReste(int reste) { this.reste = reste; }
    Ouverture getOuverture() { return ouverture; }
    static void setTransferabilite(Transferabilite transferabilite) {
        Contenant.transferabilite = transferabilite;
    }
    static Transferabilite getTransferabilite() { return transferabilite; }

    Contenant(int contenance, int reste, Ouverture ouverture){
        this.contenance = contenance;
        this.reste = reste;
        this.ouverture = ouverture;
    }

    void verserDans(int quantite, ContenantRemplissable contenant) {
        if(transferabilite.estTransferable(this, quantite)){
            reste = reste - quantite;
            contenant.setReste(contenant.getReste() + quantite);
        }
    }



}
