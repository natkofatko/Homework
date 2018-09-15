package Week1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class API_oracticeEPA {

	public static void main(String[]args) throws IOException 
	{
	
		String [] zipCodes={};
		
		URL epaServer = new URL("https://iaspub.epa.gov/enviro/efservice/getEnvirofactsUVDAILY/CITY/albuquerque/STATE/nm/CSV"); 
		URL epaServer1 = new URL("https://iaspub.epa.gov/enviro/efservice/getEnvirofactsUVDAILY/CITY/paoli/STATE/pa/CSV"); 
		URL epaServer2 = new URL("https://iaspub.epa.gov/enviro/efservice/getEnvirofactsUVDAILY/CITY/chesterbrook/STATE/pa/CSV"); 
		//"https://iaspub.epa.gov/enviro/efservice/getEnvirofactsUVHOURLY/ZIP/87101/CSV"
		//https://www.epa.gov/enviro/web-services#hourlyzip
		
		
		URLConnection ac = epaServer.openConnection(); 
		URLConnection ac1 = epaServer1.openConnection(); 
		URLConnection ac2 = epaServer2.openConnection(); 
		InputStreamReader inputStream = new InputStreamReader(ac.getInputStream(), "UTF-8");
		InputStreamReader inputStream1 = new InputStreamReader(ac1.getInputStream(), "UTF-8");
		InputStreamReader inputStream2 = new InputStreamReader(ac2.getInputStream(), "UTF-8");
		BufferedReader buffereReader = new BufferedReader(inputStream); 
		BufferedReader buffereReader1 = new BufferedReader(inputStream1); 
		BufferedReader buffereReader2 = new BufferedReader(inputStream2); 
		StringBuilder responseBuilder = new StringBuilder(); 
		StringBuilder responseBuilder1 = new StringBuilder(); 
		StringBuilder responseBuilder2 = new StringBuilder(); 
		
		String line; 
		
		while((line=buffereReader.readLine())!=null)
		{
			responseBuilder.append(line+"\n"); 
			
		}
		buffereReader.close();
		System.out.println(responseBuilder.toString());
		while((line=buffereReader1.readLine())!=null)
		{
			responseBuilder1.append(line+"\n"); 
			
		}
		//buffereReader1.close();
		System.out.println(responseBuilder1.toString());
		
		while((line=buffereReader2.readLine())!=null)
		{
			responseBuilder2.append(line+"\n"); 
			
		}
		buffereReader2.close();
		System.out.println(responseBuilder2.toString());
		
	}
}
