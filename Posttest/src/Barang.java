class Barang {
    private String idBarang;
    private String namaBarang;
    private int stok;
    private double hargaSatuan;
    protected String kategori;

    public Barang(String idBarang, String namaBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = 0;
        this.hargaSatuan = 0;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok tidak boleh negatif");
        }
    }

    public void setHargaSatuan(double hargaSatuan) {
        if (hargaSatuan > 0) {
            this.hargaSatuan = hargaSatuan;
        } else {
            System.out.println("Harga harus lebih dari 0");
        }
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Jumlah harus lebih dari 0");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak cukup atau input salah");
        }
    }

    public void tampilkanDetailBarang() {
        System.out.println("ID: " + idBarang);
        System.out.println("Nama: " + namaBarang);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + hargaSatuan);
    }
}