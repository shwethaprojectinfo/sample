package patternProgramms;

public class HollowRectangle {
	public static void main(String arg[]) {
		int n=4;
		int m=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1 || j==m || i==n || j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
