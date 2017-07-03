package redissample.set.sample;

import redis.clients.jedis.Jedis;
import redissample.factory.JedisFactory;

public class SetSample {
	public static void main(String args[]){
		Jedis jedis = JedisFactory.getJedis();
		jedis.sadd("testsets", "hello");
		System.out.println(jedis.smembers("testsets"));
		
		jedis.sadd("testsets", "world");
		System.out.println(jedis.smembers("testsets"));
		
		jedis.srem("testsets", "hello");
		System.out.println(jedis.smembers("testsets"));
		
	}
}
