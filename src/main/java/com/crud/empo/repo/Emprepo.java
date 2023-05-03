package com.crud.empo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.empo.entity.Emp;
@Repository                                          // emp and id
public interface Emprepo extends JpaRepository<Emp ,Integer >{

}
