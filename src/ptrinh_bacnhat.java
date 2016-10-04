import java.util.Scanner;

/**
 * Created by Laptop88 on 10/3/2016.
 */
public class ptrinh_bacnhat {
    public static void main(String[] args) {
        //giai phuong trinh bac nhat
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("vui long nhap gia tri a:");
//        float a = scanner.nextInt();
//        System.out.println("Vui long nhap gia tri b:");
//        float b = scanner.nextInt();
//        System.out.println("Vui long nhap gia tri c:");
//        float c = scanner.nextInt();
//        if (a == 0) {
//            System.out.println("Vui long nhap lai gia tri cua a:");
//        } else {
//            System.out.println("Gia tri cua x la:");
//            System.out.println((c - b) / a);
//
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap gia tri a:");
        float a = scanner.nextFloat();
        System.out.println("Vui long nhap gia tri b");
        float b = scanner.nextFloat();
        System.out.println("Vui long nhap gia tri c");
        float c = scanner.nextFloat();
        float d = b*b-4*a*c;


        if (d>0 ) {
            System.out.println("Phuong trinh co 2 nghiem:");
            System.out.println(((-b + Math.sqrt(d))/(2*a)));
            System.out.println(((-b - Math.sqrt(d))/(2*a)));

        } else {
            if (d == 0) {
                System.out.println("Phuong trinh co 1 nghiem");
                System.out.println(-b/(2*a));
            } else {
                System.out.println("Phuong trinh Vo nghiem.");
            }
        }
    }
}
