package hotel.management.serviceProvider.service;

import hotel.management.serviceProvider.dao.HoltelDAO;
import hotel.management.serviceProvider.dao.HotelDAOImpl;
import hotel.management.serviceProvider.model.Hotel;
import hotel.management.serviceProvider.model.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

@Service
public class HotelServiceImpl implements  HotelService{

    @Autowired
    private HoltelDAO holtelDAO;

    @Override
    public List<Hotel> getAllHotels() {
        return holtelDAO.getAllHotels();
    }

    @Override
    public double getCheapestRate(String startDate, String endDate, int numberOfGuests) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);

        long weekendDays = calculateWeekendDays(start,end);

        List<Hotel>hotels = holtelDAO.getAllHotels();
        double cheapestRate = Double.MAX_VALUE;

        for(Hotel hotel: hotels){
            for(Rate rate: hotel.getRates()){
                double totalRate = (rate.getWeekdayRate() * (end.toEpochDay()-start.toEpochDay()-weekendDays))
                        +(rate.getWeekdayRate()*weekendDays);

                if(totalRate < cheapestRate && numberOfGuests <= hotel.getCapacity()){
                    cheapestRate = totalRate;

                }

            }
        }

        return cheapestRate;
    }
    private long calculateWeekendDays(LocalDate start, LocalDate end){
        long weekendDays = 0;
        for(LocalDate date = start; date.isBefore(end.plusDays(1)); date =date.plusDays(1)) {
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                weekendDays++;
            }
        }
        return weekendDays;
    }


}
