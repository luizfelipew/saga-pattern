package br.com.microservices.orchestrated.inventoryservice.core.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String productCode;

    @Column(nullable = false)
    private Integer available;
}
