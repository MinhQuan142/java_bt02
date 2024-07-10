import java.util.Scanner;

public class bt04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập số thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Vui lòng nhập số thứ hai lớn hơn >" + a + " : ");
        int b = sc.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i; //
        }

        System.out.println("Tổng các số trong khoảng từ " + a + " đến " + b + " là: " + sum);

    }
}