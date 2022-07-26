package com.hunger.app.service;

import com.hunger.app.model.db.Menu;
import com.hunger.app.model.db.User;
import com.hunger.app.repository.MenuRepository;
import com.hunger.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    public Menu createMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    public void deleteMenu(Integer id) {
        menuRepository.deleteById(id);
    }

    public Menu modifyMenu(Menu menu) throws Exception {
        if (menu.getId() == null) {
            throw new Exception("Menu ID cannot be null");
        }

        menuRepository.findById(menu.getId())
                .ifPresent(u -> menuRepository.save(menu));

        return menu;
    }
}
