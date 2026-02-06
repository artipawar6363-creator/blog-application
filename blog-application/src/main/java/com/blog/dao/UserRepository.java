package com.blog.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.blog.entities.User;


public interface UserRepository extends JpaRepository<User,Integer> {

}
