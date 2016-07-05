
import com.gargoylesoftware.htmlunit.xml.XmlPage;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.QueryParam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sparcol
 */



@Path("RestService")


public class RestService {
 

 @GET
    
    
    
    
    
 public XmlPage searchs(@QueryParam("search") String word){
 
     
     
     Links links = new Links(); 
     
    // XmlPage xml=   links.search(word);
     
     
     
     
     
     
 return null;
 }
 
    
    
    
}
