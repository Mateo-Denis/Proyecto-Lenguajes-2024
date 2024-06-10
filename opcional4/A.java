package opcional4;

public class A {
    int[] v1;

    public A(){
        v1 = new int[]{2, 4, 6, 8, 10};
    }

    public int m1(){
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma = suma + v1[i];
        }
        return suma;
    }
}
