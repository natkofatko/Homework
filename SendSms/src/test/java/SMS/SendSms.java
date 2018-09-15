package SMS;

/*Send an SMS Using Java. I found this API on the website https://www.textmagic.com/docs/api/java/
 * 
 * The TextMagic API Java wrapper already include all the necessary API commands and tests 
 * to send an SMS using Java.
 * 
 * There are two ways to install TextMagic java wrapper. 
 * 
 * First: Installing the TextMagic Java wrapper from the GitHub repository using git. 
 * by running the following commands: 
 * git clone git://github.com/textmagic/textmagic-rest-java.git
	cd textmagic-rest-java
	mvn install
	
 * Second is adding the following dependency to the existing Maven project, 
 * <dependency>
    <groupid>com.textmagic.sdk</groupid>
    <artifactid>textmagic-java-sdk</artifactid>
    <version>1.2.0</version>
</dependency>
 *I did the second option, I added dependency to the pom.xml. 
 *
 *  What I needed to do it was just creating TextMagic account in order to obtain <API key> and <username> 
 * 
 * 	18884100532 thats a number where sms has been sent. Unfortunatelly I could not send the message on my own 
 * phone. There is an option buy phone number, but I did not want to use it. 
 * 
 * It seems to work. 
 * 
 *     
 * 
 */

import java.util.Arrays;

import com.textmagic.sdk.RestClient;
import com.textmagic.sdk.RestException;
import com.textmagic.sdk.resource.instance.TMNewMessage;

public class SendSms {

	public static void main(String[] args) throws RestException {
		RestClient client = new RestClient("userName", "T3JG2MzsUsLNl4KklRdwFyAPIKEY");

		TMNewMessage message = client.getResource(TMNewMessage.class);
		message.setText("Hello from CIS111B"); //// </apiv2_key></username>
		message.setPhones(Arrays.asList(new String[] { "18884100532" }));
		try
		{
			message.send();
		} 
		catch ( Exception e) {
			
			System.out.println(e.getMessage());

		}
		
		System.out.println(message.getId());

	}
}


