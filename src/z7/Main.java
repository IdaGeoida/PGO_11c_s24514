package z7;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n<5 || n%2==0){
            System.out.print("Podaj liczbę: ");
            n = sc.nextInt();
            if (n<5 || n%2==0) System.out.println("Błędna liczba!");
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==j||i==n||j==n) System.out.print ("X");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
