package com.example.onlibrary.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface BookRepository {

    @Select("SELECT id, title FROM book")
    List<HashMap> findAll();
}
