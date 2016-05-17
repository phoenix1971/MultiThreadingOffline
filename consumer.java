package offline;

public class consumer implements Runnable 
{
	array A ;
	String name ;
	Thread T ;
	
	consumer( array A , String name )
	{
		this.A = A ;
		this.name = name ;
		T = new Thread( this , name ) ;
		T.start() ;
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		while(true )
		{
			try
			{
				A.consume() ;
				Thread.sleep( 1000 ) ;
			}
			catch ( Exception e )
			{
				e.printStackTrace();
			}
		}
		
		
	}
	
	

}
