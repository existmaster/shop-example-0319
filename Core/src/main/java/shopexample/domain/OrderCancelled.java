package shopexample.domain;

import java.util.*;
import lombok.*;
import shopexample.domain.*;
import shopexample.infra.AbstractEvent;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;

    public OrderCancelled(Order aggregate) {
        super(aggregate);
    }

    public OrderCancelled() {
        super();
    }
}
