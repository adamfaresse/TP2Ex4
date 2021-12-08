public class Main {
    public static void main(String[] args) {
        //BouteilleRefermable bouteilleRefermable = new BouteilleRefermable(10,5);
        //bouteilleRefermable.getOuverture().ouvrir();
        Verre verre = new Verre(10,5);
        BouteilleNonRefermable bouteilleNonRefermable = new BouteilleNonRefermable(10,5);
        System.out.println(bouteilleNonRefermable.getOuverture().estOuvert());
        Ouvrable bouteille0 = (Ouvrable) bouteilleNonRefermable.getOuverture();
        bouteille0.ouvrir();

        System.out.println(bouteilleNonRefermable.getOuverture().estOuvert());

    }


}
