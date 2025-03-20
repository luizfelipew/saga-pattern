package br.com.microservices.orchestrated.orderservice.core.dto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EventFilters {

    private String orderId;
    private String transactionId;
}
