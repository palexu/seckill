package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by xjy on 2017/4/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)//配置spring和junit整合，让junit启动时加载springIOC容器
@ContextConfiguration({"classpath:spring/spring-dao.xml"})//告诉junit spring配置文件在哪
public class SuccessKilledDaoTest {
    @Resource
    SuccessKilledDao successKilledDao;
    @Test
    public void insertSuccessKilled() throws Exception {
        long id=1001L;
        long phone=15957180610L;
        int insertCount = successKilledDao.insertSuccessKilled(id,phone);
        System.out.println(insertCount);
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        long id=1001L;
        long phone=15957180610L;
        SuccessKilled sk=successKilledDao.queryByIdWithSeckill(id,phone);
        System.out.println(sk);
    }

}