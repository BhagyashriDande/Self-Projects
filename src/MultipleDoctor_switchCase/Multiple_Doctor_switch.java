package MultipleDoctor_switchCase;
import java.util.*;

class Doctor
{
    private String cityname;
	private String doctorname;
    private float id;
    private long fees;
    private int rank;
	
	public void setdata(int id, String cityname, String doctorname, long fees, int rank)
	{
		this.id=id;
		this.cityname=cityname;
		this.doctorname=doctorname;
		this.setFees(fees);
		this.setRank(rank);
	}
	
	public void displaydata()	  
	{
		System.out.println("\n\nId : "+id);
		System.out.println("City Name : "+cityname);
		System.out.println("Hospital Name : "+doctorname);
		System.out.println("Fees : "+getFees());
		System.out.println("Rank : "+getRank());
		System.out.println("\n---------------------------------------------------------------------------\n\n");
	}

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}



	
		
	
};

public class Multiple_Doctor_switch
{

	public static void main(String[] args) 
     {
		String cityname;
		String doctorname;
		int id;
		long fees;
		int rank;
		
	    Scanner s=new Scanner(System.in);
	    Doctor d[]=new Doctor[5];
	    System.out.println("Enter the details of the Doctors");
	    for(int i=0; i<5; i++)
	      { 
		      System.out.printf("\n\nEnter Id, City Name, Hospital Name, Fees and Rank\n");
		      id=s.nextInt();
		      cityname=s.next();	
		              s.nextLine();
		      doctorname=s.next();
		      fees=s.nextLong();
		      rank=s.nextInt();
		      
              d[i]=new Doctor();             //new object create multiple object to store the multiple doctors data		
		      d[i].setdata(id, cityname, doctorname, fees, rank);       //method call
	      }
	    

	    
	    int choice;
	    do {
	    	
		    System.out.printf("\n\n1. Display data of all Doctors Detail\n");
		    System.out.printf("2. Sort Data of Hospital data in decending order by rank\n");
		    System.out.printf("3. Display data of doctor having maximum fees\n");
		    System.out.printf("4. Search doctor by city\n");
		    System.out.printf("5. Search doctor by maximum fees and highest rank\n");
	        System.out.printf("Enter your choice\n");
	        choice=s.nextInt();
	    
	    switch(choice)
	    {
	    case 1:
		      System.out.printf("Record of the Doctors\n");
			    for(int i=0; i<5; i++)
			     { 
		             d[i].displaydata();
			     }	
			    System.out.println("\n\n******************************************************************************\n\n");
	    break;
	    
	    case 2:
	    	  for(int i=0; i<d.length; i++)
	    	  {
	    		Doctor temp=new Doctor();      //object temp.sorting
		    	for(int j=i+1; j<d.length; j++)
		    	 {
		    		if(d[i].getRank() < d[j].getRank())
		    	    	{
		    		    	temp=d[i];
		    			    d[i]=d[j];
		    			    d[j]=temp;
		    		    }
		    	 }
	      	  }
		        System.out.printf("Record According to the fees structure\n");
			    for(int i=0; i<5; i++)
			     { 
		             d[i].displaydata();
			     }	
			    System.out.println("\n\n******************************************************************************\n\n");

		break;
		
		case 3:
			long max=d[0].getFees();
	    	  
			for(int i=0; i<d.length; i++)
	    	  {
		    	for(int j=i+1; j<d.length; j++)
		    	 {
		    		if(d[i].getFees() > max)
		    	    	{
		    		    	max=d[i].getFees();
		    		    }
		    	 }
	      	  }
			
			
	        System.out.printf("\n\nRecord of Doctor having maximum fees\n");
		    for(int i=0; i<5; i++)
		     { 
		    	if(max==d[i].getFees())
		    	{
	             d[i].displaydata();		    
		    	}	
		     }
		    System.out.println("\n\n******************************************************************************\n\n");

		break;
		
	    case 4:
		    System.out.printf("\nEnter the name of city\n");
		    String findcitydoc=s.next();
		    
		    for(int i=0; i<5; i++)
		     { 
		    	if(findcitydoc.equals(d[i].getCityname()))
		    	{
		    		System.out.println("\nRecords of doctor\n");
	             d[i].displaydata();		    
		    	}	
		     }
		    System.out.println("\n\n******************************************************************************\n\n");

		break;
		
	    case 5:
		   
			   float maxrank=d[0].getRank();	    	  
				for(int i=0; i<d.length; i++)
		    	  {
			    	for(int j=i+1; j<d.length; j++)
			    	 {
			    		if(d[i].getRank() > maxrank)
			    	    	{
			    		    	maxrank=d[i].getFees();
			    		    }
			    	 }
		      	  }
				
				
		        System.out.printf("\n\nRecord of Doctor having maximum rank\n");
			    for(int i=0; i<5; i++)
			     { 
			    	if(maxrank==d[i].getFees())
			    	{
		             d[i].displaydata();		    
			    	}	
			     }
	    	
	    	
		   long max1=d[0].getFees();	    	  
			for(int i=0; i<d.length; i++)
	    	  {
		    	for(int j=i+1; j<d.length; j++)
		    	 {
		    		if(d[i].getFees() > max1)
		    	    	{
		    		    	max1=d[i].getFees();
		    		    }
		    	 }
	      	  }
			
			
	        System.out.printf("\n\nRecord of Doctor having maximum fees\n");
		    for(int i=0; i<5; i++)
		     { 
		    	if(max1==d[i].getFees())
		    	{
	             d[i].displaydata();		    
		    	}	
		     }
		    System.out.println("\n\n******************************************************************************\n\n");

		break;
		
		default:
			System.out.printf("Wrong choice\n");
		    System.out.println("\n\n******************************************************************************\n\n");

	    }
	    
	    }while(true);       
	   
	}

}
