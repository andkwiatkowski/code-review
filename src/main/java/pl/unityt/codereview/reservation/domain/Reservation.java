package pl.unityt.codereview.reservation.domain;

import lombok.Getter;
import lombok.Setter;
import pl.unityt.codereview.account.domain.Account;
import pl.unityt.codereview.car.domain.Car;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime reservedAt;
    private LocalDateTime reservedFrom;
    private LocalDateTime reservedTo;

    private LocalDateTime receivedAt;
    private LocalDateTime returnedAt;

    private boolean collision;
    private BigDecimal repairCost;

    @ManyToOne(fetch = FetchType.LAZY)
    private Account account;
    @ManyToOne(fetch = FetchType.LAZY)
    private Car car;

}
