package com.nep.onlinelesson.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.nep.onlinelesson.model.Employee;

@Transactional
public interface EmployeeRepository extends CrudRepository <Employee,Integer> {

}
