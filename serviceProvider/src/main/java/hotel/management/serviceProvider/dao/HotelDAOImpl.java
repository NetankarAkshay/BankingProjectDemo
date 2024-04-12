package hotel.management.serviceProvider.dao;

import hotel.management.serviceProvider.model.Hotel;
import hotel.management.serviceProvider.model.Rate;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HotelDAOImpl implements HoltelDAO{
    @PersistenceContext
    private EntityManager entityManager;


    public List<Hotel> getAllHotels() {
        List<Hotel> hotels = new ArrayList<>();
        return entityManager.createQuery("SELECT h from Hotek h",Hotel.class).getResultList();
    }

}
