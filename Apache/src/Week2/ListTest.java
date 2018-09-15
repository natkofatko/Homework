package Week2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/*Question 1.We use Java.net package because it	provides classes for networking applications.  From java.net package we use URL class which
 *  supports basic access to data stored at a URL, and we use URLConnection which offers complete control over all aspects of working with a URL.
 *  For URL we used contructor to create a new URL from the given String.  
 *  For URLConnection we use openConnection method, which allows a client to communicate with the resource.  
 *  
 * Question 2. The constructor for the URL class can throw MalformedURLException 
 * 
 * Question 3. CSV stands for comma-separated values. It is a text file which allows data to be saved in a table structured format.Basically it is 
 * a text file containing information separated by commas. It can be open by google sheets and Microsoft Excel etc.  
 * 
 * Question 4.The URL:  "https://iaspub.epa.gov/enviro/efservice/getEnvirofactsUVHOURLY/ZIP/87101/CSV" 
 * allowes to get the Hourly UV Index forecast by entering ZIP Code.
 * After running the program I got result:   
 * "ORDER","ZIP CODE","DATE TIME","UV VALUE"
1,87101,SEP/10/2018 05 AM,0
10,87101,SEP/10/2018 02 PM,9
11,87101,SEP/10/2018 03 PM,7
12,87101,SEP/10/2018 04 PM,4
:: etc
:: etc
After copying the URL from the program and pasting it into new browser I got a new file EnvirofactsRestAPI, which was saved on my PC as Microsoft Excel 
Comma Separeted Values File format.    

 * 
 * 
 * Question 5. Code is represent belove. 
 * Output:
 * 
Pottstown
"CITY","STATE","UV VALUE","UV ALERT"POTTSTOWN,PA,1,0
BlueBell
"CITY","STATE","UV VALUE","UV ALERT"
Philadelphia
"CITY","STATE","UV VALUE","UV ALERT"PHILADELPHIA,PA,1,0
Wayne
"CITY","STATE","UV VALUE","UV ALERT"WAYNE,PA,1,0
Paoli
"CITY","STATE","UV VALUE","UV ALERT"PAOLI,PA,1,0
Norristown
"CITY","STATE","UV VALUE","UV ALERT"NORRISTOWN,PA,1,0
 * 					
 * 
 * */


public class ListTest{
public static void main(String[] args) throws IOException {
	
	//This is the list of our Location
	ArrayList<String> aList= new ArrayList<>(); 
	aList.add("Pottstown"); 
	aList.add("BlueBell");
	aList.add("Philadelphia"); 
	aList.add("Wayne"); 
	aList.add("Paoli");
	aList.add("Norristown");
	
	//This is the while loop which will run throught the array list of locations and get the data from the EPA for each. 
		System.out.println("While Loop");
		int count = 0;
		while (aList.size() > count) {
			System.out.println(aList.get(count));
			//Since we are getting the Hourly UV Index forecast by City and State URL will have following format:  
			URL epaServer = new URL("https://iaspub.epa.gov/enviro/efservice/getEnvirofactsUVDAILY/CITY/"
					+ aList.get(count) + "/STATE/pa/CSV");

			URLConnection ac = epaServer.openConnection();
			InputStreamReader inputStream = new InputStreamReader(ac.getInputStream(), "UTF-8");
			BufferedReader buffereReader = new BufferedReader(inputStream);
			StringBuilder responseBuilder = new StringBuilder();
			String line;

			while ((line = buffereReader.readLine()) != null) {
				responseBuilder.append(line + "");

			}
			buffereReader.close();
			System.out.println(responseBuilder.toString());

			count++;

		}

	}
}