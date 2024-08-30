package abc.domain;

import abc.DeadlineApplication;
import abc.domain.DeadlineReached;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Deadline_table")
@Data
//<<< DDD / Aggregate Root
public class Deadline {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date deadline;

    private Long orderId;

    private Date startedTime;

    @PostPersist
    public void onPostPersist() {
        DeadlineReached deadlineReached = new DeadlineReached(this);
        deadlineReached.publishAfterCommit();
    }

    public static DeadlineRepository repository() {
        DeadlineRepository deadlineRepository = DeadlineApplication.applicationContext.getBean(
            DeadlineRepository.class
        );
        return deadlineRepository;
    }

    //<<< Clean Arch / Port Method
    public static void schedule(OrderCreated orderCreated) {
        //implement business logic here:

        /** Example 1:  new item 
        Deadline deadline = new Deadline();
        repository().save(deadline);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCreated.get???()).ifPresent(deadline->{
            
            deadline // do something
            repository().save(deadline);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
