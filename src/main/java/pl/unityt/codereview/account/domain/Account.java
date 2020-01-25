package pl.unityt.codereview.account.domain;

import lombok.Getter;
import lombok.Setter;
import pl.unityt.codereview.reservation.domain.Reservation;
import pl.unityt.codereview.user.domain.User;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private BigDecimal cash;

    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private User user;
    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Reservation> reservations;


}
