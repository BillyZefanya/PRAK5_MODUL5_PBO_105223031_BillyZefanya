public class Utama {
    public static void main(String[] args) {
        Karyawan k = new Karyawan("105223031", "Billy");

        k.setDepartemen("IT");
        k.setGajiPokok(-1000);
        k.setGajiPokok(5000000);

        k.tampilkanDataKaryawan();
    }
}