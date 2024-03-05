package com.sergon.ordersservice.repository;

import com.sergon.ordersservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>
{
}
