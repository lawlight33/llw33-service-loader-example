package org.example.runner;

import org.example.service.Service;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<Service> serviceProviders = ServiceLoader.load(Service.class);
        if (serviceProviders.stream().findAny().isEmpty()) {
            System.out.println("WARN no service providers found in classpath");
            return;
        }
        for (Service serviceProvider : serviceProviders) {
            System.out.printf("[%s] ", serviceProvider.getClass().getSimpleName());
            serviceProvider.go();
        }
    }
}