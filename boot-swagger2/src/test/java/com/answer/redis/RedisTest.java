package com.answer.redis;

import com.answer.model.User;
import com.answer.dao.RedisDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/12 17 15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    User user;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    RedisDao redisDao;


    @Test
    public void testSetAndGet() {
        redisDao.set("name" , "suchao");
        String name = redisDao.get("name");
        System.out.println(name);
    }

    @Test
    public void  testRedis(){
        stringRedisTemplate.opsForValue().set("city", "beijing");
        Assert.assertEquals("beijing" , stringRedisTemplate.opsForValue().get("city"));
    }

    @Test
    public void testObj() {
        ValueOperations<String, User> ops = redisTemplate.opsForValue();
        ops.set("user", user);
    }

    @Test
    public void testHash() {
        HashOperations<String , String , Object> ops = redisTemplate.opsForHash();
//        ops.put("webside" , "baidu" ,"www.baidu.com");
//        ops.put("webside" , "sohu" ,"www.hohu.com");
//        ops.put("webside" , "bing" ,"www.bing.com");
//        ops.put("webside" , "google" ,"www.google.com");
        Map<String , Object> objectMap = ops.entries("webside");
        for (Map.Entry<String, Object> entry : objectMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
