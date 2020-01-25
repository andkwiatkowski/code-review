package pl.unityt.codereview.brand.domain;

import pl.unityt.codereview.car.domain.Car;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Car> cars;
}
