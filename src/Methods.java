/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JLabel;

/**
 *
 * @author harshal
 */
public class Methods {
    
  
    static int setHorizontal(String s,int i)
    {
       
         String s1=s.substring(0, 3);
         String s2=s.substring(3,6);
         String s3=s.substring(6);
        
        
        
         System.out.println(s2);
       
        if(s1.equals("XXX")||s1.equals("OOO"))
        {
            i=1;
            crossZero.winning_player=s1;
            return i;
        }
         if(s2.equals("XXX")||s2.equals("OOO"))
        {
            i=1;
            crossZero.winning_player=s2;
            return i;
        }
          if(s3.equals("XXX")||s3.equals("OOO"))
        {
            i=1;
               crossZero.winning_player=s3;
            return i;
        }
          return 0;
        
    }
    static int setVertical(String s,int i)
    {
        String s1= String.valueOf(s.charAt(0))+String.valueOf(s.charAt(3))+String.valueOf(s.charAt(6));
        String s2=String.valueOf(s.charAt(1))+String.valueOf(s.charAt(4))+String.valueOf(s.charAt(7));
        String s3=String.valueOf(s.charAt(2))+String.valueOf(s.charAt(5))+String.valueOf(s.charAt(8));
       
         if(s1.equals("XXX")||s1.equals("OOO"))
        {
            i=1;
            crossZero.winning_player=s1;
            return i;
        }
         if(s2.equals("XXX")||s2.equals("OOO"))
        {
            i=1;
            crossZero.winning_player=s2;
            return i;
        }
          if(s3.equals("XXX")||s3.equals("OOO"))
        {
            i=1;
               crossZero.winning_player=s3;
            return i;
        }
          return 0;
        
        
    }
    
     static int setCross(String s,int i)
    {
        String s1= String.valueOf(s.charAt(0))+String.valueOf(s.charAt(4))+String.valueOf(s.charAt(8));
        String s2=String.valueOf(s.charAt(2))+String.valueOf(s.charAt(4))+String.valueOf(s.charAt(6));
        
        if(s1.equals("XXX")||s1.equals("OOO"))
        {
            i=1;
            crossZero.winning_player=s1;
            return i;
        }
         if(s2.equals("XXX")||s2.equals("OOO"))
        {
            i=1;
            crossZero.winning_player=s2;
            return i;
        }
         
          return 0;
        
    }
     
    @SuppressWarnings("SleepWhileInLoop")
     static void transition(String s,JLabel label)
     {
         //while(true)
         //{
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
    //     }
         
     }
    
}
