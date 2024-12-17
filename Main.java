class Kendaraan {
    protected String jenis = "Toyota";
    public void klakson() {
        System.out.println("Tin tin!");
    }
}

class mobil extends Kendaraan {
    private String model = "Corolla";
    public static void main(String[] args) {

        mobil mobilku = new mobil();

        mobilku.klakson();

        System.out.println(mobilku.jenis + " " + mobilku.model);
    }
}
