package com.crud.test;

import java.util.List;

import redis.clients.jedis.Jedis;

public class Test {
	
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		//设置 redis 字符串数据
        jedis.set("miracle", "123456");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: "+ jedis.get("miracle"));
        jedis.lpush("site-list", "Runoob");
        jedis.lpush("site-list", "Google");
        jedis.lpush("site-list", "Taobao");
        // 获取存储的数据并输出
        List<String> list = jedis.lrange("site-list", 1 ,3);
        for(int i=0; i<list.size(); i++) {
            System.out.println("列表项为: "+list.get(i));
        }
    }

}
