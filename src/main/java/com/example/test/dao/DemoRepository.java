package com.example.test.dao;

import com.example.test.entity.Demo;
import org.springframework.data.repository.CrudRepository;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-02-25 15:58
 **/
public interface DemoRepository extends CrudRepository<Demo, Long> {


}
