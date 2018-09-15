package Week2;
import java.net.ProxySelector;

public class ArrayTest {

	
		private final static int[] NUMBERS= { 54, 159, 35, 57, 52, 49, 59, 33, 48, 33, 40, 14, 58, 37, 47, 33, 29, 25, 25 }; 
		private final static String[] LETTERS = {"OD","TRS","B","E","P","PMC","FM","DM","BM","JT","JB","TS&ES","JM","DMB","LW","TRush","BON JOvi", "matchbox"};

		public static void  main(String [] args)
		{
			System.out.println(returnLetter(49)); 
			printArrays();
			System.out.println(Statement(returnLetter1(54)));
			System.out.println(Statement(returnLetter1(159)));
			System.out.println(Statement(returnLetter1(54)));
			System.out.println(Statement(returnLetter1(theMInimumValue())));
			getMIn(theMInimumValue());
			
		}

		public static void getMIn(int nu)
		{
		if(nu==theMInimumValue())
		{
			System.out.println("bob Dylan dylan");
		}
		}
		
		public static int theMInimumValue() {
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < NUMBERS.length; i++) {
				if (NUMBERS[i] < min) {
					min = NUMBERS[i];
				}
			}

			return min;
		}
		public static String returnLetter(int number)
		{
			
			
		    int index=0;
		    for(int i=0;i<NUMBERS.length;i++)
		    {
		        if(NUMBERS[i]==number)
		        {
		            index=i;
		            break;
		        }
		    }
		    if(index==NUMBERS.length)
		    return "Not";
		    else
		    return LETTERS[index];
		}
		public static int returnLetter1(int number)
		{
			
			
		    int index=0;
		    for(int i=0;i<NUMBERS.length;i++)
		    {
		        if(NUMBERS[i]==number)
		        {
		            index=i;
		            break;
		        }
		    }
		    if(index==NUMBERS.length)
		    return 0;
		    else
		    return NUMBERS[index];
		}
		public static void printArrays()
		{
			for(int i=0;i<NUMBERS.length;i++)
			{
				System.out.print(NUMBERS[i]+" ");
			}
			
		}
		public static String Statement(int number)
		
		{
		//int number=0;
		String gg="";
			if(number==54 )
			{
				gg=("Bob Dylan");
			}
			else if(number==159)
			{
				System.out.println("marly monroe");
			}
			else if(number==14)
			{
				System.out.println("marly monroe monroe");
			}
			else 
			{
				System.out.println("no more artist ");
			}
			return gg;  
		}
		
	}
	