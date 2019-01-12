package com.answer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

/**
 * @descreption
 * @Author answer
 * @Date 2019/1/12 17 11
 */
@Repository
public class RedisDao {
    @Autowired
    private StringRedisTemplate template;


    public void set(String key, String value) {
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key , value);
    }

    public String get(String key) {
        ValueOperations<String, String> ops = template.opsForValue();
        return ops.get(key);

    }


}
