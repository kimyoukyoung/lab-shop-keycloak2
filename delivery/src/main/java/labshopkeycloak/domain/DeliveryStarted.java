package labshopkeycloak.domain;

import java.util.*;
import labshopkeycloak.domain.*;
import labshopkeycloak.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String address;
    private String customerId;
    private Integer quantity;

    public DeliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}
