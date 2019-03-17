package cn.shu.test;

import cn.shu.test.entity.Person;
import cn.shu.test.service.TestService;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMerge {

    ClassPathXmlApplicationContext ctx;

    @Before
    public void loadCtx(){

        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

    }

    @Test
    public void testSpring(){

        TestService testService = (TestService) ctx.getBean("testService");

        testService.say();
    }

    @Test
    public void testHibernate(){


        SessionFactory sessionFactory = (SessionFactory) ctx.getBean("sessionFactory");

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        //往数据库库中插入数据
        session.save(new Person("人员2"));

        transaction.commit();

        session.close();
    }

    @Test
    public void testServiceAndDao(){

        TestService testService = (TestService) ctx.getBean("testService");

        testService.save(new Person("张飞"));
    }
}
