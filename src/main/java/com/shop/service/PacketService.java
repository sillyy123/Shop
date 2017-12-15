package com.shop.service;

import com.shop.model.Packet;
import org.springframework.transaction.annotation.Transactional;



public interface PacketService {

    //根据uid获取packet对象
    public Integer findPacketByUid(Integer uid);
}
