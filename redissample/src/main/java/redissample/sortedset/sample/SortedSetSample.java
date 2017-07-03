package redissample.sortedset.sample;

import redis.clients.jedis.Jedis;
import redissample.factory.JedisFactory;

public class SortedSetSample {
	public static void main(String args[]){
		Jedis jedis = JedisFactory.getJedis();
		jedis.zadd("testsortedsets", 0, "hello");
		System.out.println(jedis.zrangeByScore("testsortedsets", 0, 10));
		
		jedis.zadd("testsortedsets", 1, "world");
		System.out.println(jedis.zrangeByScore("testsortedsets", 0, 10));
		
		jedis.zrem("testsortedsets", "hello");
		System.out.println(jedis.zrangeByScore("testsortedsets", 0, 10));
		
	}
}
