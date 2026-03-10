package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamsExample {

	@Test
	public void sample() {
		Long l=Stream.of("America","Austria","India","Australia").filter(s->s.startsWith("A")).count();
		System.out.println(l);
		
		Stream.of("america","austria","India","australia").filter(s->s.startsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//we can convert Arrays to ArrayList by using
		
		System.out.println("****************");
		
		List<String> name=Arrays.asList("america","austria","India","australia");
		name.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//here Arrays are converted to List and using stream we can function
		List<String> names=Arrays.asList("vivek","pavan","Tanmay","koushik","Tejas","Tarun");
		names.stream().filter(s->s.startsWith("T")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
	
		
		ArrayList<String> ls=new ArrayList();
		ls.add("America");
		ls.add("Africa");
		
		Stream<String> newStream = Stream.concat(name.stream(),ls.stream());
	//	newStream.forEach(s->System.out.println(s));
		//in above line we used Streams again we cannot do modification hence i used comments above then sorted and 
		//printed below
		//even we can sort above
		
		//newStream.sorted().forEach(s->System.out.println(s));
		
		
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("america"));//here i can use concat also
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	
	
	}
	
	@Test
	public void findUniqueNumberAndSort() {
		
		int[] integer= {2,2,3,2,4,5};
		System.out.println("##########");
		Arrays.stream(integer).distinct().sorted().forEach(s->System.out.println(s));
		System.out.println("$$$$$$$$$$");
		
		//note we can use limit(requirednumberofresults) to get perticular set of values in stream output
		
		//If i want to get the String sorted and get the third index results.
		
		Stream<String> names=Stream.of("idli","vada","chutney","dosa","pongal");
		List<String> output=names.distinct().sorted().collect(Collectors.toList());//here we are collecting the
		//stream output and converting to list using collect() and using the index or we can use limit(3) from Streams
		System.out.println(output.get(2));
		
		//map() helps to get new Stream contents
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
