package com.answer;

import com.answer.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootJpaRedisApplicationTests {

	@Autowired
	RedisDao redisDao;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testSetAndGet() {
		redisDao.set("name" , "suchao");
		String name = redisDao.get("name");
		System.out.println(name);
	}
}

