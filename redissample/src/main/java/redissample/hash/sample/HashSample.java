package redissample.hash.sample;

import redis.clients.jedis.Jedis;
import redissample.factory.JedisFactory;

public class HashSample {
	public static void main(String args[]){
		Jedis jedis = JedisFactory.getJedis();
		jedis.hset("message", "1", "hello");
		jedis.hset("message", "2", "world");
		
		System.out.println(jedis.hget("message", "1"));
		System.out.println(jedis.hgetAll("message"));
	}
}
