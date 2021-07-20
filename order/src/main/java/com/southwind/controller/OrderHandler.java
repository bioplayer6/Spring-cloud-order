package com.southwind.controller;

import com.southwind.entity.Order;
import com.southwind.entity.OrderVO;
import com.southwind.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderHandler {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/save")
    public void save(@RequestBody Order order){
        order.setDate(new Date());
        orderRepository.save(order);
    }

    @GetMapping("/findAllByUId/{index}/{limit}/{uid}")
    public OrderVO findAll(@PathVariable("index") int index, @PathVariable("limit") int limit, @PathVariable("uid") long uid){
        OrderVO orderVO= new OrderVO();
        orderVO.setMsg("");
        orderVO.setCount(orderRepository.countByUId(uid));
        orderVO.setData(orderRepository.findAllByUId(index, limit, uid));
        return orderVO;
    }

    @GetMapping("/findAll/{index}/{limit}")
    public OrderVO findAllState(@PathVariable("index") int index, @PathVariable("limit") int limit){
        OrderVO orderVO=new OrderVO();
        orderVO.setMsg("");
        orderVO.setCount(orderRepository.count());
        orderVO.setData(orderRepository.findAllState(index, limit));
        return orderVO;
    }


    @PutMapping("/update/{id}")
    public void update(@PathVariable("id") long id){
        orderRepository.updateState(id);
    }
}
