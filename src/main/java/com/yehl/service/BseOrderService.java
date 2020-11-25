package com.yehl.service;

import com.yehl.domain.BseOrder;
import com.yehl.repository.BseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BseOrderService {

    @Autowired
    BseOrderRepository bseOrderRepository;

    @Transactional
    public void createOrder() {
        BseOrder bseOrder = new BseOrder();
        bseOrder.setId(11);
        bseOrder.setOrderNum("order_num_11");

        bseOrderRepository.save(bseOrder);

    }


    //@Transactional(rollbackFor=Exception.class)
    @Transactional
    public void deleteOrder(int orderId) {
        bseOrderRepository.deleteById(orderId);
//        String i = null;
//        System.out.println(i.substring(2));

    }

    public BseOrder getOrderById(int id) {
        return bseOrderRepository.findById(id);
    }

}
