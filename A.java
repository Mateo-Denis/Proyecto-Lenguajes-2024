public class A {

    static int a1 = 10;

    int v1, v2, v3;

    public A(){
        v1 = 1;
        v2 = 2;
        v3 = 10;
    }

    public int m1(){
        do{
            v1 = v1 + 1;
            v2 = v2 + v1;
        } while ((v1 + v2) <= a1*a1);
        
        return this.m2();
    }

    public int m2(){
        return v3 - v1 + 3*a1;
    }

}
