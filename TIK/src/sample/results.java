package sample;

import java.util.function.DoubleToIntFunction;

public class results {
    public int c, a, b, np;
    public double  ck,knn;
    public String cs, cks, ks;
    public results(int aa, int bb,int nnp){
        a=aa;
        b=bb;
        np=nnp;
    }
    public void init(){
        inCX();
        glob();
        icky();
    }
    private void inCX(){
        c=((factorial(a))/(factorial(b)*factorial(a-b)));
        cs=String.valueOf(c);
    }
    private int factorial(int a){
        int e=1;
        for(int i = 1; i<=a; i++){
            e*=i;
        }
        return e;
    }
    private void icky(){
        ck=(1-knn)*100;
        cks=("(1-"+ks+")*100%="+String.valueOf(ck)+"%");
    }
    private void glob(){
        knn=(Double.parseDouble(String.valueOf(np))/ Double.parseDouble(cs))/6;
        knn*=10;
        knn=Math.ceil(knn)/10;
        ks=String.valueOf(knn);
    }
}
