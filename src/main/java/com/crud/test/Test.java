package com.crud.test;

import java.util.List;

import redis.clients.jedis.Jedis;

public class Test {
	
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		//���� redis �ַ�������
        jedis.set("miracle", "123456");
        // ��ȡ�洢�����ݲ����
        System.out.println("redis �洢���ַ���Ϊ: "+ jedis.get("miracle"));
        jedis.lpush("site-list", "Runoob");
        jedis.lpush("site-list", "Google");
        jedis.lpush("site-list", "Taobao");
        // ��ȡ�洢�����ݲ����
        List<String> list = jedis.lrange("site-list", 1 ,3);
        for(int i=0; i<list.size(); i++) {
            System.out.println("�б���Ϊ: "+list.get(i));
        }
    }

}
