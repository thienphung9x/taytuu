/**
 * Created by Laptop88 on 10/19/2016.
 */
public class SortName {
    public static void main(String[] args) {
        String[][] mang = new String[5][2];
        mang[0][0] = "zep trai";
        mang[0][1] = "16";
        mang[1][0] = "hoa";
        mang[1][1] = "15";
        mang[2][0] = "onghanh";
        mang[2][1] = "8";
        mang[3][0] = "nga";
        mang[3][1] = "17";
        mang[4][0] = "chi";
        mang[4][1] = "19";


        mang = sortname(mang);
        InManHinh(mang);
    }

    static String[][] sortname(String[][] mang) {
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (mang[i][0].charAt(0) > mang[j][0].charAt(0)) {
                    String tempi = mang[i][0];
                    String tempj = mang[i][1];
                    mang[i][0] = mang[j][0];
                    mang[i][1] = mang[j][1];
                    mang[j][0] = tempi;
                    mang[j][1] = tempj;
                }
            }

        }


        return mang;
    }

    static void InManHinh(String[][] mang) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mang[i][j]+" ");
            }
            System.out.println();
        }
    }
}