package abc.domain;

import abc.domain.*;
import abc.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeadlineReached extends AbstractEvent {

    private Long id;
    private Date deadline;
    private Long orderId;
    private Date startedTime;

    public DeadlineReached(Deadline aggregate) {
        super(aggregate);
    }

    public DeadlineReached() {
        super();
    }
}
//>>> DDD / Domain Event
