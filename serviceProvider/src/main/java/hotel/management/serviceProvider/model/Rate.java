package hotel.management.serviceProvider.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double weekdayRate;
    private double weekendRate;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    public double getWeekdayRate() {
        return weekdayRate;

    }

    public double getWeekendRate() {
        return weekdayRate;
    }


}
