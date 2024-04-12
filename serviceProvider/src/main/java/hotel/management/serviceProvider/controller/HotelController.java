package hotel.management.serviceProvider.controller;

import hotel.management.serviceProvider.model.Hotel;
import hotel.management.serviceProvider.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/hotels")
    public List<Hotel> getAllHotels(){
        return hotelService.getAllHotels();
    }

    @GetMapping("/cheapest-rate")
    public double getCheapestRate(@RequestParam String startDate, @RequestParam String endDate,
                                  @RequestParam int numberOfGuests){
        return hotelService.getCheapestRate(startDate, endDate, numberOfGuests);

    }



}
