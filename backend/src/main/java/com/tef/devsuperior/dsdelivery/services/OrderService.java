package com.tef.devsuperior.dsdelivery.services;

import com.tef.devsuperior.dsdelivery.dto.OrderDTO;
import com.tef.devsuperior.dsdelivery.dto.ProductDTO;
import com.tef.devsuperior.dsdelivery.entity.Order;
import com.tef.devsuperior.dsdelivery.entity.OrderStatus;
import com.tef.devsuperior.dsdelivery.entity.Product;
import com.tef.devsuperior.dsdelivery.repositories.OrderRepository;
import com.tef.devsuperior.dsdelivery.repositories.ProductRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public List<OrderDTO> findAll() {
        List<Order> list = orderRepository.findOrdersWithProducts();
        return list.stream().map(OrderDTO::new).collect(Collectors.toList());
    }

    @Transactional
    public OrderDTO insert(OrderDTO dto) {
        Order order = new Order(null, dto.getAddress(), dto.getLatitude(),
                dto.getLongitude(), Instant.now(), OrderStatus.PENDING);

        for (ProductDTO productDTO : dto.getProducts()) {
            Product product = productRepository.getOne(productDTO.getId());
            order.getProducts().add(product);
        }

        order = orderRepository.save(order);

        return new OrderDTO(order);
    }

    @Transactional
    public OrderDTO setDelivered(Long id) {

        Order order = orderRepository.getOne(id);
        order.setStatus(OrderStatus.DELIVERED);
        order = orderRepository.save(order);

        return new OrderDTO(order);
    }

}
