package com.hunger.app.model.db;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Data
@Getter
@Setter
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Integer id;
    @Column(unique = true)
    private String name;
    @Column(unique = true)
    private String description;
    @Column(unique = true)
    private int price;
}
