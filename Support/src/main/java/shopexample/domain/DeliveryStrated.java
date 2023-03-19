package shopexample.domain;

import java.util.*;
import lombok.*;
import shopexample.domain.*;
import shopexample.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStrated extends AbstractEvent {

    private Long id;

    public DeliveryStrated(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStrated() {
        super();
    }
}
