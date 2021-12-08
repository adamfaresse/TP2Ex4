public class Ouvrable implements Ouverture{
    public boolean estOuvert;

    Ouvrable(){
        this.estOuvert = false;
    }



    public void ouvrir(){
        this.estOuvert = true;
    }
    @Override
    public boolean estOuvert() {
        return this.estOuvert;
    }
}
