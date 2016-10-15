import java.util.Scanner;

/**
 * Created by Laptop88 on 10/10/2016.
 */
public class sapxepten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nhap 5 ten nguoi dung, sap xep ten do theo thu tu a-z
        String[] ds = new String[5];
        System.out.println("Vui long nhap ten hoc sinh :");
        for (int i = 0; i < 5; i++) {
            ds[i] = scanner.nextLine();

        }

        //sap xep danh sach hoc sinh
        String trunggian ;


        for ( int i = 0; i<5 ; i++)
            {for ( int j=i+1; j<5; j++)
                {if (   ds[i].charAt(0) > ds[j].charAt(0) ){
            trunggian = ds[i];
            ds[i] = ds[j];
            ds[j] = trunggian;
        }
        }
            for (   i  = 0 ; i<5; i++){
                System.out.print(ds[i]+"     ");
            }
            System.out.println("");

    }
}}