package latihan;

public class Tabuungan {
    int saldo;
    Tabuungan(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }
    public void simpanUang(int jumlah) {
        saldo = saldo + jumlah;
    }
    public boolean ambilUang(int jumlah) {
        if (saldo - jumlah < 0){
            return false;
        }
        else {
            saldo -= jumlah;
            return true;
        }
    }
}
