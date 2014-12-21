package edu.sjsu.cmpe.cache.client;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

//import javax.security.auth.callback.Callback;

//import org.apache.http.HttpResponse;




import com.mashape.unirest.http.Headers;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
//import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.async.Callback;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Client {

	
    public static void main(String[] args) throws Exception {
    	 
    	 String valueFirst = "a", valueSecond = "b";
    	 System.out.println("Starting Cache Client...");
         
    	 
    	 System.out.println("Start of Step 1");
         
         CRDTClient crdt = new CRDTClient();
         
         
         crdt.put(1, valueFirst);
        
        
         Thread.sleep(10000);
         
         crdt.get(1);
         
         Thread.sleep(10000);
         
         
          
    	 System.out.println("End Of Step 1");
         
         
         System.out.println("Start of Step 2");
          
         crdt.update(1, valueSecond);
         Thread.sleep(10000);
         
         System.out.println("End Of Step 2");
         
         System.out.println("Start of Step 3");
         
         crdt.get(1);
         crdt.updateValues(1, valueSecond);
         Thread.sleep(3000);
         System.out.println("After any updation");
         crdt.get(1);
         System.out.println("End of Step 3");
         

        System.out.println("Existing Cache Client...");
        
    }
    
    
    

}
