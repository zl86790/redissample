package redissample.string.sample;

import redis.clients.jedis.Jedis;
import redissample.factory.JedisFactory;

public class StringSample {
	public static void main(String args[]){
		Jedis jedis = JedisFactory.getJedis();
		jedis.set("message", "hello world");
		String message = jedis.get("message");
		System.out.println(message);
		jedis.del("message");
		System.out.println(jedis.get("message"));
	}
}
