package kalkulator;

public class main {
    int total;
    public void settotaltambah (int a,int b){
        this.total = a + b;
    }
    public void settotalkali (int a,int b){
        this.total = a*b;
    }
    public void settotalbagi (int a, int b){
        this.total = a/b;
    }
    public void settotalkurang (int a, int b){
        this.total = a - b;
    }
    public int gettotal(){
        return total;
    }
}
