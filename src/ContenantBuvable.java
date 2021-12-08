public class ContenantBuvable extends Contenant{
    ContenantBuvable(int contenance, int reste, Ouverture ouverture) {
        super(contenance, reste, ouverture);
    }

    void boire(int quantite){
        if(getTransferabilite().estTransferable(this,quantite)){
            setReste(getReste() - quantite);
        }


    }
}
