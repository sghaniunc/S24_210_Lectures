package lec4;

import static java.lang.Math.pow;

public class Arrays2 {
    public static void main(String[] args){
        String[] sA = {"Hi", "Bye"};

        String[] sA2 = new String[3];   // Alternative method
        sA2[0]="Hi";
        sA2[1]="Bye";
        sA2[2]="hello";

        int[] a = {1, 2, 3, 5};
        for (int i=0; i < a.length; i++)
            System.out.println("a[i]= " + a[i]);

        int[] b;
        b = new int[4];
        for (int i=0; i < b.length; i++) {
            b[i] = i * 10;
            System.out.println("b[i]= " + b[i]);
        }

        double[] c = new double[4];
        for (int i=0; i < c.length; i++) {
            c[i] = pow(i,2);
            System.out.println("c[i]= " + c[i]);
        }
    }
}
