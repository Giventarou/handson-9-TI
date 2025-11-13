package latihan3;

public abstract class Bentuk {
    protected String nama;

    public Bentuk(String nama) {
        this.nama = nama;
    }

    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    public void tampilkanInfo() {
        System.out.println("Bentuk: " + nama);
        System.out.println("Luas: " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", hitungKeliling()));
    }
}

