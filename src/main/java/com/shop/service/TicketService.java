package com.shop.service;

import com.shop.model.Product;
import com.shop.model.Ticket;

import java.util.List;


public interface TicketService {

    //根据cid获取ticket对象
    public Integer findTicketByCid(Integer cid);

}
