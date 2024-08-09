package com.example.ex15_mybatis.jdbc;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.BeanPropertyRowMapper;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.stereotype.Repository;

@Mapper
public interface MyUserDAO {
    List<MyUserDTO> list();    
}