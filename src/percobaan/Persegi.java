package percobaan;

public class Persegi extends Bentuk{
    protected int p, l;

    public void setSuperP(int p){
        super.p =p;
    }
    public void setSuperL(int l){
        super.l =l;
    }
    public void setP(int p){
        super.p =p;
    }
    public void setL(int L){
        super.l =l;
    }
    public void getLuas(){
        System.out.println("Luas Super : " + (super.p * super.l));
        System.out.println("Luas :  " + (this.p * this.l));
    }
}
