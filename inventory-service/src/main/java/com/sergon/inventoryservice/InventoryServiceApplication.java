package com.sergon.inventoryservice;

import com.sergon.inventoryservice.model.Inventory;
import com.sergon.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository)
	{
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("Samsung Galaxy S23");
			inventory.setQuantity(10);

			Inventory inventoryA = new Inventory();
			inventoryA.setSkuCode("iPhone X");
			inventoryA.setQuantity(0);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventoryA);
		};
	}

}
