package com.example.course.services;

import com.example.course.entities.Order;
import com.example.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository respository;

    public List<Order> findAll() {
        return respository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = respository.findById(id);
        return obj.get();
    }
}
