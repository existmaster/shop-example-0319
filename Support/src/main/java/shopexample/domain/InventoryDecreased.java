package shopexample.domain;

import java.util.*;
import lombok.*;
import shopexample.domain.*;
import shopexample.infra.AbstractEvent;

@Data
@ToString
public class InventoryDecreased extends AbstractEvent {

    private Long id;

    public InventoryDecreased(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryDecreased() {
        super();
    }
}
