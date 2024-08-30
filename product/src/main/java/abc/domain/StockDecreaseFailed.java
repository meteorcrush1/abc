package abc.domain;

import abc.domain.*;
import abc.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class StockDecreaseFailed extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImage;
    private Integer stock;

    public StockDecreaseFailed(Inventory aggregate) {
        super(aggregate);
    }

    public StockDecreaseFailed() {
        super();
    }
}
//>>> DDD / Domain Event
