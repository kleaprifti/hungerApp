package com.hunger.app.model.db;

import lombok.*;

import javax.persistence.*;
@Entity
@Table(name = "Client_Order")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Integer id;
    @Column(unique = true)
    private String name;
  @Column(unique = true)
 private String description;

}

