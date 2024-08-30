// src/main/java/com/example/ezshop/repository/ItemRepository.java
package com.example.ezshop.repository;

import com.example.ezshop.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
