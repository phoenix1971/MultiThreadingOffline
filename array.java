package offline;


public class array
{
	private int []a ;
	private int size ;
	
	array()
	{
		a = new int[20] ;
		size = 0 ;
	}
	
	public synchronized  void consume()
	{
		if( size == 0 )
		{
			try {
				wait() ;
				return ;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() +"  consuming value is " + a[--size]  ) ;
		notify() ;
	}
	
	public synchronized  void produce( int x )
	{
		if( size == 20 )
		{
			try {
				wait() ;
				return ;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		a[size] = x ;
		System.out.println(Thread.currentThread().getName() +"   producing value is " + a[size++]  ) ;
		notify() ;
	}
	

}
