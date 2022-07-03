package stringdisplay;

public class spacetriangle {
	
	 public static void main(String[] args) {
			
			int i,j,n=5;
			System.out.println("Display Triangle");	
		
			
			{	
				for (i=0;i<n;i++)
				{
						
				for (j=2*(n-i);j>=0;j--)
				{	
					System.out.print(" ");
					
				}	
																
			//for (i=1;i<=n;i++)
			
				
				for (j=0;j<=i;j++)
					
				{
						System.out.print("*");
				}
				System.out.println(" ");								
				 
		}
				
			
}
}
}


