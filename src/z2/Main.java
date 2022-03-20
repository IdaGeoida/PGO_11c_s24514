package z2;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Podaj liczbę a: ");
        int a = sc.nextInt();
        System.out.print("Podaj liczbę b: ");
        int b = sc.nextInt();
        System.out.print("Podaj liczbę c: ");
        int c = sc.nextInt();

        int tem1 = Math.max(a,b);
        tem1 = Math.max(tem1,c);
        int tem2 = Math.min(a,b);
        tem2 = Math.min(tem2,c);
        a=tem2;
        c=tem1;

        System.out.println("Wartość najmniejsza: "+a);
        System.out.println("Wartość największa: "+c);


    }
}
