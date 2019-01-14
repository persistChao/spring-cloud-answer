package com.answer.redis;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.google.common.base.Optional;
import org.junit.Test;


/**
 * @descreption
 * @Author answer
 * @Date 2019/1/14 18 45
 */
public class TestGuava {
    private static Log log = LogFactory.get();
    @Test
    public void testA() {
        Integer a =  null;
        Integer b =  new Integer(10);

        log.info("变量a={}" , a);
        System.out.println(sum(a,b));
    }

    @Test
    public void testGuavaA() {
        Integer invalidInput = null;
        Optional<Integer> a = Optional.of(invalidInput);
        Optional<Integer> b = Optional.of(10);
        System.out.println(sumG(a , b ));
    }

    public Integer sum(Integer a, Integer b){
        return a + b;
    }

    public Integer sumG(Optional<Integer> a , Optional<Integer> b){
        return a.get() + b.get();
    }
}
