package shopexample.domain;

import java.util.*;
import lombok.*;
import shopexample.domain.*;
import shopexample.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerId;
    private String productId;
    private String qty;
    private Double price;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
