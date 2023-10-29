package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] values=new Integer[] {3,4,7,8};
		Stream<Integer> stream=Arrays.stream(values);
		//map function
		
		System.out.println("square of no"+Arrays.toString(values));
		stream.map(num->num*num).forEach(System.out::println);
		//limit returns first two elements
		
		System.out.println("first two elements");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		//limit skip first 2 elements
		System.out.println("skip first two elements");
		Arrays.stream(values).skip(2).forEach(System.out::println);
		List <Integer>list=Arrays.asList(1,1,3,4,5,3,2);
		//distinct elements
		System.out.println("Distinct elements");
		list.stream().distinct().forEach(System.out::println);
		//count distinct
		long c=list.stream().distinct().count();
		System.out.println("count distinct numbers");
		System.out.println(c);
		List<String> words=Arrays.asList("Apple","Mango","Orange");
		//creating a stream  from a list
		Stream<String> stream1= words.stream();
		//map
		System.out.println("Strings in uppercase:");
		List<String> s1=stream1.map(str ->str.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);
		
		
	}
}
