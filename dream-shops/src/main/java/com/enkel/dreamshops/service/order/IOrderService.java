package com.enkel.dreamshops.service.order;

import com.enkel.dreamshops.dto.OrderDto;
import com.enkel.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);

    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
