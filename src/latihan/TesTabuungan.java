package latihan;

public class TesTabuungan {
    public static void main(String[] args) {
        boolean og;
        Tabuungan Tabungan = new Tabuungan(10000);
        System.out.println("\nSaldo awal : " + Tabungan.getSaldo());
        Tabungan.simpanUang(8000);
        System.out.println("Jumlah uang yang disimpan : 8000");
        og = Tabungan.ambilUang(7000);
        System.out.print("Jumlah uang yang diambil : 7000");
        if (og) {
            System.out.println(" Ok");
        }
        else {
            System.out.println(" gagal");
        }
        Tabungan.simpanUang(1000);
        System.out.println("Jumlah uang yang disimpan : 1000");
        og = Tabungan.ambilUang(10000);
        System.out.print("Jumlah uang yang diambil : 10000");
        if (og) {
            System.out.println(" OK");
        }
        else {
            System.out.println(" gagal");
        }
        og = Tabungan.ambilUang(2500);
        System.out.print("Jumlah uang yang diambil : 2500");
        if (og){
            System.out.println(" Ok");
        }
        else {
            System.out.println(" gagal");
        }
        Tabungan.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000");
        System.out.println("Saldo sekarang = "+ Tabungan.getSaldo());
    }
}
