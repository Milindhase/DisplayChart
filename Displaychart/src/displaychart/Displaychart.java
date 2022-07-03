package displaychart;

public class Displaychart {
	
	 public static void main(String[] args) {
	
	int i,j,n=10;
	System.out.println("Display Multiplication Chart");
	
	for (i=1;i<=n;i++)
	{
		
		for (j=1;j<=n;j++)
		{	
			
		
		System.out.print  (  i  *  j );
		System.out.print("  "); 
 }
		System.out.println("  ");
		System.out.println("  ");
		
 }
}
}


import java.io.*;
 
// Java code to demonstrate star pattern
public class GeeksForGeeks
{
    // Function to demonstrate printing pattern
    public static void printStars(int n)
    {
        int i, j;
 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
 
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for(j=2*(n-i); j>=0; j--)
            {
                // printing spaces
                System.out.print(" ");
            }
            
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }
             
            // ending line after each row
            System.out.println();
        }
    }
 
    // Driver Function
    public static void main(String args[])
    {
        int n = 5;
        printStars(n);
    }
}


           * 
         * * 
       * * * 
     * * * * 
   * * * * * 



