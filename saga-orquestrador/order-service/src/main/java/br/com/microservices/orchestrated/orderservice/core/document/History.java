package br.com.microservices.orchestrated.orderservice.core.document;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class History {

    private String source;
    private String status;
    private String message;
    private LocalDateTime createdAt;
}
