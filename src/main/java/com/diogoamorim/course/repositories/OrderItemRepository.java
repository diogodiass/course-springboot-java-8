package com.diogoamorim.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diogoamorim.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
