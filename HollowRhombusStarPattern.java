
public class HollowRhombusStarPattern {
    public static void main(String[] args) {
            
        for( int i=0;i<5;i++)
           {
            for(int k=4;k>i;k--)
            {
                System.out.print( " ");
            }
            for( int j=0;j<5;j++)
            {
                if(i==0 ||i==4 ||j==0||j==4)
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
              
                }
            System.out.print("\n");
            
        }

    }
}

