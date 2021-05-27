package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {

        String response = "hello " + name;

        System.out.println(response);

        return response;
    }

}
