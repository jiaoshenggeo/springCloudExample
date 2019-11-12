package fcs.serverprovider.controller;

import org.springframework.boot.actuate.health.CompositeHealthIndicator;
import org.springframework.boot.actuate.health.HealthAggregator;
import org.springframework.boot.actuate.health.HealthIndicatorRegistry;

public class Test {
    public static void main(String[] args) {
        HealthAggregator healthAggregator=null;
        HealthIndicatorRegistry registry=null;
        new CompositeHealthIndicator(healthAggregator,registry);
        //new CompositeHealthIndicator();
    }
}
