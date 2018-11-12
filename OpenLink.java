package ashish;

import java.awt.*;
import java.net.*;
public class OpenLink{

 public static void main(String []args){
       String a = "https://www.firstpost.com/shows/9-months/9-months-season-3-toddler-schooling-part-2-5394261.html";
      
  try{
         
    openWebpage(a);
     }
  catch (Exception e){
      e.printStackTrace();
      }
}
     
  public static void openWebpage(String urlString) {
     try {
       Desktop.getDesktop().browse(new URL(urlString).toURI());
    	  } catch (Exception e) {
    	        e.printStackTrace();
    	    }
    	}
}
