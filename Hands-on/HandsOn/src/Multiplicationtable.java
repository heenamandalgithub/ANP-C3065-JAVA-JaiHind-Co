//WAP to print any multiplication table.use exception handling and call Thread.Sleep method

//extending Thread class
public class MultiplicationTable extends Thread 
{
	public void run()
	{
		try {
			for(int i=1;i<=10;i++) //Printing multiplication table till 10
			{
				int n=10;    // Multiplication table of 10
				int table=i*n;   // i value is starting from 1 to 10 which will multiply the variable n 1 to 10 times
				System.out.println(table);  // Printing the multiplication table
				
				//it will sleep the main method for 1 sec
				//each time the for loop will run
				Thread.sleep(1000);   
			}
		}catch(Exception e)
		{
			//catching the exception
		}
	}
	public static void main(String[] args)
	{
		MultiplicationTable t=new MultiplicationTable();  // creating instance of MultiplicationTable Class which is t and calling the constructor
		t.start();   // calling the Start method by using instance of MultiplicationTable Class

	}

}
