package redissample.muti.sample;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;
import redissample.factory.JedisFactory;

public class MutiSample {
	public static void main(String args[]){
		Jedis jedis = JedisFactory.getJedis();
		Transaction tx = jedis.multi(); 
		tx.set("message", "hello world");
		Response<String> message = tx.get("message");
		System.out.println(message);
		List<Object> results = tx.exec(); 
		System.out.println(jedis.get("message"));
		jedis.disconnect();
	}
}
