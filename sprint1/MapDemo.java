// Simple illustration of different types of map and function related to maps.
import java.util.*;
import java.lang.*;
import java.io.*;

class MapDemo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		            //Creating a HashMap
                Map<Integer, String> mapHttpErrors = new HashMap<>();
                 
                mapHttpErrors.put(200, "OK");
                mapHttpErrors.put(303, "See Other");
                mapHttpErrors.put(404, "Not Found");
                mapHttpErrors.put(500, "Internal Server Error");
                 
                System.out.println(mapHttpErrors);
                // Output:{404=Not Found, 500=Internal Server Error, 200=OK, 303=See Other}

                //Creating a LinkedHashMap:
                Map<String, String> mapContacts = new LinkedHashMap<>();
                 
                mapContacts.put("0169238175", "Tom");
                mapContacts.put("0904891321", "Peter");
                mapContacts.put("0945678912", "Mary");
                mapContacts.put("0981127421", "John");
                 
                System.out.println(mapContacts);
                //Output:{0169238175=Tom, 0904891321=Peter, 0945678912=Mary, 0981127421=John}
                 
                //Creating a TreeMap:
                Map<String, String> mapLang = new TreeMap<>();
                 
                mapLang.put(".c", "C");
                mapLang.put(".java", "Java");
                mapLang.put(".pl", "Perl");
                mapLang.put(".cs", "C#");
                mapLang.put(".php", "PHP");
                mapLang.put(".cpp", "C++");
                mapLang.put(".xml", "XML");
                 
                System.out.println(mapLang);
                //Output:{.c=C, .cpp=C++, .cs=C#, .java=Java, .php=PHP, .pl=Perl, .xml=XML}
                 
                 
                // Performing Basic Operations on a Map

                //Associating a value with a key
                Map<Integer, String> mapHttpError = new HashMap<>();
                mapHttpErrors.put(400, "Bad Request");
                mapHttpErrors.put(304, "Not Modified");
                mapHttpErrors.put(200, "OK");
                mapHttpErrors.put(301, "Moved Permanently");
                mapHttpErrors.put(500, "Internal Server Error");
                 
                //Getting a value associated with a specified key
                String status301 = mapHttpError.get(301);
                System.out.println("301: " + status301);
                //Output:301: Moved Permanently
                 
                //Checking if the map contains a specified key
                if (mapHttpError.containsKey("200")) {
                    System.out.println("Http status 200");
                }
                //Output:Found: Http status 200
                 
                //Checking if the map contains a specified value
                if (mapHttpError.containsValue("OK")) {
                    System.out.println("Found status OK");
                }
                //Output:Found status OK
                 
                //Removing a mapping from the map
                String removedValue = mapHttpError.remove(500);
                 
                if (removedValue != null) {
                    System.out.println("Removed value: " + removedValue);
                }
                //Output:Removed value: Internal Server Error

                 
                //Replacing a value associated with a specified key
                System.out.println("Map before: " + mapHttpErrors);
                 
                mapHttpError.replace(304, "No Changes");
                 
                System.out.println("Map after: " + mapHttpErrors);
                //Output:
                //Map before: {400=Bad Request, 304=Not Modified, 200=OK, 301=Moved Permanently}
                //Map after: {400=Bad Request, 304=No Changes, 200=OK, 301=Moved Permanently}

                //Getting the size of the map
                int size = mapHttpErrors.size();
                //Output:Number of HTTP status code: 5
                 
                //Checking if the map is empty
                if (mapHttpErrors.isEmpty()) {
                    System.out.println("No Error");
                } else {
                    System.out.println("Have HTTP Errors");
                }
                //Output:Have HTTP Errors
                 
                //Iterating Over a Map (using Collection views)
                Map<String, String> mapCountryCodes = new HashMap<>();
                 
                mapCountryCodes.put("1", "USA");
                mapCountryCodes.put("44", "United Kingdom");
                mapCountryCodes.put("33", "France");
                mapCountryCodes.put("81", "Japan");
                 
                Set<String> setCodes = mapCountryCodes.keySet();
                Iterator<String> iterator = setCodes.iterator();
                 
                while (iterator.hasNext()) {
                    String code = iterator.next();
                    String country = mapCountryCodes.get(code);
                 
                    System.out.println(code + " => " + country);
                }
                 
                //Output:
                //44 => United Kingdom
                //33 => France
                //1 => USA
                //81 => Japan
                 

                Collection<String> countries = mapCountryCodes.values();
                 
                for (String country : countries) {
                    System.out.println(country);
                }

                //Output:
                //United Kingdom
                //France
                //USA
                //Japan
                 

                Set<Map.Entry<String, String>> entries = mapCountryCodes.entrySet();
                 
                for (Map.Entry<String, String> entry : entries) {
                    String code = entry.getKey();
                    String country = entry.getValue();
                 
                    System.out.println(code + " => " + country);
                }
                //Output:
                //44 => United Kingdom
                //33 => France
                //1 => USA
                //81 => Japan

                mapCountryCodes.forEach(
                    (code, country) -> System.out.println(code + " => " + country));
                //Output:
                //44 => United Kingdom
                //33 => France
                //1 => USA
                //81 => Japan

                 
                // Performing Bulk Operations with Maps
                mapHttpErrors.clear();
                System.out.println("Is map empty? " + mapHttpErrors.isEmpty());
                //Output:Is map empty? true
                 

                Map<Integer, String> countryCodesEU = new HashMap<>();
                 
                countryCodesEU.put(44, "United Kingdom");
                countryCodesEU.put(33, "France");
                countryCodesEU.put(49, "Germany");
                 
                Map<Integer, String> countryCodesWorld = new HashMap<>();
                 
                countryCodesWorld.put(1, "United States");
                countryCodesWorld.put(86, "China");
                countryCodesWorld.put(82, "South Korea");
                 
                 
                System.out.println("Before: " + countryCodesWorld);
                 
                countryCodesWorld.putAll(countryCodesEU);
                 
                System.out.println("After: " + countryCodesWorld);
                //Output:
                //Before: {1=United States, 82=South Korea, 86=China}
                //After: {1=United States, 33=France, 49=Germany, 82=South Korea, 86=China, 44=United Kingdom}
                 
                //Concurrent Maps
                Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

                Set<Integer> keySet = map.keySet();
                 
                synchronized (map) {
                    Iterator<Integer> iterators = keySet.iterator();
                 
                    while (iterators.hasNext()) {
                        Integer key = iterators.next();
                        String value = map.get(key);
                    }
                }

	}
}
