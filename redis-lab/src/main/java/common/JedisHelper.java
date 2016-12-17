package common;

import java.io.FileInputStream;
import java.util.*;

import redis.clients.jedis.*;

public class JedisHelper {

	private static JedisHelper instance;
	private JedisPool pool;

	private JedisHelper() {
		Properties prop = new Properties();
        try {
        	prop.load(new FileInputStream("redis.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    	JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        pool = new JedisPool(jedisPoolConfig, prop.getProperty("REDIS_HOST"), Integer.parseInt(prop.getProperty("REDIS_PORT")), 5000);
	}

	public static synchronized JedisHelper getInstance () {
		if (instance == null) {
			instance = new JedisHelper();
		}
		return instance;
	}

	final public Jedis getConnection() {
		Jedis jedis = this.pool.getResource();
		return jedis;
	}
}
