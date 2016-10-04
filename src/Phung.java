import java.util.Scanner;

/**
 * Created by Laptop88 on 10/3/2016.
 */
public class Phung {
    public static void main(String[] args) {
        //start
        Scanner scanner = new Scanner (System.in);
        System.out.println("Chao ban, vui long nhap ten cua ban? :");
        String a = scanner.nextLine();
        System.out.println("Vui long nhap tuoi cua ban? :" );
        int i = scanner.nextInt();
        System.out.println(a);
        System.out.println(i);

        if(i==6) {
            System.out.println("dung");
        } else {
            System.out.println("sai");
        }
    }
}
