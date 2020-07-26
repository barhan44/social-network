package io.barhan.social_network.service.impl;

import static org.junit.Assert.assertEquals;

import io.barhan.social_network.service.NameService;
import org.junit.Before;
import org.junit.Test;

public class NameServiceImplTest {
    private NameService nameService;

    @Before
    public void before() {
        this.nameService = new NameServiceImpl();
    }

    @Test
    public void testConvertName() {
        assertEquals("SOME-NAME", this.nameService.convertName("soMe-NAME"));
    }
}
