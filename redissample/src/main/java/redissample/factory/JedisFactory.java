package redissample.factory;

import redis.clients.jedis.Jedis;

public class JedisFactory {
	public static Jedis getJedis(){
		Jedis jedis = new Jedis("172.28.128.4");
        jedis.auth("test12345");
        return jedis;
	}
	
}
