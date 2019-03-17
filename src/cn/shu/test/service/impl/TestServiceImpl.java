package cn.shu.test.service.impl;

import cn.shu.test.dao.TestDao;
import cn.shu.test.entity.Person;
import cn.shu.test.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;

@Service("testService")
public class TestServiceImpl implements TestService {

    //把dao层实例注入到这个类里面
    @Resource
    TestDao testDao;

    @Override
    public void say() {

        System.out.println("service 你好");
    }

    //保存
    @Override
    public void save(Person person) {

        testDao.save(person);
    }

    //查找
    @Override
    public Person findPerson(Serializable id) {


        return testDao.findPerson(id);
    }
}
