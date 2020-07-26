package io.barhan.social_network.service.impl;

import io.barhan.social_network.service.NameService;
import org.springframework.stereotype.Service;

@Service
public class NameServiceImpl implements NameService {
    @Override
    public String convertName(String name) {
        return name.toUpperCase();
    }
}
