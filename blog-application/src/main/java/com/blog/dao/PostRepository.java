package com.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entities.Blogpost;

public interface PostRepository extends JpaRepository<Blogpost,	Integer> {

}
