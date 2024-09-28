package com.enkel.dreamshops.service.order;

import com.enkel.dreamshops.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);

    Order getOrder(Long orderId);
}
