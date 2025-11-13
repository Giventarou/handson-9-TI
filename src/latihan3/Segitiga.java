package latihan3;

public class Segitiga extends Bentuk {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        double miring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + miring;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Bentuk: " + nama);
        System.out.println("Luas Segitiga (alas: " + alas + ", tinggi: " + tinggi + "): " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", hitungKeliling()));
    }
}
