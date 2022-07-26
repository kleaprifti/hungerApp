package com.hunger.app.repository;

import com.hunger.app.model.db.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer> {

}
