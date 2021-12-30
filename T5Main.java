import java.util.Scanner;

public class T5Main {
	
	public static int extArElement (int[] ar, String ext) {
		int extAr = ar[0];
		   for (int i = 1; i < ar.length; i++) {
			   if (ext.equals("min")) if (ar[i] < extAr) extAr = ar[i];
			   if (ext.equals("max")) if (ar[i] > extAr) extAr = ar[i];
			   if (!ext.equals("min") & !ext.equals("max")) throw new IllegalArgumentException("String argument to be 'min' OR 'max' only");
		   }
		return extAr;
	}
	
   public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);	   
	   int[] arrI = new int[10];
	   T5Element T5e = new T5Element();
	   T5e.setLB(0);
	   T5e.setUB(Integer.MAX_VALUE);
	  try {
		   System.out.println("Enter lower range bound > 0:");
		  T5e.setLB(T5e.T5getElement(in.nextInt()));
	   } catch (T5Exception e) {
		  System.out.println(e.getMessage());
		  System.out.println(e.getNumber());
	  }
	   try {
		   System.out.println("Enter upper range bound > lower bound AND < Integer.MAX_VALUE:");
		   T5e.setUB(T5e.T5getElement(in.nextInt()));
	   } catch (T5Exception e) {
		   System.out.println(e.getMessage());
		   System.out.println(e.getNumber());
	   }
	   try {
	   		System.out.println("Enter 10 int elements each one to be > lower range bound AND < upper range bound:");
	   		for (int i = 0; i < arrI.length; i++) {
				arrI[i] = T5e.T5getElement(in.nextInt());
			}
	   } catch (T5Exception e) {
		   System.out.println(e.getMessage());
		   System.out.println(e.getNumber());
	   }
	   System.out.println("min element = "+extArElement(arrI, "min")+", max element = "+extArElement(arrI, "max"));
   }
}

