package br.com.microservices.orchestrated.orderservice.core.document;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String code;
    private double unitValue;
}
