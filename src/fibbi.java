	import java.util.Scanner;
	public class fibbi {
		public static void main(String [] args) {
			Scanner scanner = new Scanner (System.in);
			System.out.println("the just put number");
			int count = scanner.nextInt();
			int firstTerm = 0;
			int secondTerm = 1;
			for (int i= 1; i<=count;i++) {
				System.out.println(firstTerm+"");
				int nextTerm = firstTerm+secondTerm;
				firstTerm = secondTerm;
				secondTerm = nextTerm;
			}
			
			
		}
	
	}
