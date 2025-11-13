package latihan3;

public class Product {
    private String nama;
    private double harga;
    private int stok;

    public Product(String nama) {
        this.nama = nama;
        this.harga = 0;
        this.stok = 0;
    }

    public Product(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
        this.stok = 0;
    }

    public Product(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("Product: " + nama + " | Price: Rp " + harga + " | Stock: " + stok);
    }
}

