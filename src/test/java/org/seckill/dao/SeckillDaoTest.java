package org.seckill.dao;

import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by xjy on 2017/4/21.
 */


@RunWith(SpringJUnit4ClassRunner.class)//配置spring和junit整合，让junit启动时加载springIOC容器
@ContextConfiguration({"classpath:spring/spring-dao.xml"})//告诉junit spring配置文件在哪
public class SeckillDaoTest {
    @Resource
    private SeckillDao seckillDao;

    @org.junit.Test
    public void reduceNumber() throws Exception {
        Date killTime = new Date();
        int updateCount=seckillDao.reduceNumber(1000L,killTime);
        System.out.println(updateCount);
    }

    @org.junit.Test
    public void queryById() throws Exception {
        long id=1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @org.junit.Test
    public void queryAll() throws Exception {
        List<Seckill> seckills=seckillDao.queryAll(0,100);
        for(Seckill s:seckills){
            System.out.println(s);
        }
    }

}