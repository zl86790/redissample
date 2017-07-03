package redissample.expire.sample;

import redis.clients.jedis.Jedis;
import redissample.factory.JedisFactory;

public class StringSample {
	public static void main(String args[]) throws InterruptedException{
		Jedis jedis = JedisFactory.getJedis();
		jedis.set("message", "hello world");
		jedis.expire("message", 2);
		String message = jedis.get("message");
		System.out.println(message);
		Thread.sleep(3000);
		System.out.println(jedis.get("message"));
	}
}
