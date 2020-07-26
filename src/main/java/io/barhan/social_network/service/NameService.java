package io.barhan.social_network.service;

import org.springframework.stereotype.Service;

@Service
public interface NameService {
    String convertName(String name);
}
