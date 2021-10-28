package latihan;

public class Tabuungan {
    int saldo;
    Tabuungan(int saldo) {
        this.saldo = saldo;
    }
    public int saldo() {
        return saldo;
    }
    public void disimpan(int uang) {
        saldo = saldo + uang;
    }
    public boolean diambil(int uang) {
        if (saldo - uang < 0){
            return false;
        }
        else {
            saldo -= uang;
            return true;
        }
    }
}