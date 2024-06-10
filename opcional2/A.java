package opcional2;

public class A {
    private int v1;

    public A(int x) {
        v1 = (x > 0) ? x : 0;
    }

    public int m1() {
        return v1;
    }    
}
