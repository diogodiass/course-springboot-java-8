package com.diogoamorim.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diogoamorim.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
