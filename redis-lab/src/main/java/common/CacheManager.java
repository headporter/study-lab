package common;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class CacheManager {
	JedisHelper helper;
	
	public CacheManager(JedisHelper helper) {
		this.helper = helper;
	}

	public void addHash() {

        String key = "javapointers";
        Map<String, String> map = new HashMap<>();
        map.put("name", "Java Pointers");
        map.put("domain", "www.javapointers.com");
        map.put("description", "Learn how to program in Java");
 
        Jedis jedis = helper.getConnection();
        try {
            jedis.hmset(key, map);
 
            Map<String, String> retrieveMap = jedis.hgetAll(key);
            for (String keyMap : retrieveMap.keySet()) {
                System.out.println(keyMap + " " + retrieveMap.get(keyMap));
            }
 
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
    }
}
