public class BouteilleRefermable extends Contenant{
    BouteilleRefermable(int contenance, int reste) {
        super(contenance, reste, new Refermable());
    }

}
