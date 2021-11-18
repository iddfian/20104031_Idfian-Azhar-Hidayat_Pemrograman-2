package Modul7.percobaan;

public class Overload { // memiliki 2 method
    void myOverload(A a) {
        System.out.println("Overload.myOverload (A a)");
    }

    void myOverload(B b) {
        System.out.println("Overload.myOverload (B b)");
    }

    public static void main(String[] args) {
        Overload o = new Overload(); // objek class Overload bernama o
       // A a = new A();// objek class A bernama a
        C c = new C(); // objek class C bernama c

      //  o.myOverload(a);// memanggil method yang ada pada class Overload dengan mengisi parameter objek class A
        o.myOverload(c); // memanggil method yang ada pada class Overload dengan mengisi parameter objek class C
    }
}
