public class HollowInvertedRightTriangleStarPattern {
      public static void main(String[] args) {
        

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                
                if (j == 0 || j == i || i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}