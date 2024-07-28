//NAME: Dnyanesh More
//Roll NO:60


class Bank
{  
	int getRateOfInterest()
	{
		System.out.println("inside Bank: ");
		return 0;
	}  
}  
 
class SBI extends Bank
{  
	int getRateOfInterest()
	{
		System.out.println("inside SBI:");
		return 8;
	} 
}  
class ICICI extends Bank
{  
	int getRateOfInterest()
	{
		System.out.println("inside ICIC: ");
		return 7;
	}  
}  
class AXIS extends Bank
{  
	int getRateOfInterest()
	{
		System.out.println("INSIDE AXIS : ");
		return 9;
	}  
}  
  
 class Overriding
{  
public static void main(String args[]){  
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
}   

}
