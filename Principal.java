public class Principal {	
    public static void main(String[] args){
        int x1, x2;        
        x1 = Sistema.read();
        x2 = Sistema.read();

        C oA = new C(x1+x2);

        Sistema.print(oA.m1(x1+x2+1));
        
        oA.m3();
        
        Sistema.print(oA.m1(x1) + oA.m2());

    }
}
