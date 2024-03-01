package com.sergon.orderservice.dto;

import com.sergon.orderservice.model.OrderLineItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest
{
    private List<OrderLineItemDto> orderLineItemDtoList;
}
