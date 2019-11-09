package com.data.provider;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataCreator {

    public static List<Provider> providers() {
        List<Provider> providers = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            Provider provider = new Provider(1, "Provider" + i, new Date(), Boolean.TRUE, 1);
            providers.add(provider);
        }
        return providers;
    }

    public static List<User> users() {
        List<User> users = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            User user = new User(1, "Test" + i, "Test" + i);
            users.add(user);
        }
        return users;
    }

}
