public class bt03 {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + "Chia hết cho cả 3 và 5");
            }
        }
    }
}
