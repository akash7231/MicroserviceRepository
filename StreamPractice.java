import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) 
	{
		List<String> list=Arrays.asList("dda","wsfw","adw");
		
		//List<String> newList=list.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
		List<String> newList=list.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
		//List<String> newList=list.stream().sorted().collect(Collectors.toList());

     //System.out.println(newList);
    newList.forEach(e->{System.out.println(e);});
    
    ////////////////////
	/*
	 * Stream<String[]> str = Stream .of(new String[][] { { "GFG", "GeeksForGeeks"
	 * }, { "g", "geeks" }, { "G", "Geeks" } });
	 * 
	 * // Convert the String to Map // using toMap() method Map<String, String> map
	 * = str.collect( Collectors.toMap(p -> p[0], p -> p[1]));
	 * 
	 * // Print the returned Map System.out.println("Map:" + map);
	 */
    
 // Create a String with repeated keys
    Stream<String[]>
        str = Stream
                  .of(new String[][] { { "GFG", "GeeksForGeeks" },
                                       { "g", "geeks" },
                                       { "GFG", "geeksforgeeks" } });

    // Get Map from String
    // using toMap() method
    Map<String, String>
        map = str
                  .collect(Collectors
                               .toMap(p -> p[0], p -> p[1], (s, a) -> s + ", " + a));
    
    
   String str="abc";

		
	}

}
