package com.yehl.controller;

import com.yehl.domain.BseOrder;
import com.yehl.service.BseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600)
@RestController
public class BseOrderController {

    @Autowired
    BseOrderService bseOrderService;

    @RequestMapping("/testjpa")
    public BseOrder getBseOrder(@RequestParam("orderId") int orderId) {
        BseOrder bseOrder = bseOrderService.getOrderById(orderId);
        System.out.println(bseOrder.getRecord());
        return bseOrderService.getOrderById(orderId);
    }

    @RequestMapping("/deleteOrder")
    public void deleteBseOrder(@RequestParam("orderId") int orderId) {
        bseOrderService.deleteOrder(orderId);
    }

    @GetMapping("/test")
    public String test(@RequestParam("orderId") int orderId) {
        return "paramater =============> " + orderId;
    }
}
