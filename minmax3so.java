import java.util.Scanner;

/**
 * Created by Laptop88 on 10/9/2016.
 */
public class minmax3so {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("vui long nhap gia tri a:");
        float a = scanner.nextInt();
        System.out.println("Vui long nhap gia tri b:");
        float b = scanner.nextInt();
        System.out.println("Vui long nhap gia tri c:");
        float c = scanner.nextInt();
        if ( a>b) {
            if (a > c) {
                System.out.println("a la so lon nhat");
            }
        else {
                System.out.println("c la so lon nhat");
            }}
        else {
                if (b > c) {
                    if (b > a) {
                        System.out.println("b la so lon nhat.");
                    }else {
                        System.out.println(" a la so lon nhat");
                }}
                else {
                        System.out.println("c la so lon nhat ");

                }
            }
        }}

