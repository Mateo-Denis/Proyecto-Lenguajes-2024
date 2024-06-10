public class C extends A {

    int v4;
    B o1;
    
    public C(int x){
        super();
        o1 = new B();
        v4 = o1.m1(x) + o1.m1(2*x);
    }

    public int m1(int x){
        int aux1 = 0;
        int aux2 = 0;
        int j = 0;
        while (aux1 <= aux2){
            aux1 = aux1 + x;
            aux2 = aux2 + 5;

            if (j == 20){
                break;
            }
            j = j+1;
        }
        return aux1;
    }

    public void m3(){
        o1 = new B();
    }

}
