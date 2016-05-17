package offline;

import java.util.Random;

public class producer implements Runnable
{
	array A ;
	String name ;
	Thread T ;
	
	producer( array A , String name )
	{
		this.A = A ;
		this.name = name ;
		T = new Thread( this , name ) ;
		T.start() ;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true )
		{
			try
			{
				A.produce( new Random() .nextInt(100) ) ;
				Thread.sleep( 500 ) ;
			}
			catch ( Exception e )
			{
				e.printStackTrace();
			}
		}
		
	}

}
