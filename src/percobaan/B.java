package percobaan;

public class B extends A{
    private int z;

    public void setz(int z) {
        this.z = z;
    }

    public void getJumlah(){
        System.out.println("Jumlah : " + (x+y+z));
    }
}
