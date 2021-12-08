public class Verre extends ContenantBuvable{
    Verre(int contenance, int reste) {
        super(contenance, reste, new ToujoursOuvert());
    }
}
