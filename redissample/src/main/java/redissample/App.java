package redissample;

import redis.clients.jedis.Jedis;

public class App {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("172.28.128.4");
        jedis.auth("test12345");
        System.out.println("ping...");
        System.out.println("result: "+jedis.ping());
    }
}