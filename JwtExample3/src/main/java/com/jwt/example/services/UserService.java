package com.jwt.example.services;

import com.jwt.example.models.User;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Akshay Netankar","netankarakshay@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Akshay Netankar","akshaynetankar@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Akshay Netankar","akshay.netankar@ril.com"));
        store.add(new User(UUID.randomUUID().toString(),"Akshay Netankar","akshaynetankar@amdocs.com"));
    }

    public List<User>getUsers(){
        return this.store;
    }
}
