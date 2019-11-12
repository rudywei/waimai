package com.woniu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.domain.Orders;
import com.woniu.service.IOrderService;


@RestController
@RequestMapping("orders")
public class OrdersController {
	@Autowired
	private IOrderService os;

	// 添加菜品
	@PostMapping
	public void test(@RequestBody Orders o) {	
		os.save(o);
	
	}
	
	// 删除   
	@DeleteMapping("{oid}")   
	public void delete(@PathVariable Integer oid) {
		os.delete(oid);
	}

	// 查询所有
	@GetMapping
	public List<Orders> findAll() {
		return os.findAll();
	}

	// 修改
	@PutMapping
	public void update(@RequestBody Orders o) {
		os.update(o);
	}

}