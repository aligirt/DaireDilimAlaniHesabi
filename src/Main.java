import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14, r, alp, sonuc;

        Scanner input = new Scanner(System.in);
        System.out.print("Daire Yarıçapını Giriniz (mm) :");
        r = input.nextDouble();

        System.out.print("Dilim Açısını Giriniz ( ° ) :");
        alp = input.nextDouble();

        sonuc = pi * (r * r) * alp / 360;

        System.out.println("" + r + "mm Yarıçaplı ve " + alp + "° lik Dilim için Alan: \n" + sonuc + "mm^2 dir.");

    }
}