package org.example.jim;

import org.example.service.Service;

public class JimProvider implements Service {
    @Override
    public void go() {
        System.out.println("We go jiiiim!!!!");
    }
}