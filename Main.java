//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//int a = 5;
//if(a > 5) {
//    System.out.println("da vao if");
//}else if (a == 5) {
//    System.out.println("da vao else");
//
//}else{
//            System.out.println("da vao case thu 3");
//        }
//
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập vào số nguyên từ 2 đến 8: ");
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                if (i >= 2 && i <= 8) {

                    switch (i) {
                        case 2:
                            System.out.println("Thứ 2");
                            break;
                        case 3:
                            System.out.println("Thứ 3");
                            break;
                        case 4:
                            System.out.println("Thứ 4");
                            break;
                        case 5:
                            System.out.println("Thứ 5");
                            break;
                        case 6:
                            System.out.println("Thứ 6");
                            break;
                        case 7:
                            System.out.println("Thứ 7");
                            break;
                        case 8:
                            System.out.println("Chủ Nhật");
                            break;
                    }
                    break;
                } else {
                    System.out.println("Giá trị phải từ 2 đến 8.");
                    scanner.next();
//                    System.out.println("toi day");
                }

            } else {
                System.out.println("Vui lòng nhập lại đúng số nguyên ");
                scanner.next();
            }
        }

    }
}