package common;

public class TestMain2 {

    public static void main(String[] args){
    	JedisHelper helper = JedisHelper.getInstance();
    	CacheManager manger = new CacheManager(helper);

    	manger.addHash();
    }

}

