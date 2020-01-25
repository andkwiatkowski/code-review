package pl.unityt.codereview.car.domain;

import lombok.Getter;
import pl.unityt.codereview.brand.domain.Brand;
import pl.unityt.codereview.reservation.domain.Reservation;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private BigDecimal pricePerDay;
    private BigDecimal penaltyPerDay;
    private boolean damaged;

    @ManyToOne(fetch = FetchType.LAZY)
    private Brand brand;
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Reservation> reservations;

}
