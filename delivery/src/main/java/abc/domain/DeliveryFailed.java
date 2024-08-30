package abc.domain;

import abc.domain.*;
import abc.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryFailed extends AbstractEvent {

    private String orderId;
    private String productId;
    private String productName;
    private Integer qty;
    private String customerId;
    private String address;
    private String status;

    public DeliveryFailed(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryFailed() {
        super();
    }
}
//>>> DDD / Domain Event
