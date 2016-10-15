import java.util.Scanner;

/**
 * Created by Laptop88 on 10/9/2016.
 */
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] d = new String[10];

        // nhập 10 số nguyên
        System.out.println("Vui long nhap 10 ten:");
        for (int i = 0; i<10;i++) {
            d[i] = scanner.nextLine();

        }
        // Sắp xếp dãy số
        //Gọi biến trung gian để so sánh các số trong dãy là : btg
        String btg;
        for (int i = 0; i < 10 ; i++){
            for (int j = i+1  ;j < 10 ;j++)
            {if ( d[i].charAt(0) > d[j].charAt(0) ){
                btg = d[i];
                d[i] = d[j];
                d[j] = btg;
            }
            }
        }
        // in ra man hinh day so
        System.out.println("Day hoc sinh da duoc sap xep la: ");
        for ( int  i  = 0 ; i<10; i++){
            System.out.print(d[i]+"     ");
        }
        System.out.println("");
    }}
