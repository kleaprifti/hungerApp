package com.hunger.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.Order;
@Repository
@NoRepositoryBean
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
