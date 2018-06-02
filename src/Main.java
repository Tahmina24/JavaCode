import java.util.Scanner;


public class Main {

	static Scanner ob=new Scanner(System.in);
	public static void main(String []ar)
	{
		char ch = 0;
		int n;
		 do
		 {
			 System.out.println("Enter Your Choice");
			 System.out.println("\t\t\t1.Current Medication");
			 System.out.println("\t\t\t2.New Medication ");
			 System.out.println("\t\t\t3.Formulary");
			 System.out.println("\t\t\t4.Check All");
			 n=ob.nextInt();
             if(n==1)
             {
            	 CurrentMedication medication=new CurrentMedication();
            	 medication.getData();
             }
             else if(n==2)
             {
            	 NewMedication med=new NewMedication();
            	 med.getData();
             }
             else if(n==3)
             {
            	 Formularity formula=new Formularity();
            			 formula.getData();
             }
             System.out.println("Do you Continue your work?");
             ch=ob.next().charAt(0);

			 
		 }while(ch=='y');
	}
}
