package tutorialApp;

public class LoopPyramid {
 static int n=5;
	public static void main(String[] args) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}
