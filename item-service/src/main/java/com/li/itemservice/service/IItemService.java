package com.li.itemservice.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.li.itemservice.domain.dto.ItemDTO;
import com.li.itemservice.domain.dto.OrderDetailDTO;
import com.li.itemservice.domain.po.Item;

import java.util.Collection;
import java.util.List;


public interface IItemService extends IService<Item> {

    void deductStock(List<OrderDetailDTO> items);

    List<ItemDTO> queryItemByIds(Collection<Long> ids);
}
