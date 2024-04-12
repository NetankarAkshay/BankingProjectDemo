package hotel.management.serviceProvider.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Hotel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private int capacity;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "hotel_id",referencedColumnName ="id")
    private List<Rate> rates;
    @Override
    public String toString() {
        return "Hotel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rates=" + rates +
                '}';
    }

    public List<Rate> getRates() {
        return rates;
    }


    public int getCapacity() {
        return capacity;
    }
}
