
	/*
	 * To change this template, choose Tools | Templates
	 * and open the template in the editor.
	 */
	

	import java.util.logging.Level;
	import java.util.logging.Logger;
	import javax.swing.JLabel;

	/**
	 *
	 * @author harshal
	 */
	public class displaytransition extends Thread{
	    
	    String s;
	    JLabel label;
	    displaytransition(String s,JLabel label)
	    {
	        this.s=s;
	        this.label=label;
	        start();
	    }
	    
	   
	    @Override
	    public void run()
	    {
	        label.setText(s);
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException ex) {
	            Logger.getLogger(displaytransition.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        while(true){
	          label.setText(s);
	         String s1=s.substring(1);
	         char s2=s.charAt(0);
	         s=s1+s2;
	         
	                              try
	                               {
	                                     Thread.sleep(500);
	                               }catch(Exception e){
	             
	                                     System.out.println("transition Exception");
	                                }
	        }
	    
	    }   
	

}
