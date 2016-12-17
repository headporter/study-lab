package common;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestMain {

	void processData() {
		Jedis connection = null;
		
		try {
			ObjectMapper mapper = new ObjectMapper();
	        Map<String, Object> params = null;
	        
		    List<String> lines = Files.readAllLines(Paths.get("input.txt"), Charset.forName("UTF-8"));
		    connection = new Jedis("127.0.0.1");
		    Pipeline p = connection.pipelined();
		    for(String line: lines){
		    	String[] splitValue = line.split(",");
		    	/*
		    	ObjectNode objectNode = mapper.createObjectNode();
		    	objectNode.put("bookName1", splitValue[0]);
		        objectNode.put("price1", splitValue[1]);
		        
		        p.set(splitValue[0], objectNode.toString());
		        */
		        params = new HashMap<String, Object>();
		        params.put("bookName2", splitValue[0]);
		        params.put("price2", splitValue[1]);
		        
		        p.set(splitValue[0], mapper.writeValueAsString(params));
		    }
		    p.sync();
		    
		    Map<String, Object> param1 = new HashMap<String, Object>();
		    param1.put("kk1", "vvv1");
		    param1.put("kk2", "vvv2");
		    
		    Map<String, Object> param2 = new HashMap<String, Object>();
		    param2.put("kk3", "vvv3");
		    param2.put("kk4", "vvv4");
		    
		    ArrayList<Object> array = new ArrayList<Object>();
		    array.add(param1);
		    array.add(param2);
		   
		    System.out.println(mapper.writeValueAsString(array));
		    
		    
		} catch (IOException ex) {
			ex.printStackTrace();
			
		} finally {
			connection.disconnect();
		}
	}


	public static void main(String[] args) {
		TestMain t=new TestMain();
		t.processData();
	}

}
