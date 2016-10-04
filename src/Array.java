import java.util.Scanner;

/**
 * Created by Laptop88 on 10/3/2016.
 */
public class Array {
    public static void main(String[] args) {
        String[] a = new String[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<10; i++) {
            System.out.println("Vui long nhap ten hoc sinh thu: "+(i+1));
            a[i] = scanner.nextLine();

        }
        System.out.println("Danh sach lop hoc la: ");
        for(int i=0;i<10;i++) {
            System.out.println(a[i]);
    }}
}
