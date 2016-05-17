package offline;

public class Multithreading1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        array A = new array() ;
        
        new producer( A , "producer1" ) ;
//        new producer( A , "producer2" ) ;

        new consumer( A , "consumer1" ) ;
//        new consumer( A , "consumer2" ) ;
//        new consumer( A , "consumer3" ) ;
        
	}

}
