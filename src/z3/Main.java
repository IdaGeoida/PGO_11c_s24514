package z3;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int[] num = new int[3];
            for (int i=1;i<4;i++){
                    System.out.print("Podaj liczbę numer "+i+": ");
                    num[i-1] = sc.nextInt();
            }

            int tem1 = Math.max(num[0],num[1]);
            tem1 = Math.max(tem1,num[2]);
            int tem2 = Math.min(num[0],num[1]);
            tem2 = Math.min(tem2,num[2]);
            num[0]=tem2;
            num[2]=tem1;

            System.out.println("Wartość najmniejsza: "+tem2);
            System.out.println("Wartość największa: "+tem1);


        }
}
