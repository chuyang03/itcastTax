package cn.shu.test.service;

import cn.shu.test.entity.Person;

import java.io.Serializable;

public interface TestService {

    public void say();

    public void save(Person person);

    public Person findPerson(Serializable id);
}
