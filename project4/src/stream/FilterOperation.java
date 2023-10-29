package stream;
import java.util.Arrays;
import java.util.List;

public class FilterOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>s2=Arrays.asList(2,3,4,5,6,7);
		System.out.println("filter odd number");
		s2.stream().filter(num->num%2==1).forEach(System.out::println);
		

	}

}
