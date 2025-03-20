package br.com.microservices.orchestrated.orderservice.core.dto;

import br.com.microservices.orchestrated.orderservice.core.document.OrderProducts;
import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

    private List<OrderProducts> products;
}
