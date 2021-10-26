package threads;

public class Test extends Thread{

	 public void run(){    
		  for(int i=1;i<5;i++){   
		  // the thread will sleep for the 500 milli seconds   
		    try{Thread.sleep(3000);}catch(InterruptedException e){System.out.println(e);}    
		    System.out.println(i);    
		  }    
		 }    
		 public static void main(String args[]){    
		  Test t1=new Test();    
		  Test t2=new Test();    
		     
		  t1.start();    
		  t2.start();    
		 }    
		    
}
