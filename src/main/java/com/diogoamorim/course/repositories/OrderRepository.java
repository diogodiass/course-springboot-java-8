package com.diogoamorim.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diogoamorim.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
