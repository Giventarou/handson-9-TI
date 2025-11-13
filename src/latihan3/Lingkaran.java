package latihan3;

public class Lingkaran extends Bentuk {
    private double radius;
    private final double PI = 3.14159;

    public Lingkaran(double radius) {
        super("Lingkaran");
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        return PI * radius * radius;
    }

    @Override
    public double hitungKeliling() {
        return 2 * PI * radius;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Bentuk: " + nama);
        System.out.println("Luas Lingkaran dengan radius " + radius + ": " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", hitungKeliling()));
    }
}

