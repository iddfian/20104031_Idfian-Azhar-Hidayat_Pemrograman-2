package latihan.Perbankan;

public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private latihan.Perbankan.Tabungan tabungan;

    public Nasabah(String namaAwal, String namaAkhir) {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    public String getNamaAwal() {
        return namaAwal;
    }
    public  String getNamaAkhir() {
        return namaAkhir;
    }
    public latihan.Perbankan.Tabungan getTabungan() {
        return tabungan;
    }
    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }
}