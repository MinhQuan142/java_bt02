import java.util.Scanner;
public class b101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Nhap 1 so bat ky");
            if (sc.hasNextInt()){
                int i = sc.nextInt();
                if (i % 3 == 0 && i % 5 == 0){
                    System.out.println("so nay chia het cho ca 3 va 5");
                    break;
                }else {
                    System.out.println("Khoong the dung so nay de chia het cho ca 5 va 3");
                }


            }else {
                System.out.println("Vuい long nha dung so");
                sc.next();
            }
        }
    }
}
