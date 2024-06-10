public class B extends A {

    int v4, v5;

    public B(){
        super();
        v4 = a1 + 1;
        v5 = (v1 + v2) * 3;
    }

    public int m1(){
        int t, x;

        x = v1 - v2*v3;

        switch (x) {
            case 1:
                t = 3*x + 1;
                break;
            case 2:
                t = x + v3;
                break;
            default:
                t = x;
                break;
        }

        return super.m1() + x*t;
    }

    public int m1(int x){
        int t = 5;
    
        if(x >= (t + 1) && x < 10){
            return t - x;
        }
    
        if(x >= (t + 1) & x > 10){
            return t - x - 1;
        }
    
        return t * 5;
    }
}
