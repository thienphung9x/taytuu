import java.util.Scanner;

/**
 * Created by Laptop88 on 10/9/2016.
 */
public class sapxepdayso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] a = new int[10];

        // nhập 10 số nguyên
        System.out.println("Vui long nhap 10 so:");
        for (int i = 0; i<10;i++) {
            a[i] = scanner.nextInt();

        }
        // Sắp xếp dãy số
        //Gọi biến trung gian để so sánh các số trong dãy là : btg
        int btg;
        for (int i = 0; i < 10 ; i++){
            for (int j = i+1  ;j < 10 ;j++)
            {if ( a[i] > a[j] ){
                btg = a[i];
                a[i] = a[j];
                a[j] = btg;
            }
            }
    }
    // in ra man hinh day so
        System.out.println("Day so da duoc sap xep la: ");
    for ( int  i  = 0 ; i<10; i++){
                System.out.print(a[i]+"     ");
        }
        System.out.println("");
}}
