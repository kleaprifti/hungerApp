package com.hunger.app.service;

import com.hunger.app.model.db.Client;
import com.hunger.app.model.db.Menu;
import com.hunger.app.model.db.Restaurant;
import com.hunger.app.repository.ClientRepository;
import com.hunger.app.repository.MenuRepository;
import com.hunger.app.repository.OrderRepository;
import com.hunger.app.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Order;
import java.util.List;
@Service
public class ClientService {
    @Autowired
   // private ClientRepository clientRepository;
    private RestaurantRepository restaurantRepository;
    private OrderRepository orderRepository;

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }


}
