package ru.courseworkdt.elib.converters.dto;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.courseworkdt.elib.Model.Order;
import ru.courseworkdt.elib.dto.OrderDto;

@Component
public class OrderDtoConverter implements Converter<Order, OrderDto> {
    @Override
    public OrderDto convert(Order order) {
        OrderDto orderDto = new OrderDto();
        orderDto.setId(order.getId());
        orderDto.setDate(order.getDate());
        return orderDto;
    }
}
