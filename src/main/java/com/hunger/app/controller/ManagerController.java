package com.hunger.app.controller;

import com.hunger.app.model.db.Menu;
import com.hunger.app.model.db.User;
import com.hunger.app.service.MenuService;
import com.hunger.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/manager")
public class ManagerController {
    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/menus", method = RequestMethod.GET)
    @PreAuthorize("hasRole('MANAGER')")
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    @RequestMapping(value = "/menu/create", method = RequestMethod.POST)
    @PreAuthorize("hasRole('MANAGER')")
    public Menu createMenu(@RequestBody Menu menu) {
        return menuService.createMenu(menu);
    }

    @RequestMapping(value = "/menu/delete/{id}", method = RequestMethod.DELETE)
    @PreAuthorize("hasRole('MANAGER')")
    public void deleteMenu(@PathVariable Integer id) {
        menuService.deleteMenu(id);
    }

    @RequestMapping(value = "/menu/modify/", method = RequestMethod.PUT)
    @PreAuthorize("hasRole('MANAGER')")
    public Menu modifyMenu(@RequestBody Menu menu) throws Exception {
        return menuService.modifyMenu(menu);
    }

}


