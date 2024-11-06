
import java.util.Scanner;

public class tahunKabisat05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Tahun = ");
        int tahun = sc.nextInt();

        if (tahunkabisat(tahun)){
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun kabisat");
        }
    }
        public static boolean tahunkabisat(int tahun){
            if (tahun % 4 == 0){
                if (tahun % 100 == 0) {
                    return tahun % 400 == 0;
                }
                return true;
            }
            return false;
        }
    }

