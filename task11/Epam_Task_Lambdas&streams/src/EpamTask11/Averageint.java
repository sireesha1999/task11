package EpamTask11;
import java.util.*;
import java.util.stream.IntStream;
public class Averageint {
		public static double Average(int[] a) {
			IntStream st=IntStream.of(a);
			
			OptionalDouble obj=st.average();
			if(obj.isPresent()) {
				return obj.getAsDouble();
			}
			return 0;
			
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of integers:");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter "+n+" integers one by one : ");
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			System.out.println("Average of list of numbers is : "+Average(a));
		}

}
