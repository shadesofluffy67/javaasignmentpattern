public class InvertedRightTriangleStar {
    public static void main(String[] args) {
        int i;
        for( i=0;i<5;i++)
        {
            for( int j=4;j>i-1;j--)
            {
                System.out.print("*");

            }
            System.out.print("\n");
            
        }
    }
}
