package Test;

public class TestForTryCatch {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<10;i++)
	     {
	    	 try
	    	 {
	    		 if(i == 0){
	    		 throw new NullPointerException();
	    		 }
	    		 System.out.println(i);
	    	 }catch (Exception e)
	    	 {
	    		 e.printStackTrace(); 
	    	 }
	    	 
	     }*/
		
		
	    	 try
	    	 {
	    		 for(int i=0;i<10;i++)
	    	     {
		    		 if(i == 0){
		    		 throw new NullPointerException();
		    		 }
		    	     
		    		 System.out.println(i);
	    	     }
	    	 }catch (Exception e)
	    	 {
	    		 e.printStackTrace(); 
	    	 }
	    	 
	    
	}

}
