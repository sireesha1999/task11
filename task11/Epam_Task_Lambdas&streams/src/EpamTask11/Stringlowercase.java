package EpamTask11;
import java.util.*;
import java.util.stream.Stream;
public class Stringlowercase {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no.of Strings:");
			int n=sc.nextInt();
			String s[]=new String[n];
			System.out.println("Enter strings: ");
			for(int i=0;i<n;i++) {
				s[i]=sc.next();
			}
			strings(s);
			
		}

		static void strings(String[] s) {
			Stream<String> st=Stream.of(s);
			System.out.println("strings starting with 'a' and length equalto 3 are : ");
			st.filter(p->p.startsWith("a")).filter(p->(p.length()==3)).peek(p->System.out.println(p)).count();
		}

	}


