package org.example.home;

import org.example.service.Service;

public class HomeProvider implements Service {
    @Override
    public void go() {
        System.out.println("We go home");
    }
}