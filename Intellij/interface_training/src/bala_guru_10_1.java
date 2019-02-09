interface Area {
    final static float pi = 3.1416F;
    float compute (float x, float y);
}


class Circle implements Area{

    @Override
    public float compute(float x, float y) {
        return (pi*x*x);
    }
}

public class bala_guru_10_1 {
    public static void main(String[] args) {

        Area area_cir;

        Circle cir = new Circle();
        area_cir = cir;

        Area area_rec = new Area() {
            @Override
            public float compute(float x, float y) {
                return (x*y);
            }
        };

        System.out.println("Lets see " + cir.compute(10,0));
        System.out.println("Lets see " + area_cir.compute(10,0));
        System.out.println("Lets see " + area_rec.compute(10,20));

    }
}
