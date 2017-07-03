package redissample.list.sample;

import redis.clients.jedis.Jedis;
import redissample.factory.JedisFactory;

public class ListSample {
	public static void main(String args[]){
		Jedis jedis = JedisFactory.getJedis();
		jedis.rpush("messages", "hello");
		System.out.println(jedis.llen("messages"));
		
		jedis.rpush("messages", "world");
		System.out.println(jedis.llen("messages"));
		
		System.out.println(jedis.rpop("messages"));
		System.out.println(jedis.rpop("messages"));
		
	}
}
