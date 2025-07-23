package Basic_Java;

public class Pattern {
    public static void main(String[] args) {
        // Pattern 1: Right-angled triangle
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print( "* ");
        //     }
        //     System.out.println();
        // }


        // Pattern 2: Inverted right-angled triangle
        // System.out.println();
        // for(int i=1; i<=5; i++){
        //     for(int j=5; j>=i; j--){
        //         System.out.print( "* ");
        //     }
        //     System.out.println();
        // }


        // Pattern 3: Pyramid pattern
        // for( int i=1; i<=5; i++ ){
        //     for(int j=1; j<=5-i; j++){
        //         System.out.print( " ");
        //     }
        //     for(int k=1; k<=2*i-1; k++){
        //         System.out.print( "*");
        //     }
        //     System.out.println();
        // }


        // Pattern 3: Hollow square pattern
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=5; j++){
        //         if(i == 1 || i == 5 || j == 1 || j == 5) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern 4: Diamond pattern
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=5-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=2*i-1; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=4; i>=1; i--){
        //     for(int j=1; j<=5-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=2*i-1; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Pattern 5: Number pattern
        // for(int i=1; i<=7; i++){
        //     for(int j=i; j<=7; j++){
        //         System.out.print( j );
        //     }
        //     for(int k=1; k<=i-1; k++){
        //         System.out.print( k );
        //     }
        //     System.out.println();
        // }    
        
        
        // Pattern 6: Hollow square with numbers
        // System.out.println("Hollow Square with Numbers:");
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=5; j++){
        //         if( i==1 || i==5 || j==1 || j==5 ) {
        //             System.out.print(j+" ");
        //         } else {
        //             System.out.print("  ");
        //         }    
        //     }
        //     System.out.println();
        // }


        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if((i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("2 ");

                }
            }
            System.out.println();
        }
    }
}
