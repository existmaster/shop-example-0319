package shopexample.domain;

import java.util.*;
import lombok.*;
import shopexample.domain.*;
import shopexample.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCancelled extends AbstractEvent {

    private Long id;

    public DeliveryCancelled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCancelled() {
        super();
    }
}
