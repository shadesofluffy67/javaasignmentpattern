public class HalfDiamondStarPattern {
    public static void main(String[] args) {
        for (int j = 1; j <= 5; j++) {
            for (int i = 0; i < j; i++) {
                System.err.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5-1; j++) {
                System.out.print("*");
            }
            System.err.println();
        }
    }
}
