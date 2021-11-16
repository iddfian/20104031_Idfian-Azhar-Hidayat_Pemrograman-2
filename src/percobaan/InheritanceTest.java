package percobaan;

public class InheritanceTest {
    public void main(String[] args){
        A ortu = new A();
        B anak = new B();

        System.out.println("superclass");
        ortu.setX(10);
        ortu.sety(20);
        ortu.getNilai();

        System.out.println("subclass");
        anak.setX(5);
        anak.sety(4);
        anak.setz(50);
        anak.getNilai();
        anak.getJumlah();
    }
}
