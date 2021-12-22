package Praktikum;

public class Percobaan2 {
    public static void main(String[] args) {
        int bil = 10;
        try{
            System.out.println(bil/0);
        }catch (ArithmeticException e){ //Throwable e
            System.out.println("Tidak boleh memanggil bilangan dengan 0");
          //System.out.println(e);
        }
    }
}
