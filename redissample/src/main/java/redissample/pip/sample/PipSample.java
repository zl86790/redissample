package redissample.pip.sample;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.Response;
import redissample.factory.JedisFactory;

public class PipSample {
	public static void main(String args[]){
		Jedis jedis = JedisFactory.getJedis();
		Pipeline pipeline = jedis.pipelined();
		pipeline.set("message", "hello world");
		Response<String> message = pipeline.get("message");
		System.out.println(message);
		List<Object> results = pipeline.syncAndReturnAll();
		System.out.println(jedis.get("message"));
		System.out.println(results);
		jedis.disconnect();
	}
}
