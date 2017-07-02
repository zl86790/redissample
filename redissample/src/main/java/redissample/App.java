package redissample;

import redis.clients.jedis.Jedis;

public class App {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.1.10");
        System.out.println("连接成功");
        System.out.println("服务正在运行: "+jedis.ping());
    }
}