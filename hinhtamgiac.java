import java.util.Scanner;

/**
 * Created by Laptop88 on 10/9/2016.
 */
public class hinhtamgiac {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("vui long nhap gia tri a:");
float a = scanner.nextInt();
System.out.println("Vui long nhap gia tri b:");
float b = scanner.nextInt();
System.out.println("Vui long nhap gia tri c:");
float c = scanner.nextInt();
if ( (a + b)>c ) {
    if ((a + c) > b) {
        if ((b + c) > a) {
            System.out.println("3 so tren LA 3 canh cua 1 tam giac");}

 else{System.out.println("3 so tren KHONG phai 3 canh cua 1 tam giac");}
    }
 else { System.out.println("3 so tren KHONG phai 3 canh cua 1 tam giac");}
    }
  else { System.out.println("3 so tren KHONG phai 3 canh cua 1 tam giac");}
}}