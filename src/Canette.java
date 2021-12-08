public class Canette extends ContenantBuvable{
    Canette(int contenance, int reste) {
        super(contenance, reste, new Ouvrable());
    }
}
