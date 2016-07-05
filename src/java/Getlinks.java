
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


@Path("Getlinks")


public class Getlinks {
     
@GET
  public String search(@QueryParam("search") String word){
 
     Links links = new Links(); 
     
    String xml=   links.search(word);
     
      return xml;
 }
 
 }
 