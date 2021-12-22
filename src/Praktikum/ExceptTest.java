package Praktikum;

public class ExceptTest {
    public static void main(String[] args) {
        int a[] = new int [2];
        try{
            System.out.println("Acces element three : " + a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception throw : " + e);
        }finally {
            a[0] = 6;
            System.out.println("First elemet value : " + a[0]);
        }
    }
}
