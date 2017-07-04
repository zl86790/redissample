package redissample.incr.sample;

import redis.clients.jedis.Jedis;
import redissample.factory.JedisFactory;

public class IncrSample {
	public static void main(String args[]){
		Jedis jedis = JedisFactory.getJedis();
		jedis.incr("age");
		System.out.println(jedis.get("age"));
	}
}
