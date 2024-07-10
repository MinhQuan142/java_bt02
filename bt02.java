import java.util.Scanner;
public class bt02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap vao 1 so bat kyf tu 0 den 9");
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                if (i >=0 && i <=9 ) {
                    switch (i){
                        case 0:
                            System.out.println("Số Không");
                            break;
                        case 1:
                            System.out.println("Số Một");
                            break;
                        case 2:
                            System.out.println("Số Hai");
                            break;
                        case 3:
                            System.out.println("Số Ba");
                            break;
                        case 4:
                            System.out.println("Số Bốn");
                            break;
                        case 5:
                            System.out.println("Số Năm");
                            break;
                        case 6:
                            System.out.println("Số Sáu");
                            break;
                        case 7:
                            System.out.println("Số Bẩy");
                            break;
                        case 8:
                            System.out.println("Số Tám");
                            break;
                        case 9:
                            System.out.println("Số Chín");
                            break;

                    }
                    break;
                }else {
                    System.out.println("Vui Lòng nhập giá trị từ 0 đến 9");
                    scanner.next();
                }
            }else {
                System.out.println("nhập lại đúng sô  và số thuộc khoảng từ 0 đến 9");
                scanner.next();
            }
        }
    }

}
