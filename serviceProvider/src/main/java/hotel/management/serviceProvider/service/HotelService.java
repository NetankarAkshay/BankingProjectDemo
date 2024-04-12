package hotel.management.serviceProvider.service;

import hotel.management.serviceProvider.model.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> getAllHotels();

    double getCheapestRate(String startDate, String endDate, int numberOfGuests);

}


