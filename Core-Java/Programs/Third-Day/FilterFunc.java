package third;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterFunc {
	public static void main(String args[]) {
		
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("SK");
		arrayList.add("PO");
		arrayList.add("ML");
		arrayList.add("BH");
		
		List<String> list=arrayList.stream().map((n)->{
			return (n+" hello");
		}).collect(Collectors.toList());
		
		list.forEach((a)->
		{
		System.out.println(a);	
		});
		
		List<String> lost=arrayList.parallelStream().filter((n)->{
			return n=="SK";
		}).collect(Collectors.toList());
		
		Optional<String> l=arrayList.parallelStream().filter((n)->{
			return n==" ";
		}).findFirst();
		
		System.out.println(l);
		
		lost.forEach((a)->
		{
		System.out.println(a);	
		});
		
	}
}
