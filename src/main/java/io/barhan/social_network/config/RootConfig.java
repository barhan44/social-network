package io.barhan.social_network.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "io.barhan.social_network.service.impl" })
public class RootConfig {
}
