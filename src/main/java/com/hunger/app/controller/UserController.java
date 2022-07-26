package com.hunger.app.controller;

import com.hunger.app.model.db.Menu;
import com.hunger.app.model.db.Restaurant;
import com.hunger.app.service.ClientService;
import com.hunger.app.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.Order;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/restaurants", method = RequestMethod.GET)
    @PreAuthorize("hasRole('USER')")
    public List<Restaurant> getAllRestaurants() { return clientService.getAllRestaurants();
    }

    @RequestMapping(value = "/order/create", method = RequestMethod.POST)
    @PreAuthorize("hasRole('USER')")
    public Order createOrder(@RequestBody Order order) {
        return clientService.createOrder(order);
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    @PreAuthorize("hasRole('USER')")
    public List<Order> getAllOrders() {
        return clientService.getAllOrders();
    }
    }


