package com.devsuperior.dsdeliveri.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsdeliveri.dto.OrderDTO;
import com.devsuperior.dsdeliveri.services.OrderService;

@RequestMapping(value = "/orders")
@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAll(){
		List<OrderDTO> list = orderService.findAll();
		return ResponseEntity.ok().body(list);
		
	}
}