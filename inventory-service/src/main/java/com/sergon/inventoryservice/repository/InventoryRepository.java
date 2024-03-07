package com.sergon.inventoryservice.repository;

import com.sergon.inventoryservice.model.Inventory;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long>
{
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
