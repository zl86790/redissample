package redissample;

import redis.clients.jedis.Jedis;

public class App {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.1.10");
        System.out.println("���ӳɹ�");
        System.out.println("������������: "+jedis.ping());
    }
}