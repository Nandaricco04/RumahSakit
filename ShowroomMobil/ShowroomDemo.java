package ShowroomMobil;

public class ShowroomDemo {
    public static void main(String[] args) {
        Showroom showroom = new Showroom(1, "Showroom A", "Jakarta");
        Sales nanda = new Sales("S001", "Nanda");
        Sales ricco = new Sales("S002", "Ricco");

        showroom.tambahMobil("M001", "Toyota", "SUV", 2020, 300000000, nanda);
        showroom.tambahMobil("M002", "Honda", "Sedan", 2021, 350000000, ricco);

        showroom.getInfo();
    }
}
