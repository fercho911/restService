
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import java.io.IOException;


public class Links {
    
    
   public String search(String word){
    
     
       HtmlPage html=null;
       String formtext=null;
       String inputastext= null;
       String value = null;
       DomElement dom= null;
       DomNode dom1= null;
       DomElement dom222 =null;
       
       
       
       
        try{
        
            
        //abrir el explorador   
         final WebClient webClient = new WebClient();
        // abrir la pagina de google
         html = webClient.getPage("https://www.google.com.co/");
         //obtener el formulario de busqueda escribir la palabra que se quiere buscar y enviar el formulario     
         HtmlForm form= html.getForms().get(0);
         HtmlTextInput input  = form.getInputByName("q");
         input.setValueAttribute(word);
         value = input.getAttribute("value");
         HtmlSubmitInput submit = form.getInputByName("btnK");
         html = submit.click();
        //obtener los enlaces          
         dom = html.getElementById("rso");
         dom222 =  html.getFirstByXPath("//div[@class='srg']");
         value = dom222.asXml();     

        
           
   }catch(IOException  e ){}
   
        
        return value;
 } 
    
    
    
}
