package com.java.userservice;

import com.data.provider.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private ProviderClient providerClient;


    @GetMapping("/{id}")
    public List<Provider> getProviders(@PathVariable("id") Integer id) {
        return providerClient.providers();
    }


}

