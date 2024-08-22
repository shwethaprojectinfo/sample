package patternProgramms;

public class InvertedHalfPyramid180 {
	
public static void main(String arg[]) {
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			//for space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
          }
			//for Star
			for(int j=1;j<=i;j++) {
            System.out.print("*");				
			}
			System.out.println();
		}
	}

}
