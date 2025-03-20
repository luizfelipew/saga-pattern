package br.com.microservices.orchestrated.orderservice.core.document;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderProducts {

    private Product product;
    private int quantity;
}
