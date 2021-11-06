package percobaan.sekolah;

import percobaan.Mahasiswa;

public class kelas {
    private int kodekelas;
    private String namakelas;
    private Mahasiswa mahasiswa;

    public kelas(int kode, String nama){
        this.kodekelas = kode;
        this.namakelas = nama;
    }

    public void setMhs(Mahasiswa mhs){
        this.mahasiswa = mhs;
    }
}