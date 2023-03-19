package shopexample.domain;

import java.util.*;
import lombok.*;
import shopexample.domain.*;
import shopexample.infra.AbstractEvent;

@Data
@ToString
public class InventoryIncreased extends AbstractEvent {

    private Long id;

    public InventoryIncreased(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryIncreased() {
        super();
    }
}
