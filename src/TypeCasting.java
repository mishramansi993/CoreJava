public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * some notes 
		 * 1.Implicit(widening) 
		 * convert lower -> higher 
		 * byte->short,int,long
		 * 
		 * 2.Explicit 
		 * Convert Higher -> lower
		 * 
		 */
		
		
		 int value =9/2; float value2=10f/6f; double value3=10d/6d;
		 System.out.println("Value 1 ="+value);
		 System.out.println("Value 2 ="+value2);
		 System.out.println("Value 3 ="+value3);
	
		 
		 int marker=512; double percentage=marker*0.46f; //type casting
		 System.out.println("Percentage: "+percentage);
		 
		}
	
	}
