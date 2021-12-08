public class Carafe extends Contenant{
    Carafe(int contenance, int reste) {
        super(contenance, reste, new ToujoursOuvert());
    }
}
