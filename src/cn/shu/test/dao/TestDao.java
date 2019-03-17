package cn.shu.test.dao;

import cn.shu.test.entity.Person;

import java.io.Serializable;

public interface TestDao {

    public void save(Person person);

    public Person findPerson(Serializable id);
}
